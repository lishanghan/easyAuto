package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("LanmaoGateway")
public class LanmaoGatewayDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public LanmaoGatewayDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/bha-neo-app/gateway/desktop/personalRegisterExpand/index.html", dataProvider = "provider", description = "重定向访问")
    public void bha_neo_app_gateway_desktop_personalRegisterExpand_index_html(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bha-neo-app/gateway/desktop/personalRegisterExpand/register", dataProvider = "provider", description = "懒猫开户-个人注册")
    public void bha_neo_app_gateway_desktop_personalRegisterExpand_register(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bha-neo-app/gateway/sms/smsForEnterprise", dataProvider = "provider", description = "【有感开户】发送短信验证码")
    public void bha_neo_app_gateway_sms_smsForEnterprise(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bha-neo-app/lanmaotech/gateway", dataProvider = "provider", description = "懒猫开户-准备")
    public void bha_neo_app_lanmaotech_gateway(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

}
