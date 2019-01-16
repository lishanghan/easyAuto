package com.haier.service.impl;

import com.haier.config.ZdyProperty;
import com.haier.enums.GenReplaceKWEnum;
import com.haier.po.Ti;
import com.haier.po.Tservice;
import com.haier.service.AutocodeService;
import com.haier.service.TiService;
import com.haier.service.TserviceService;
import com.haier.util.FileUtil;
import com.haier.util.HryUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/7/25 11:26
 */
@Service
@Slf4j
public class AutocodeServiceImpl implements AutocodeService {

    private static final String HEAD = "package com.haier.testng.test;\n" +
            "\n" +
            "import com.haier.anno.SKey;\n" +
            "import com.haier.po.HryTest;\n" +
            "import com.haier.testng.base.Base;\n" +
            "import com.haier.util.HryHttpClientUtil;\n" +
            "import org.testng.annotations.Parameters;\n" +
            "import org.testng.annotations.Test;\n" +
            "\n" +
            "import static com.haier.util.AssertUtil.supperAssert;\n";


    private static final String CLASS = "@SKey(\"" + GenReplaceKWEnum.SKEY.getSample() + "\")\n" +
            "public class " + GenReplaceKWEnum.SKEY.getSample() + "DefaultTest extends Base";


    private static final String CONSTRUCTOR = "    @Parameters({\"serviceId\", \"envId\", \"caseDesigner\", \"i_c\", \"i_c_zdy\", \"testingId\"})\n" +
            "    public " + GenReplaceKWEnum.SKEY.getSample() + "DefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {\n" +
            "        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);\n" +
            "    }\n" +
            "\n";

    private static final String METHOD = "    @Test(testName = \"" + GenReplaceKWEnum.URI.getSample() + "\", dataProvider = \"provider\", description = \"" + GenReplaceKWEnum.DESC.getSample() + "\")\n" +
            "    public void " + GenReplaceKWEnum.METHOD_NAME.getSample() + "(HryTest test) {\n" +
            "        String actual = HryHttpClientUtil.send(test, this);\n" +
            "        supperAssert(actual, test);\n" +
            "    }\n\n";

    private static final String BRACE_LEFT = "{\n";
    private static final String BRACE_RIGHT = "}\n";

    @Autowired
    ZdyProperty zdyProperty;

    @Autowired
    TserviceService tserviceService;

    @Autowired
    TiService tiService;

