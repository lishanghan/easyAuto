package com.haier.testng.base;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.haier.anno.HryCookie;
import com.haier.anno.HryHeader;
import com.haier.config.SpringContextHolder;
import com.haier.po.Tcase;
import com.haier.po.Ti;
import com.haier.po.Tservice;
import com.haier.po.Tservicedetail;
import com.haier.service.RunService;
import com.haier.util.HryUtil;
import com.haier.util.LoginUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.client.CookieStore;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/8/14 10:49
 */
@Slf4j
/**
 * @SpringBootTest() 注解仅可以在测试模式下使用(未优先启动Spring自动配置),
 * 部署上线时,Spring必然已经启动,如果此时由web发起测试,调用测试类,SpringBootTest注解会重新启动Application
 * 造成冲突 ,导致测试类初始化失败,无法完成测试
 * 需要想一想有没有兼容的办法...
 */
//@SpringBootTest(classes = {Application.class})
public class Base /*extends AbstractTestNGSpringContextTests*/ {
    public Integer serviceId;
    public Integer envId;
    public String caseDesigner;
    public JSONObject i_c_JSONObject;//{"methodName":List<CaseId>}
    public JSONObject i_c_zdy_JSONObject;//{"methodName":list<Tcase>}
    public Tservice tservice;
    public Tservicedetail tservicedetail;
    public List<Ti> tis;
    public Map<String, Ti> iUri_ti;
    public RunService runService;//RunService bean的获取放到初始化中,如果放到这里就初始化,如果是外部调用测试,此时Spring还未启动,此测试类会报错
    public String testingId;//标记某次测试活动,一个测试报告中的所有测试,作为一个测试活动,

    public Base() {
    }

    public Base(Tcase tcase) {

    }

    public Base(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        this.serviceId = serviceId;
        this.envId = envId;
        this.caseDesigner = caseDesigner;
        this.testingId = testingId;
        if (StringUtils.isNotBlank(i_c)) {
            this.i_c_JSONObject = JSONObject.parseObject(i_c, Feature.OrderedField);
        }
        if (StringUtils.isNotBlank(i_c_zdy)) {
            this.i_c_zdy_JSONObject = JSONObject.parseObject(i_c_zdy);
        }
        runService = SpringContextHolder.getBean(RunService.class);
        tservice = runService.getTservice(this.serviceId);
        tservicedetail = runService.getTservicedetail(this.serviceId, this.envId);
/*        if (tservicedetail == null) {
            Tenv tenv = SpringContextHolder.getBean(TenvService.class).selectOne(envId);
            throw new HryException(StatusCodeEnum.NO_SERVICE_ENV_MAP, "服务=" + tservice.getServicekey() + ",环境=" + tenv.getEnvkey() + "无映射,请先维护服务与环境映射");
        }*/

        LoginUtil.loginInit(this);

        log.info("######测试类" + this.getClass().getSimpleName() + "初始化完成!!!######");

    }

    @HryCookie
    public CookieStore cookieStore;

    @HryHeader
    public Header[] headers;

    @DataProvider(name = "provider")
    public Object[] provider(Method method) {
        return HryUtil.getTests(tservice, tservicedetail, caseDesigner, i_c_JSONObject, i_c_zdy_JSONObject, method);
    }
}
