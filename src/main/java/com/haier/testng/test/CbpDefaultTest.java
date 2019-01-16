package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("Cbp")
public class CbpDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public CbpDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.apply.facade.rs.ApplyResource/checkBdContactTel", dataProvider = "provider", description = "客户经理联系手机Check")
    public void cbp_api_resource_com_cbp_biz_apply_facade_rs_ApplyResource_checkBdContactTel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.apply.facade.rs.ApplyResource/checkYearAccountCode", dataProvider = "provider", description = "365账户查询")
    public void cbp_api_resource_com_cbp_biz_apply_facade_rs_ApplyResource_checkYearAccountCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.apply.facade.rs.ApplyResource/createApply", dataProvider = "provider", description = "申请授信")
    public void cbp_api_resource_com_cbp_biz_apply_facade_rs_ApplyResource_createApply(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.apply.facade.rs.ApplyResource/getApplyInfo", dataProvider = "provider", description = "申请信息取得")
    public void cbp_api_resource_com_cbp_biz_apply_facade_rs_ApplyResource_getApplyInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanPrepayResource/createCfBuyBack", dataProvider = "provider", description = "提前回购申请")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanPrepayResource_createCfBuyBack(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanPrepayResource/createCfPrepay", dataProvider = "provider", description = "2.3.2-P0010提前还款申请")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanPrepayResource_createCfPrepay(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanPrepayResource/createCfRefund", dataProvider = "provider", description = "2.3.5-P0010退货申请")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanPrepayResource_createCfRefund(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanPrepayResource/queryCfBuyBack", dataProvider = "provider", description = "提前回购查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanPrepayResource_queryCfBuyBack(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanPrepayResource/queryCfBuyBackResult", dataProvider = "provider", description = "提前回购结果查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanPrepayResource_queryCfBuyBackResult(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanPrepayResource/queryCfPrepay", dataProvider = "provider", description = "2.3.1-P0010提前还款资金查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanPrepayResource_queryCfPrepay(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanPrepayResource/queryCfPrepayResult", dataProvider = "provider", description = "2.3.3-P0010提前还款结果查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanPrepayResource_queryCfPrepayResult(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanPrepayResource/queryCfRefund", dataProvider = "provider", description = "2.3.4-P0010退货资金查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanPrepayResource_queryCfRefund(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanPrepayResource/queryCfRefundResult", dataProvider = "provider", description = "2.3.6-P0010退货结果查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanPrepayResource_queryCfRefundResult(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanRepayResource/cfReclaim", dataProvider = "provider", description = "2.2.5-P0010代偿收回")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanRepayResource_cfReclaim(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanRepayResource/cfRepay", dataProvider = "provider", description = "2.2.3-P0010还款")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanRepayResource_cfRepay(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanRepayResource/pushCfRepayPlan", dataProvider = "provider", description = "2.2.1-P0010还款计划推送")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanRepayResource_pushCfRepayPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanRepayResource/queryCfRepayPlan", dataProvider = "provider", description = "2.2.6-P0010还款计划查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanRepayResource_queryCfRepayPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanRepayResource/queryCfRepayResult", dataProvider = "provider", description = "2.2.4-P0010还款结果查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanRepayResource_queryCfRepayResult(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanRepayResource/updateCfRepayPlan", dataProvider = "provider", description = "2.2.2-P0010还款计划更新")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanRepayResource_updateCfRepayPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanResource/cfLoanFk", dataProvider = "provider", description = "2.1.3-P0010线上直融放款")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanResource_cfLoanFk(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanResource/createCfLoan", dataProvider = "provider", description = "2.1.1-P0007消金借款申请")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanResource_createCfLoan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanResource/createCfXszrLoan", dataProvider = "provider", description = "2.1.1-P0010线上直融借款申请")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanResource_createCfXszrLoan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanResource/getCfChannel", dataProvider = "provider", description = "2.1.0-P0007消金渠道获取")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanResource_getCfChannel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanResource/getContractFile", dataProvider = "provider", description = "2.1.4-P0010线上直融代签借款合同文件获取")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanResource_getContractFile(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanResource/queryCfLoan", dataProvider = "provider", description = "2.1.2-P0007消金借款查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanResource_queryCfLoan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanResource/queryCfResidualBookAmount", dataProvider = "provider", description = "2.1.5-P0007消金剩余可借款金额查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanResource_queryCfResidualBookAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.cfLoan.facade.rs.CfLoanResource/queryCfXszrLoan", dataProvider = "provider", description = "2.1.2-P0010线上直融借款查询")
    public void cbp_api_resource_com_cbp_biz_cfLoan_facade_rs_CfLoanResource_queryCfXszrLoan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.collection.facade.rs.DataCollectionResource/collection", dataProvider = "provider", description = "采集")
    public void cbp_api_resource_com_cbp_biz_collection_facade_rs_DataCollectionResource_collection(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.collection.facade.rs.DataCollectionResource/createDataCollection", dataProvider = "provider", description = "数据采集")
    public void cbp_api_resource_com_cbp_biz_collection_facade_rs_DataCollectionResource_createDataCollection(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.dealerWill.facade.rs.DealerWillResource/createDealerWill", dataProvider = "provider", description = "万链数据推送")
    public void cbp_api_resource_com_cbp_biz_dealerWill_facade_rs_DealerWillResource_createDealerWill(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.hryLoan.facade.rs.HryLoanResource/createHryLoan", dataProvider = "provider", description = "借款人融资申请")
    public void cbp_api_resource_com_cbp_biz_hryLoan_facade_rs_HryLoanResource_createHryLoan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.hryLoan.facade.rs.HryLoanResource/getHryBidLoan", dataProvider = "provider", description = "标的贷中信息")
    public void cbp_api_resource_com_cbp_biz_hryLoan_facade_rs_HryLoanResource_getHryBidLoan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.hryLoan.facade.rs.HryLoanResource/getHryFinancingContract", dataProvider = "provider", description = "获取借款人融资服务协议")
    public void cbp_api_resource_com_cbp_biz_hryLoan_facade_rs_HryLoanResource_getHryFinancingContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.hryLoan.facade.rs.HryLoanResource/queryHryLoan", dataProvider = "provider", description = "借款人融资查询")
    public void cbp_api_resource_com_cbp_biz_hryLoan_facade_rs_HryLoanResource_queryHryLoan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.hryLoan.facade.rs.HryLoanResource/queryHryRepay", dataProvider = "provider", description = "借款人还款查询")
    public void cbp_api_resource_com_cbp_biz_hryLoan_facade_rs_HryLoanResource_queryHryRepay(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.hryLoan.facade.rs.HryLoanResource/queryHryRepayPlan", dataProvider = "provider", description = "借款人还款计划查询")
    public void cbp_api_resource_com_cbp_biz_hryLoan_facade_rs_HryLoanResource_queryHryRepayPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.limit.facade.rs.LimitResource/queryLimit", dataProvider = "provider", description = "我的额度申请查询")
    public void cbp_api_resource_com_cbp_biz_limit_facade_rs_LimitResource_queryLimit(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.limit.facade.rs.LimitResource/queryLimitAccount", dataProvider = "provider", description = "授信账户查询")
    public void cbp_api_resource_com_cbp_biz_limit_facade_rs_LimitResource_queryLimitAccount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.loan.facade.rs.LoanResource/createLoan", dataProvider = "provider", description = "借款申请")
    public void cbp_api_resource_com_cbp_biz_loan_facade_rs_LoanResource_createLoan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.loan.facade.rs.LoanResource/getAccount", dataProvider = "provider", description = "交易对方及工贸账户查询")
    public void cbp_api_resource_com_cbp_biz_loan_facade_rs_LoanResource_getAccount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.payment.facade.rs.PaymentDetailResource/queryPaymentDetail", dataProvider = "provider", description = "支付明细查询")
    public void cbp_api_resource_com_cbp_biz_payment_facade_rs_PaymentDetailResource_queryPaymentDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.prepay.facade.rs.PrepayResource/prepayApply", dataProvider = "provider", description = "提前还款申请")
    public void cbp_api_resource_com_cbp_biz_prepay_facade_rs_PrepayResource_prepayApply(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.prepay.facade.rs.PrepayResource/prepayCalculate", dataProvider = "provider", description = "提前还款计算")
    public void cbp_api_resource_com_cbp_biz_prepay_facade_rs_PrepayResource_prepayCalculate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.prepay.facade.rs.PrepayResource/prepayList", dataProvider = "provider", description = "提前还款查询")
    public void cbp_api_resource_com_cbp_biz_prepay_facade_rs_PrepayResource_prepayList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.repay.facade.rs.RepayResource/createRepay", dataProvider = "provider", description = "放款")
    public void cbp_api_resource_com_cbp_biz_repay_facade_rs_RepayResource_createRepay(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.repay.facade.rs.RepayResource/queryLoanRepay", dataProvider = "provider", description = "查询我的借款")
    public void cbp_api_resource_com_cbp_biz_repay_facade_rs_RepayResource_queryLoanRepay(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.repay.facade.rs.RepayResource/queryRepaymentDetail", dataProvider = "provider", description = "查询还款明细")
    public void cbp_api_resource_com_cbp_biz_repay_facade_rs_RepayResource_queryRepaymentDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cbp-api/resource/com.cbp.biz.repay.facade.rs.RepayResource/repay", dataProvider = "provider", description = "还款")
    public void cbp_api_resource_com_cbp_biz_repay_facade_rs_RepayResource_repay(HryTest test) {
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

    @Test(testName = "/virtual/sql", dataProvider = "provider", description = "虚拟接口执行sql")
    public void virtual_sql(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

}
