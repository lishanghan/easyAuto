package com.haier.testng.run;

import com.haier.config.ZdyProperty;
import com.haier.enums.ParamKeyEnum;
import com.haier.enums.StatusEnum;
import com.haier.po.Tcustomdetail;
import com.haier.po.Treport;
import com.haier.service.TreportService;
import com.haier.testng.listener.HryReporter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.testng.ITestNGListener;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.*;

/**
 * @Description: 异步运行测试, 测试运行完成后, 更新测试报告的状态
 * @Author: luqiwei
 * @Date: 2018/6/29 15:11
 */
@Slf4j
@Component
public class Runner {

    @Autowired
    ZdyProperty zdyProperty;

    @Autowired
    TreportService treportService;

    /**
     * 运行suite
     *
     * @param reportId   测试报告id
     * @param reportName 测试报告文件名称
     * @param customName 测试报告名称(一般传定制名称即可,单个case运行可传null)
     * @param xmlSuite   待测试的suite
     */
    @Async("asyncServiceExecutor")
    public void run(Integer reportId, String reportName, String customName, XmlSuite xmlSuite) {
        //构建唯一的testingId
        String testingId = UUID.randomUUID().toString().replaceAll("-", "");
        Map<String, String> map = new HashMap<>();
        map.put(ParamKeyEnum.TESTING_ID.getKey(), testingId);
        xmlSuite.setParameters(map);

        TestNG ng = new TestNG();
        ng.setUseDefaultListeners(false);
        ng.setXmlSuites(Arrays.asList(xmlSuite));
        ITestNGListener reporter = new HryReporter(zdyProperty.getReportPath(), reportName, customName);
        ng.addListener(reporter);

        ng.run();

        /**
         * 运行完成之后,更新treport状态
         */
        updateReportStatus(reportId);
    }

    @Async("asyncServiceExecutor")
    public void run(Map<String, String> params, Integer reportId, String reportName, String customName, Map<Tcustomdetail, XmlClass> sMap) {
        TestNG ng = new TestNG();
        XmlSuite suite = new XmlSuite();
        suite.setName("AutoSuite");
        if (params != null) {
            suite.setParameters(params);//这是全局的参数,预留未来可能的需求(现在并未使用 2018-07-14)
        }
        List<XmlTest> tests = new ArrayList<>();
        for (Map.Entry entry : sMap.entrySet()) {
            Tcustomdetail key = (Tcustomdetail) entry.getKey();
            XmlClass clazz = (XmlClass) entry.getValue();

            XmlTest test = new XmlTest(suite);
            test.setName(key.getClientname());
            //test.setName("test.setName 测试测试");
            test.setXmlClasses(Arrays.asList(clazz));

            tests.add(test);
        }

        suite.setTests(tests);
        ng.setXmlSuites(Arrays.asList(suite));

        ITestNGListener reporter = new HryReporter(zdyProperty.getReportPath(), reportName, customName);
        ng.addListener(reporter);
        ng.run();

        /**
         * 运行完成之后,更新treport状态
         */
        updateReportStatus(reportId);
    }

    @Async("asyncServiceExecutor")
    public void run(Map<String, String> params, Integer reportId, String reportName, List<XmlClass> xmlClasses) {

        /**
         * 运行测试用例
         */
        TestNG testNG = new TestNG();
        XmlSuite suite = new XmlSuite();
        suite.setName("AutoSuite");
        if (params != null) {
            suite.setParameters(params);
        }
        List<XmlTest> xmlTests = new ArrayList<>();
        for (XmlClass c : xmlClasses) {
            XmlTest test = new XmlTest(suite);
            test.setParameters(c.getAllParameters());
            c.setParameters(new HashMap<>());
            test.setName(c.getName().substring(c.getName().lastIndexOf(".") + 1));
            test.setClasses(Arrays.asList(c));
            xmlTests.add(test);
        }

        suite.setTests(xmlTests);

        testNG.setXmlSuites(Arrays.asList(suite));
        ITestNGListener reporter = new HryReporter(zdyProperty.getReportPath(), reportName, "单一Case验证");
        testNG.addListener(reporter);
        testNG.run();

        /**
         * 运行完成之后,更新treport状态
         */
        updateReportStatus(reportId);
    }


    public void updateReportStatus(Integer reportId) {
        Treport treport = new Treport();
        treport.setId(reportId);
        treport.setStatus(StatusEnum.TEN.getId());
        treportService.updateOne(treport);
    }
}
