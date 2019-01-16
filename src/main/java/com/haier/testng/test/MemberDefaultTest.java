package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("Member")
public class MemberDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public MemberDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/bankCardFacade/getBankChannel", dataProvider = "provider", description = "根据银行代码和支付金额获取银行渠道")
    public void bankCardFacade_getBankChannel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bankCardFacade/queryBankLimitsWithCunguanBankCode", dataProvider = "provider", description = "收银服务限额限次查询和存管银行代码")
    public void bankCardFacade_queryBankLimitsWithCunguanBankCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/createRegisterContract", dataProvider = "provider", description = "创建注册合同")
    public void customerFacade_createRegisterContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/createRegisterContractBatch", dataProvider = "provider", description = "批量创建已同意的注册合同")
    public void customerFacade_createRegisterContractBatch(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/generateCode", dataProvider = "provider", description = "验证码生成接口")
    public void customerFacade_generateCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/getKjtUserInfoByHryId", dataProvider = "provider", description = "根据hryId查询kjt用户信息")
    public void customerFacade_getKjtUserInfoByHryId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/getRiskAssessmentQuestions", dataProvider = "provider", description = "获取风险测评问题")
    public void customerFacade_getRiskAssessmentQuestions(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/getUserRiskAssessmentLevel", dataProvider = "provider", description = "获取用户风险测评结果")
    public void customerFacade_getUserRiskAssessmentLevel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/login", dataProvider = "provider", description = "登录接口")
    public void customerFacade_login(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/logout", dataProvider = "provider", description = "账号退出")
    public void customerFacade_logout(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/moveCaptialCalendar", dataProvider = "provider", description = "移动资金日历数据到历史库")
    public void customerFacade_moveCaptialCalendar(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/queryCaptialCalendar", dataProvider = "provider", description = "获取资金日历")
    public void customerFacade_queryCaptialCalendar(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/queryRegisterContract", dataProvider = "provider", description = "查询用户注册合同")
    public void customerFacade_queryRegisterContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/sendEmailAuthCode", dataProvider = "provider", description = "发送邮箱验证码")
    public void customerFacade_sendEmailAuthCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/sendMobileAuthCode", dataProvider = "provider", description = "发送手机验证码")
    public void customerFacade_sendMobileAuthCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/setUserRiskAssessmentLevel", dataProvider = "provider", description = "设置用户风险测评结果")
    public void customerFacade_setUserRiskAssessmentLevel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/updateLoginPassword", dataProvider = "provider", description = "修改登录密码")
    public void customerFacade_updateLoginPassword(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/updateLoginPasswordByAuthToken", dataProvider = "provider", description = "根据验证有效token修改登录密码")
    public void customerFacade_updateLoginPasswordByAuthToken(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/updateRegisterContract", dataProvider = "provider", description = "创建已同意的注册合同")
    public void customerFacade_updateRegisterContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/userRegister", dataProvider = "provider", description = "渠道用户注册")
    public void customerFacade_userRegister(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/validateEmailAuthCode", dataProvider = "provider", description = "验证邮箱验证码")
    public void customerFacade_validateEmailAuthCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customerFacade/validateMobileAuthCode", dataProvider = "provider", description = "验证手机验证码")
    public void customerFacade_validateMobileAuthCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/kjtGatewayFacade/execute", dataProvider = "provider", description = "kjt会员接口统一封装")
    public void kjtGatewayFacade_execute(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/kjtGatewayFacade/getKjtIdByLoginName", dataProvider = "provider", description = "根据登录名查询KJT ID")
    public void kjtGatewayFacade_getKjtIdByLoginName(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/batchOpenCustodyAccount", dataProvider = "provider", description = "批量开通存管户")
    public void memberFacade_batchOpenCustodyAccount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/checkCustodyAccountStatus", dataProvider = "provider", description = "查询存管户状态")
    public void memberFacade_checkCustodyAccountStatus(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/getHryIdFromMemberId", dataProvider = "provider", description = "根据kjtId查询hryId")
    public void memberFacade_getHryIdFromMemberId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/getKjtProperty", dataProvider = "provider", description = "获取用户kjt方面资产信息")
    public void memberFacade_getKjtProperty(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/getLcjStatisticsByStatus", dataProvider = "provider", description = "根据状态统计理财金信息")
    public void memberFacade_getLcjStatisticsByStatus(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/getMemberByHryId", dataProvider = "provider", description = "根据hryId获取用户信息(从hry数据库获取信息，包括外籍用户)")
    public void memberFacade_getMemberByHryId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/getProperty", dataProvider = "provider", description = "获取用户资产信息,目前只提供理财金、基金份额查询")
    public void memberFacade_getProperty(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/queryCunguanBankInfoByCardNo", dataProvider = "provider", description = "根据卡号查询存管支持银行信息")
    public void memberFacade_queryCunguanBankInfoByCardNo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/queryLcjListByStatus", dataProvider = "provider", description = "根据状态获取理财金详情")
    public void memberFacade_queryLcjListByStatus(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/queryMemberStatusInfo", dataProvider = "provider", description = "查询用户状态信息(包括外籍用户)")
    public void memberFacade_queryMemberStatusInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/queryUserGroupInfo", dataProvider = "provider", description = "查询用户组的信息")
    public void memberFacade_queryUserGroupInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/sendMessage", dataProvider = "provider", description = "发送站内信")
    public void memberFacade_sendMessage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberFacade/sendMobileVerificationCode", dataProvider = "provider", description = "发送手机校验码")
    public void memberFacade_sendMobileVerificationCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/messageFacade/getMessageInfoList", dataProvider = "provider", description = "获取信息列表")
    public void messageFacade_getMessageInfoList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/messageFacade/setMessageToRead", dataProvider = "provider", description = "设置信息为已读")
    public void messageFacade_setMessageToRead(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/sessionFacade/getCurrentMember", dataProvider = "provider", description = "根据token从Session中获取用户信息")
    public void sessionFacade_getCurrentMember(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/sessionFacade/getUserIdByToken", dataProvider = "provider", description = "根据token从Session中获取用户信息")
    public void sessionFacade_getUserIdByToken(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/sessionFacade/initUser", dataProvider = "provider", description = "初始化用户信息")
    public void sessionFacade_initUser(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/sessionFacade/initUserByUserInfo", dataProvider = "provider", description = "初始化用户信息")
    public void sessionFacade_initUserByUserInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/virtual/hat_trick", dataProvider = "provider", description = "虚拟接口（三）")
    public void virtual_hat_trick(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/virtual/Rakhim", dataProvider = "provider", description = "虚拟接口（二）")
    public void virtual_Rakhim(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/virtual/sql", dataProvider = "provider", description = "虚拟接口")
    public void virtual_sql(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

}