    /*@Override
    public Map<String, String> generateBaseClass() {

        List<Tservice> tservices = tserviceService.selectByCondition(null);
        Map<String, String> ret = new HashMap<>();
        if (tservices == null || tservices.size() == 0) {
            return null;
        }
        for (Tservice tservice : tservices) {
            Ti condition = new Ti();
            condition.setServiceid(tservice.getId());
            List<Ti> tis = tiService.selectByCondition(condition);
            if (tis == null || tis.size() == 0) {
                log.warn("服务id=" + tservice.getId() + ",此服务无有效接口信息,无需生成base类");
                ret.put(tservice.getServicekey() + "(" + tservice.getId() + ")", "此服务无有效接口信息,无需生成base类");
                continue;
            }

            StringBuffer sb = new StringBuffer();
            String sKey = tservice.getServicekey();
            String className = sKey + "Base";
            sb.append(BASE_HEAD);
            sb.append(BASE_CLASS.replaceAll("\\$\\{baseClassName\\}", className)
                    .replaceAll("\\$\\{SKey\\}", sKey));
            sb.append(BRACE_LEFT);
            sb.append(BASE_CONSTRUCT.replaceAll("\\$\\{baseClassName\\}", className));
            getMethodSB(tis, sb, BASE_METHOD);
            sb.append(BRACE_RIGHT);

            String fileName = autoCodeDir + className + ".java";
            FileUtil.saveContent(sb.toString(), fileName);
            ret.put(tservice.getServicekey() + "(" + tservice.getId() + ")", fileName);
        }
        return ret;
    }

    @Override
    public Map<String, String> generateDefaultTestClass() {
        List<Tservice> tservices = tserviceService.selectByCondition(null);
        Map<String, String> ret = new HashMap<>();
        if (tservices == null || tservices.size() == 0) {
            return null;
        }
        for (Tservice tservice : tservices) {
            Ti condition = new Ti();
            condition.setServiceid(tservice.getId());
            List<Ti> tis = tiService.selectByCondition(condition);
            if (tis == null || tis.size() == 0) {
                log.warn("服务id=" + tservice.getId() + ",此服务无有效接口信息,无需生成base类");
                ret.put(tservice.getServicekey() + "(" + tservice.getId() + ")", "此服务无有效接口信息,无需生成base类");
                continue;
            }

            StringBuffer sb = new StringBuffer();
            String sKey = tservice.getServicekey();
            String className = sKey + "DefaultTest";
            String supperClassName = sKey + "Base";
            sb.append(DEFAULT_HEAD.replaceAll("\\$\\{supperClassName\\}", supperClassName));
            sb.append(DEFAULT_CLASS.replaceAll("\\$\\{defaultClassName\\}", className)
                    .replaceAll("\\$\\{supperClassName\\}", supperClassName));
            sb.append(BRACE_LEFT);
            sb.append(DEFAULT_CONSTUCT.replaceAll("\\$\\{defaultClassName\\}", className));
            sb.append(DEFAULT_COMMON);
            getMethodSB(tis, sb, DEFAULT_METHOD);
            sb.append(BRACE_RIGHT);

            String fileName = autoCodeDir + className + ".java";
            FileUtil.saveContent(sb.toString(), fileName);
            ret.put(tservice.getServicekey() + "(" + tservice.getId() + ")", fileName);
        }
        return ret;
    }

    public void getMethodSB(List<Ti> tis, StringBuffer sb, String defaultMethod) {
        for (Ti ti : tis) {
            String iUri = ti.getIuri();
            String desc = ti.getRemark();
            String testMethodName = HryUtil.iUri2MethodName(iUri);
            String testMethod = defaultMethod.replaceAll("\\$\\{annoTestName\\}", iUri)
                    .replaceAll("\\$\\{annoDesc\\}", desc != null ? desc : "no desc")
                    .replaceAll("\\$\\{testMethodName\\}", testMethodName);
            sb.append(testMethod);
        }
    }*/

    @Override
    public Map<String,String> generateTestClass() {
        List<Tservice> tservices = tserviceService.selectByCondition(null);
        if (tservices == null || tservices.size() == 0) {
            return null;
        }
        Map<String,String> map=new HashMap<>();
        for (Tservice tservice : tservices) {
            List<Ti> tis = tiService.selectByServiceId(tservice.getId());
            StringBuffer sb = new StringBuffer();
            sb.append(HEAD);
            sb.append(CLASS.replaceAll(GenReplaceKWEnum.SKEY.getRegex(), tservice.getServicekey()));
            sb.append(BRACE_LEFT);
            sb.append(CONSTRUCTOR.replaceAll(GenReplaceKWEnum.SKEY.getRegex(), tservice.getServicekey()));
            sb.append(getMethodString(tis, METHOD));
            sb.append(BRACE_RIGHT);
            String fileName=zdyProperty.getAutoCodeDir()+tservice.getServicekey()+"DefaultTest.java";
            FileUtil.saveContent(sb.toString(),fileName);
            map.put(tservice.getServicekey(),fileName);
        }
        return map;
    }

    public String getMethodString(List<Ti> tis, String methodModel) {
        StringBuffer sb = new StringBuffer();
        for (Ti ti : tis) {
            String iUri = ti.getIuri();
            String methodName = HryUtil.iUri2MethodName(iUri);
            String desc = ti.getRemark();
            sb.append(methodModel.replaceAll(GenReplaceKWEnum.URI.getRegex(), iUri)
                    .replaceAll(GenReplaceKWEnum.METHOD_NAME.getRegex(), methodName)
                    .replaceAll(GenReplaceKWEnum.DESC.getRegex(), desc));
        }
        return sb.toString();
    }
}
