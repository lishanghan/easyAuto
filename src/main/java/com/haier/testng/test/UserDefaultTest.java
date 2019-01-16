package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("User")
public class UserDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public UserDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/accountFacade/authorisedBalance", dataProvider = "provider", description = "余额授权")
    public void accountFacade_authorisedBalance(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/balanceCheckDetail", dataProvider = "provider", description = "日终余额校验明细")
    public void accountFacade_balanceCheckDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/cancelAuthorisedBalance", dataProvider = "provider", description = "取消授权余额")
    public void accountFacade_cancelAuthorisedBalance(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/queryAccount", dataProvider = "provider", description = "账单查询")
    public void accountFacade_queryAccount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/queryAccountBalanceByUserId", dataProvider = "provider", description = "账单查询-根据用户ID查询账户余额")
    public void accountFacade_queryAccountBalanceByUserId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/queryAccountByUserId", dataProvider = "provider", description = "账单查询-根据用户ID按时间倒序查询")
    public void accountFacade_queryAccountByUserId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/queryAccountFlowBackEnd", dataProvider = "provider", description = "账单查询-后端使用")
    public void accountFacade_queryAccountFlowBackEnd(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/queryAccountFlowByLoginNameListAndTime", dataProvider = "provider", description = "账单查询-根据登录名列表和账务开始、结束时间")
    public void accountFacade_queryAccountFlowByLoginNameListAndTime(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/queryAccountFlowForApp", dataProvider = "provider", description = "资金流水查询")
    public void accountFacade_queryAccountFlowForApp(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/queryAuthorisedInfo", dataProvider = "provider", description = "查询授权信息")
    public void accountFacade_queryAuthorisedInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/queryAuthorisedTransaction", dataProvider = "provider", description = "查询使用授权余额信息")
    public void accountFacade_queryAuthorisedTransaction(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/queryUserInfoCheckFileResult", dataProvider = "provider", description = "查询对账结果")
    public void accountFacade_queryUserInfoCheckFileResult(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/queryUserInfoCheckFileResultDetails", dataProvider = "provider", description = "查询对账结果详情")
    public void accountFacade_queryUserInfoCheckFileResultDetails(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/recheckAccount", dataProvider = "provider", description = "手动发起重新对账")
    public void accountFacade_recheckAccount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/reorderAccoutFlow", dataProvider = "provider", description = "账单排序")
    public void accountFacade_reorderAccoutFlow(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/useAuthorisedBalance", dataProvider = "provider", description = "匹配授权余额")
    public void accountFacade_useAuthorisedBalance(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/accountFacade/userCheckDetail", dataProvider = "provider", description = "客户信息校验明细")
    public void accountFacade_userCheckDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/externalFacade/confirmProtocolSign", dataProvider = "provider", description = "协议支付签约确认")
    public void externalFacade_confirmProtocolSign(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/externalFacade/getHaiLiProjectByOpenId", dataProvider = "provider", description = "根据OpenId查询是否属于海利计划")
    public void externalFacade_getHaiLiProjectByOpenId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/externalFacade/getOpenIdByTpId", dataProvider = "provider", description = "根据第三方ID查询openId")
    public void externalFacade_getOpenIdByTpId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/externalFacade/getUserProtocolSign", dataProvider = "provider", description = "查询用户协议支付签约信息")
    public void externalFacade_getUserProtocolSign(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/externalFacade/getZDPersonalStateByGateway", dataProvider = "provider", description = "根据用户证件号+银行卡号+渠道标识查询个人状态网关专用(适用于显性开户)")
    public void externalFacade_getZDPersonalStateByGateway(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/externalFacade/protocolSign", dataProvider = "provider", description = "协议支付签约(该接口只支持个人身份证用户)")
    public void externalFacade_protocolSign(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/haierGatewayFacade/haierUserBinding", dataProvider = "provider", description = "海尔用户绑定")
    public void haierGatewayFacade_haierUserBinding(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/haierGatewayFacade/haierUserLogin", dataProvider = "provider", description = "海尔用户登录")
    public void haierGatewayFacade_haierUserLogin(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/activateStockedUser", dataProvider = "provider", description = "会员激活")
    public void lanmaoGatewayFacade_activateStockedUser(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/auditBindCard", dataProvider = "provider", description = "换卡审核")
    public void lanmaoGatewayFacade_auditBindCard(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/bindCardGeneral", dataProvider = "provider", description = "个人和企业直连换卡")
    public void lanmaoGatewayFacade_bindCardGeneral(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/checkPassword", dataProvider = "provider", description = "校验密码")
    public void lanmaoGatewayFacade_checkPassword(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/confirmProtocolSign", dataProvider = "provider", description = "协议支付签约确认")
    public void lanmaoGatewayFacade_confirmProtocolSign(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/enterpriseBindBankcard", dataProvider = "provider", description = "企业换绑卡")
    public void lanmaoGatewayFacade_enterpriseBindBankcard(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/enterpriseInformationUpdate", dataProvider = "provider", description = "企业信息变更")
    public void lanmaoGatewayFacade_enterpriseInformationUpdate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/enterpriseRegister", dataProvider = "provider", description = "企业绑卡注册")
    public void lanmaoGatewayFacade_enterpriseRegister(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/modifyMobile", dataProvider = "provider", description = "预留手机号更新")
    public void lanmaoGatewayFacade_modifyMobile(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/personalBindBankcardExpand", dataProvider = "provider", description = "个人换绑卡")
    public void lanmaoGatewayFacade_personalBindBankcardExpand(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/personalRegister", dataProvider = "provider", description = "个人绑卡注册")
    public void lanmaoGatewayFacade_personalRegister(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/protocolSign", dataProvider = "provider", description = "协议支付签约(该接口只支持个人身份证用户)")
    public void lanmaoGatewayFacade_protocolSign(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/queryProtocolSign", dataProvider = "provider", description = "查询用户的协议签约信息")
    public void lanmaoGatewayFacade_queryProtocolSign(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/queryUserInformation", dataProvider = "provider", description = "用户信息查询")
    public void lanmaoGatewayFacade_queryUserInformation(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/resetPassword", dataProvider = "provider", description = "修改密码")
    public void lanmaoGatewayFacade_resetPassword(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lanmaoGatewayFacade/userAuthorization", dataProvider = "provider", description = "用户授权")
    public void lanmaoGatewayFacade_userAuthorization(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanQuotaFacade/freezeLoanAmount", dataProvider = "provider", description = "冻结借款额度")
    public void loanQuotaFacade_freezeLoanAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanQuotaFacade/queryLoanQuota", dataProvider = "provider", description = "借款额度查询")
    public void loanQuotaFacade_queryLoanQuota(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanQuotaFacade/returnLoanAmount", dataProvider = "provider", description = "归还额度")
    public void loanQuotaFacade_returnLoanAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanQuotaFacade/unfreezeLoanAmount", dataProvider = "provider", description = "解冻借款额度")
    public void loanQuotaFacade_unfreezeLoanAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanQuotaFacade/useLoanAmount", dataProvider = "provider", description = "使用额度")
    public void loanQuotaFacade_useLoanAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/generateCode", dataProvider = "provider", description = "验证码生成接口")
    public void loginFacade_generateCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/getUserInfoByToken", dataProvider = "provider", description = "根据登录token获取用户信息")
    public void loginFacade_getUserInfoByToken(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/inLoginRisk", dataProvider = "provider", description = "登录风险控制内部接口")
    public void loginFacade_inLoginRisk(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/inRegisterRisk", dataProvider = "provider", description = "注册风险控制内部接口")
    public void loginFacade_inRegisterRisk(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/login", dataProvider = "provider", description = "非投资用户登录")
    public void loginFacade_login(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/logout", dataProvider = "provider", description = "账号退出")
    public void loginFacade_logout(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/regist", dataProvider = "provider", description = "账号注册")
    public void loginFacade_regist(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/sendEmailAuthCode", dataProvider = "provider", description = "发送邮箱验证码")
    public void loginFacade_sendEmailAuthCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/sendMobileAuthCode", dataProvider = "provider", description = "发送手机验证码")
    public void loginFacade_sendMobileAuthCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/sendMobileAuthCodeByToken", dataProvider = "provider", description = "根据校验码token发送验证码")
    public void loginFacade_sendMobileAuthCodeByToken(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/updateBindingMobile", dataProvider = "provider", description = "修改绑定手机号")
    public void loginFacade_updateBindingMobile(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/updateLoginPassword", dataProvider = "provider", description = "修改登录密码")
    public void loginFacade_updateLoginPassword(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/updateLoginPasswordByOriginPassword", dataProvider = "provider", description = "根据原密码修改登录密码")
    public void loginFacade_updateLoginPasswordByOriginPassword(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/validateEmailAuthCode", dataProvider = "provider", description = "验证邮箱验证码")
    public void loginFacade_validateEmailAuthCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/validateIdCardNo", dataProvider = "provider", description = "校验身份证号码")
    public void loginFacade_validateIdCardNo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loginFacade/validateMobileAuthCode", dataProvider = "provider", description = "验证手机验证码")
    public void loginFacade_validateMobileAuthCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/nonInvestorFacade/getPlatformUserInfoByUserNo", dataProvider = "provider", description = "根据平台用户编号查询平台用户信息")
    public void nonInvestorFacade_getPlatformUserInfoByUserNo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/nonInvestorFacade/setSubRole", dataProvider = "provider", description = "设置二级角色")
    public void nonInvestorFacade_setSubRole(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/nonInvestorFacade/setSubRoleByLoginName", dataProvider = "provider", description = "根据用户名设置二级角色")
    public void nonInvestorFacade_setSubRoleByLoginName(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/oauthFacade/decryptUserId", dataProvider = "provider", description = "userId解密")
    public void oauthFacade_decryptUserId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/oauthFacade/encryptUserId", dataProvider = "provider", description = "userId加密")
    public void oauthFacade_encryptUserId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/oauthFacade/getAccessCode", dataProvider = "provider", description = "获取access_code")
    public void oauthFacade_getAccessCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/oauthFacade/getUserIdByToken", dataProvider = "provider", description = "根据token获取用户ID")
    public void oauthFacade_getUserIdByToken(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/oauthFacade/queryTokenByAccessCode", dataProvider = "provider", description = "根据access_code获取token")
    public void oauthFacade_queryTokenByAccessCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/oauthFacade/refreshAccessToken", dataProvider = "provider", description = "根据refreshToken刷新accessToken")
    public void oauthFacade_refreshAccessToken(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/oauthFacade/validateOauthClient", dataProvider = "provider", description = "验证客户端")
    public void oauthFacade_validateOauthClient(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/riskManagermentFacade/cardModigyRiskManager", dataProvider = "provider", description = "银行卡切换风险控制")
    public void riskManagermentFacade_cardModigyRiskManager(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/riskManagermentFacade/loginRiskManager", dataProvider = "provider", description = "登录风险控制")
    public void riskManagermentFacade_loginRiskManager(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/riskManagermentFacade/openDepositoryRiskManager", dataProvider = "provider", description = "开通存管风险控制")
    public void riskManagermentFacade_openDepositoryRiskManager(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/riskManagermentFacade/registerRiskManager", dataProvider = "provider", description = "注册风险控制")
    public void riskManagermentFacade_registerRiskManager(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userCommonFacade/getAllCacheNames", dataProvider = "provider", description = "获取所有的缓存名称")
    public void userCommonFacade_getAllCacheNames(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/deleteUserExtraAttachment", dataProvider = "provider", description = "删除借款人附加附件")
    public void userConsoleFacade_deleteUserExtraAttachment(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/getAllAccountType", dataProvider = "provider", description = "查询所有的账务类型")
    public void userConsoleFacade_getAllAccountType(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/getBankAuditDetail", dataProvider = "provider", description = "查询银行卡审核详细信息")
    public void userConsoleFacade_getBankAuditDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/queryAccountflow", dataProvider = "provider", description = "账单查询-后端使用")
    public void userConsoleFacade_queryAccountflow(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/queryAuthUsers", dataProvider = "provider", description = "查询授权用户")
    public void userConsoleFacade_queryAuthUsers(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/queryBankAuditList", dataProvider = "provider", description = "查询银行卡审核记录列表")
    public void userConsoleFacade_queryBankAuditList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/queryEnterpriseDetail", dataProvider = "provider", description = "根据用户id查询企业详细信息")
    public void userConsoleFacade_queryEnterpriseDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/queryPersonalDetail", dataProvider = "provider", description = "根据用户id查询用户详细信息")
    public void userConsoleFacade_queryPersonalDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/queryUserList", dataProvider = "provider", description = "根据条件查询用户列表")
    public void userConsoleFacade_queryUserList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/resetWrongTimes", dataProvider = "provider", description = "置密码错误次数")
    public void userConsoleFacade_resetWrongTimes(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/riskAudit", dataProvider = "provider", description = "风控审核")
    public void userConsoleFacade_riskAudit(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/upateUserState", dataProvider = "provider", description = "更改用户状态")
    public void userConsoleFacade_upateUserState(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/uploadBankAuditFile", dataProvider = "provider", description = "上传审核附件")
    public void userConsoleFacade_uploadBankAuditFile(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userConsoleFacade/uploadImageFile", dataProvider = "provider", description = "")
    public void userConsoleFacade_uploadImageFile(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/addUserExtraInfo", dataProvider = "provider", description = "添加借款人附加信息")
    public void userFacade_addUserExtraInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/checkBankCardAudit", dataProvider = "provider", description = "检查用户换绑卡审核记录状态")
    public void userFacade_checkBankCardAudit(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/checkEnterpriseUpdateProcess", dataProvider = "provider", description = "检查企业修改信息审核记录状态")
    public void userFacade_checkEnterpriseUpdateProcess(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/checkLoginNameExists", dataProvider = "provider", description = "检查用户名是否存在")
    public void userFacade_checkLoginNameExists(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/filterUserIdByBirthday", dataProvider = "provider", description = "根据生日筛选userId")
    public void userFacade_filterUserIdByBirthday(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getAuth", dataProvider = "provider", description = "根据用户id查询授权信息")
    public void userFacade_getAuth(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getBankCardBindingList", dataProvider = "provider", description = "根据用户id查询绑卡列表(适用于个人,企业)")
    public void userFacade_getBankCardBindingList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getBaseInfoByUserIds", dataProvider = "provider", description = "批量查询用户基本信息")
    public void userFacade_getBaseInfoByUserIds(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getEnterpriseInfoByLoginName", dataProvider = "provider", description = "根据登陆名查询企业信息")
    public void userFacade_getEnterpriseInfoByLoginName(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getEnterpriseInfoByUserId", dataProvider = "provider", description = "根据用户id查询企业信息")
    public void userFacade_getEnterpriseInfoByUserId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getInvestProfit", dataProvider = "provider", description = "获得用户收益")
    public void userFacade_getInvestProfit(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getPersonalInfoByLoginName", dataProvider = "provider", description = "根据登陆名查询个人信息")
    public void userFacade_getPersonalInfoByLoginName(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getPersonalInfoByUserId", dataProvider = "provider", description = "根据用户id查询个人信息")
    public void userFacade_getPersonalInfoByUserId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getPersonalRealName", dataProvider = "provider", description = "根据用户id查询个人实名信息")
    public void userFacade_getPersonalRealName(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getPersonalRealNameByUserIds", dataProvider = "provider", description = "批量查询个人实名信息")
    public void userFacade_getPersonalRealNameByUserIds(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUnionUserByLoginName", dataProvider = "provider", description = "根据登陆名查询UnionUser")
    public void userFacade_getUnionUserByLoginName(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserActionInfoByLoginName", dataProvider = "provider", description = "根据用户名获取用户行为信息")
    public void userFacade_getUserActionInfoByLoginName(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserExtraInfo", dataProvider = "provider", description = "获取借款人附加信息")
    public void userFacade_getUserExtraInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserIdWithSameIdCardNo", dataProvider = "provider", description = "根据证件类型+证件号查询全部的个人userId")
    public void userFacade_getUserIdWithSameIdCardNo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserInfoByLoginName", dataProvider = "provider", description = "根据登陆名查询基本信息")
    public void userFacade_getUserInfoByLoginName(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserInfoByUserId", dataProvider = "provider", description = "根据用户id查询基本信息")
    public void userFacade_getUserInfoByUserId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserProperty", dataProvider = "provider", description = "获得用户资产统计")
    public void userFacade_getUserProperty(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserPropertyDetail", dataProvider = "provider", description = "获得用户资产详情")
    public void userFacade_getUserPropertyDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserProtocolSign", dataProvider = "provider", description = "查询用户协议支付签约信息")
    public void userFacade_getUserProtocolSign(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getZDPersonalState", dataProvider = "provider", description = "根据用户证件号+银行卡号+渠道标识查询个人状态(适用于显性开户)")
    public void userFacade_getZDPersonalState(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getZDUserState", dataProvider = "provider", description = "根据登陆名和银行卡号查询用户状态(适用于显性开户)")
    public void userFacade_getZDUserState(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/initInvestorUser", dataProvider = "provider", description = "初始化投资用户")
    public void userFacade_initInvestorUser(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/isCunguanTestingUser", dataProvider = "provider", description = "是否是存管测试用户")
    public void userFacade_isCunguanTestingUser(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/queryBankList", dataProvider = "provider", description = "查询银行卡列表")
    public void userFacade_queryBankList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/updateEnterpriseBankCardInfo", dataProvider = "provider", description = "新增或更新企业银行卡信息")
    public void userFacade_updateEnterpriseBankCardInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/updateEnterpriseBaseInfo", dataProvider = "provider", description = "新增或更新企业基本信息")
    public void userFacade_updateEnterpriseBaseInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/updateEnterpriseLegalInfo", dataProvider = "provider", description = "新增或更新企业法人信息")
    public void userFacade_updateEnterpriseLegalInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/updateGroupId", dataProvider = "provider", description = "根据userId更新groupId")
    public void userFacade_updateGroupId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/updateUserInfo", dataProvider = "provider", description = "更新用户信息(适用于更新绑定手机,企业联系人,企业联系人手机,银行卡,银行预留手机)")
    public void userFacade_updateUserInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/verifyPasswordByRequestNo", dataProvider = "provider", description = "根据请求号验证密码")
    public void userFacade_verifyPasswordByRequestNo(HryTest test) {
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

    @Test(testName = "/weChatFacade/bindOpenIdAndUserId", dataProvider = "provider", description = "绑定微信openId和userId")
    public void weChatFacade_bindOpenIdAndUserId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/weChatFacade/getOpenIdByUserId", dataProvider = "provider", description = "根据userId查询openId")
    public void weChatFacade_getOpenIdByUserId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/weChatFacade/getUserIdByOpenId", dataProvider = "provider", description = "根据openId查询userId")
    public void weChatFacade_getUserIdByOpenId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/weChatFacade/unbindOpenIdAndUserId", dataProvider = "provider", description = "解绑微信openId")
    public void weChatFacade_unbindOpenIdAndUserId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

}
