package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("UEPlan")
public class UEPlanDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public UEPlanDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/ibsToUePlanFacade/getSalesUeProducts", dataProvider = "provider", description = "获取上架的优易智投产品")
    public void ibsToUePlanFacade_getSalesUeProducts(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/p2pToUePlanFacade/getUeAuthOrderInfo", dataProvider = "provider", description = "获取Ue系统授权订单信息")
    public void p2pToUePlanFacade_getUeAuthOrderInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/p2pToUePlanFacade/getUeProductInfo", dataProvider = "provider", description = "获取优易智投产品详情")
    public void p2pToUePlanFacade_getUeProductInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/p2pToUePlanFacade/getUeProductRealStatistics", dataProvider = "provider", description = "优易智投实时募集统计")
    public void p2pToUePlanFacade_getUeProductRealStatistics(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/UeCbpFrontFacade/queryUeProductList", dataProvider = "provider", description = "优易智投产品编号查询接口")
    public void UeCbpFrontFacade_queryUeProductList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/UeCbpFrontFacade/registerUeProductAmount", dataProvider = "provider", description = "优易智投金额登记接口")
    public void UeCbpFrontFacade_registerUeProductAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/UeCbpFrontFacade/sumToBeMatchAmount", dataProvider = "provider", description = "获取优易智投待匹配总金额")
    public void UeCbpFrontFacade_sumToBeMatchAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanAuthInvestFacade/userAuthInvest", dataProvider = "provider", description = "用户授权投资")
    public void uePlanAuthInvestFacade_userAuthInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanAuthInvestFacade/userCancelAuthInvest", dataProvider = "provider", description = "用户取消授权投资")
    public void uePlanAuthInvestFacade_userCancelAuthInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/addUeProduct", dataProvider = "provider", description = "新增优易智投产品配置，供后台使用")
    public void uePlanConsoleFacade_addUeProduct(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/disableUeProduct", dataProvider = "provider", description = "停用优易智投产品")
    public void uePlanConsoleFacade_disableUeProduct(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/enableUeProduct", dataProvider = "provider", description = "启用优易智投产品")
    public void uePlanConsoleFacade_enableUeProduct(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/getUeBidInfo", dataProvider = "provider", description = "查看优易智投标的详细信息")
    public void uePlanConsoleFacade_getUeBidInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/getUeProductConfig", dataProvider = "provider", description = "查看优易智投服务配置信息")
    public void uePlanConsoleFacade_getUeProductConfig(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/getUeProductLimit", dataProvider = "provider", description = "查询优易智投服务某日限额信息")
    public void uePlanConsoleFacade_getUeProductLimit(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/queryMatchInvestOrder", dataProvider = "provider", description = "查询优易智投匹配记录")
    public void uePlanConsoleFacade_queryMatchInvestOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/queryUeAuthOrderList", dataProvider = "provider", description = "查询授权订单信息列表")
    public void uePlanConsoleFacade_queryUeAuthOrderList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/queryUeBidList", dataProvider = "provider", description = "查询优易智投标的信息列表")
    public void uePlanConsoleFacade_queryUeBidList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/queryUeCancelOrderList", dataProvider = "provider", description = "查询撤销订单信息列表")
    public void uePlanConsoleFacade_queryUeCancelOrderList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/queryUeMatchAndCancelOrderList", dataProvider = "provider", description = "查看授权订单匹配(撤销)的标的信息")
    public void uePlanConsoleFacade_queryUeMatchAndCancelOrderList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/queryUeProducLimitRecordList", dataProvider = "provider", description = "查询优易智投预约推送记录")
    public void uePlanConsoleFacade_queryUeProducLimitRecordList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/queryUeProductConfigList", dataProvider = "provider", description = "查询优易智投服务配置信息列表")
    public void uePlanConsoleFacade_queryUeProductConfigList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/queryUeProductDailyAmountList", dataProvider = "provider", description = "查看优易智投产品日需求金额列表")
    public void uePlanConsoleFacade_queryUeProductDailyAmountList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/queryUeProductItemList", dataProvider = "provider", description = "查询优易智投产品每日汇总信息列表")
    public void uePlanConsoleFacade_queryUeProductItemList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanConsoleFacade/updateUeProduct", dataProvider = "provider", description = "修改优易智投产品配置")
    public void uePlanConsoleFacade_updateUeProduct(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/getMyUeAuthOrder", dataProvider = "provider", description = "获取我的优易智投详情")
    public void uePlanFrontFacade_getMyUeAuthOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/getUeInvestRecord", dataProvider = "provider", description = "获取优易智投用户投资记录")
    public void uePlanFrontFacade_getUeInvestRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/getUeInvestRecordDetail", dataProvider = "provider", description = "交易记录 - 出借记录详情")
    public void uePlanFrontFacade_getUeInvestRecordDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/getUeProductDetail", dataProvider = "provider", description = "优易智投服务列表 - 获取优易智投详情")
    public void uePlanFrontFacade_getUeProductDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/listMyCancelUeAuthOrder", dataProvider = "provider", description = "历史记录 - 获取我的优易撤销记录")
    public void uePlanFrontFacade_listMyCancelUeAuthOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/listMySettledUeAuthOrder", dataProvider = "provider", description = "历史记录 - 获取我的优易智投结清记录")
    public void uePlanFrontFacade_listMySettledUeAuthOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/listMyUeInvest", dataProvider = "provider", description = "我的出借 - 优易智投列表")
    public void uePlanFrontFacade_listMyUeInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/listNoviceUeProduct", dataProvider = "provider", description = "获取新手优易智投服务列表")
    public void uePlanFrontFacade_listNoviceUeProduct(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/listUeAuthOrderContract", dataProvider = "provider", description = "根据授权订单号查询该订单的合同")
    public void uePlanFrontFacade_listUeAuthOrderContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/listUeInvestRecord", dataProvider = "provider", description = "交易记录 - 出借记录列表")
    public void uePlanFrontFacade_listUeInvestRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/listUeProduct", dataProvider = "provider", description = "首页AND列表 - 获取优易智投服务列表")
    public void uePlanFrontFacade_listUeProduct(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/queryAvailablePlanByCoupon", dataProvider = "provider", description = "根据条件查询可用的券信息")
    public void uePlanFrontFacade_queryAvailablePlanByCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFrontFacade/queryAvailablePlanByLcj", dataProvider = "provider", description = "根据条件查询可用的理财金信息")
    public void uePlanFrontFacade_queryAvailablePlanByLcj(HryTest test) {
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
