package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("P2p")
public class P2pDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public P2pDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/agreementFacade/addProductInstruction", dataProvider = "provider", description = "增加产品说明书")
    public void agreementFacade_addProductInstruction(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/getAgreementListByBidId", dataProvider = "provider", description = "查询标的对应的出借人协议列表")
    public void agreementFacade_getAgreementListByBidId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/getAgreementTemplate", dataProvider = "provider", description = "根据标的ID获取协议模版")
    public void agreementFacade_getAgreementTemplate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/getBidAgreement", dataProvider = "provider", description = "根据标的ID获取协议")
    public void agreementFacade_getBidAgreement(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/getHuijinAgreementTemplate", dataProvider = "provider", description = "根据债权ID获取拾财计划协议模版")
    public void agreementFacade_getHuijinAgreementTemplate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/getHuijinContract", dataProvider = "provider", description = "获取合同内容")
    public void agreementFacade_getHuijinContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/getProductContract", dataProvider = "provider", description = "获取合同内容")
    public void agreementFacade_getProductContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/getProductInstructionList", dataProvider = "provider", description = "获取产品说明书列表")
    public void agreementFacade_getProductInstructionList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/getProductInstructions", dataProvider = "provider", description = "根据标的ID获取产品说明书")
    public void agreementFacade_getProductInstructions(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/getTransferOfDebtContract", dataProvider = "provider", description = "获取债转合同内容")
    public void agreementFacade_getTransferOfDebtContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/queryProductInstruction", dataProvider = "provider", description = "获取产品说明书")
    public void agreementFacade_queryProductInstruction(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/agreementFacade/updateProductInstructions", dataProvider = "provider", description = "更新产品说明书")
    public void agreementFacade_updateProductInstructions(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/alterNativeRechargeFacade/addAlterNativeRecharge", dataProvider = "provider", description = "代充值")
    public void alterNativeRechargeFacade_addAlterNativeRecharge(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/alterNativeRechargeFacade/queryAlterNativeRechargeList", dataProvider = "provider", description = "查询代充值列表")
    public void alterNativeRechargeFacade_queryAlterNativeRechargeList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/assetsResourceFacade/loan", dataProvider = "provider", description = "线上放款")
    public void assetsResourceFacade_loan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/assetsResourceFacade/queryAssets", dataProvider = "provider", description = "查询资产信息")
    public void assetsResourceFacade_queryAssets(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/assetsResourceFacade/updateAssfinance", dataProvider = "provider", description = "线上融资(标的发布/废弃)")
    public void assetsResourceFacade_updateAssfinance(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/getAggregatedBidDetail", dataProvider = "provider", description = "查询聚合标的信息，包括标的基础信息、项目描述、借款方信息、风险措施、审核信息")
    public void bidFacade_getAggregatedBidDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/getBidCategoryList", dataProvider = "provider", description = "获取标的Tag")
    public void bidFacade_getBidCategoryList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/getBidDetailByIdList", dataProvider = "provider", description = "根据List[Id]查询标的信息(不包含消金标的)")
    public void bidFacade_getBidDetailByIdList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/getBidIsNoviceProperty", dataProvider = "provider", description = "查询标的是否是新客专享类型")
    public void bidFacade_getBidIsNoviceProperty(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/getBidRuleConfigById", dataProvider = "provider", description = "根据ID获取标的配置规则")
    public void bidFacade_getBidRuleConfigById(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/getBidTypeList", dataProvider = "provider", description = "获取标的Type")
    public void bidFacade_getBidTypeList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/getMatchBidDetailInfo", dataProvider = "provider", description = "匹配详情页面信息")
    public void bidFacade_getMatchBidDetailInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/getTotalAmountBybidAndUser", dataProvider = "provider", description = "根据用户获取指定标的累计投资金额")
    public void bidFacade_getTotalAmountBybidAndUser(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/queryBidDetailByIdList", dataProvider = "provider", description = "根据List[Id]查询标的信息（所有的包含消金标的信息）")
    public void bidFacade_queryBidDetailByIdList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/queryBidListCond", dataProvider = "provider", description = "根据条件查询标的信息")
    public void bidFacade_queryBidListCond(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/queryBidRuleConfigByCondition", dataProvider = "provider", description = "根据条件查询标的配置规则")
    public void bidFacade_queryBidRuleConfigByCondition(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/queryCouponBidListByQueryCond", dataProvider = "provider", description = "根据条件查询标的信息列表(投资券筛选可投标的)")
    public void bidFacade_queryCouponBidListByQueryCond(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/queryExchangeInfo", dataProvider = "provider", description = "查询所有交易所信息")
    public void bidFacade_queryExchangeInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/queryLcjBidListByQueryCond", dataProvider = "provider", description = "根据条件查询标的信息列表(理财金筛选可投标的)")
    public void bidFacade_queryLcjBidListByQueryCond(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/saveBidRuleConfig", dataProvider = "provider", description = "新增标的配置规则")
    public void bidFacade_saveBidRuleConfig(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/updateBidIsNoviceProperty", dataProvider = "provider", description = "更新标的新客专享类型")
    public void bidFacade_updateBidIsNoviceProperty(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/updateBidRuleConfig", dataProvider = "provider", description = "修改标的配置规则")
    public void bidFacade_updateBidRuleConfig(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bidFacade/updateBidRuleConfigEnabledStatus", dataProvider = "provider", description = "修改标的配置启用状态")
    public void bidFacade_updateBidRuleConfigEnabledStatus(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/calculateFacade/getAnnualRate", dataProvider = "provider", description = "获取预期最低年化收益率")
    public void calculateFacade_getAnnualRate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/addRpLabel", dataProvider = "provider", description = "增加预约计划标签信息")
    public void cfFacade_addRpLabel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/caculateCfRepayPlan", dataProvider = "provider", description = "根据优易智投编号计算还款计划")
    public void cfFacade_caculateCfRepayPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/createReserveOrder", dataProvider = "provider", description = "预约投资（消金下单）")
    public void cfFacade_createReserveOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/examineOrAbandonCfPlan", dataProvider = "provider", description = "审批／废弃 优易智投")
    public void cfFacade_examineOrAbandonCfPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/generateCfReservationPlan", dataProvider = "provider", description = "生成消金优易智投")
    public void cfFacade_generateCfReservationPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getCfAgreementTemplate", dataProvider = "provider", description = "根据消金协议模版HTML")
    public void cfFacade_getCfAgreementTemplate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getCfReservationPlan", dataProvider = "provider", description = "查询消金优易智投")
    public void cfFacade_getCfReservationPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getCfReserveInvestPage", dataProvider = "provider", description = "获取预约资产列表（console 后台专用）")
    public void cfFacade_getCfReserveInvestPage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getCfReserveOrderDetail", dataProvider = "provider", description = "获取预约记录详情（console 后台专用）")
    public void cfFacade_getCfReserveOrderDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getCfReserveOrderPage", dataProvider = "provider", description = "获取预约记录列表（console 后台专用）")
    public void cfFacade_getCfReserveOrderPage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getInvestmentProperty", dataProvider = "provider", description = "获取用户投资资产信息")
    public void cfFacade_getInvestmentProperty(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getInvestorInfoByBidId", dataProvider = "provider", description = "获取投资人投资信息")
    public void cfFacade_getInvestorInfoByBidId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getMyInvestPlanRecord", dataProvider = "provider", description = "我的优易智投预约")
    public void cfFacade_getMyInvestPlanRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getMyReservationOrderInfo", dataProvider = "provider", description = "获取我的预约信息，包括订单总数量")
    public void cfFacade_getMyReservationOrderInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getPlanAssetDetail", dataProvider = "provider", description = "我的预约：获取用户的计划资产详情")
    public void cfFacade_getPlanAssetDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getPlanTradeDetail", dataProvider = "provider", description = "根据预约订单编码查询预约记录详情")
    public void cfFacade_getPlanTradeDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getReservationPlanOrder", dataProvider = "provider", description = "根据预约订单号查询预约记录详情")
    public void cfFacade_getReservationPlanOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getReservationPlanOrderDetail", dataProvider = "provider", description = "根据预约订单编码查询预约记录详情")
    public void cfFacade_getReservationPlanOrderDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getReserveOrderByRequestNo", dataProvider = "provider", description = "查询预约投资（消金下单）订单及状态")
    public void cfFacade_getReserveOrderByRequestNo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/getReserveOrderDetail", dataProvider = "provider", description = "查询预约订单详情(H5专用)")
    public void cfFacade_getReserveOrderDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/listCfBidBorrowDetail", dataProvider = "provider", description = "根据标的Id获取借款详情")
    public void cfFacade_listCfBidBorrowDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryBiddingOrder", dataProvider = "provider", description = "根据优易智投查询已购买标的")
    public void cfFacade_queryBiddingOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryCfBidByCfPlan", dataProvider = "provider", description = "根据优易智投查询标的信息（console 后台专用）")
    public void cfFacade_queryCfBidByCfPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryCfOrderByCfPlan", dataProvider = "provider", description = "根据优易智投查询预约记录（console 后台专用）")
    public void cfFacade_queryCfOrderByCfPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryCfPlanByCondition", dataProvider = "provider", description = "根据条件查询优易智投(console 后台专用)")
    public void cfFacade_queryCfPlanByCondition(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryCfPlanDetail", dataProvider = "provider", description = "根据优易智投详情（console 后台专用）")
    public void cfFacade_queryCfPlanDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryCouponReservationPlanByCond", dataProvider = "provider", description = "根据条件查询优易智投（投资券筛选可优易智投）")
    public void cfFacade_queryCouponReservationPlanByCond(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryRepayRecord", dataProvider = "provider", description = "根据优易智投查询回款明细")
    public void cfFacade_queryRepayRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryReservationPlanByStatus", dataProvider = "provider", description = "预约专区:根据预约状态查询预约记录列表，")
    public void cfFacade_queryReservationPlanByStatus(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryReservationPlanDetail", dataProvider = "provider", description = "预约详情:根据优易智投编号查询详情")
    public void cfFacade_queryReservationPlanDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryReservationPlanOrder", dataProvider = "provider", description = "我的预约列表：页面：交易记录-出借记录-预约列表")
    public void cfFacade_queryReservationPlanOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/queryUnfreezeOrders", dataProvider = "provider", description = "解冻订单查询，后台管理专用")
    public void cfFacade_queryUnfreezeOrders(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cfFacade/removeRpLabel", dataProvider = "provider", description = "移除预约计划标签信息")
    public void cfFacade_removeRpLabel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/frontEndFacade/listReservationPlan", dataProvider = "provider", description = "获取消金计划列表")
    public void frontEndFacade_listReservationPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/frontEndFacade/queryNoviceBidDetail", dataProvider = "provider", description = "查询首页新手标的")
    public void frontEndFacade_queryNoviceBidDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/frontEndFacade/queryNoviceBidList", dataProvider = "provider", description = "查询首页新手标的,app专用")
    public void frontEndFacade_queryNoviceBidList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/huijinPlanFacade/changeDebtType", dataProvider = "provider", description = "改变债权类型，用于债权转让")
    public void huijinPlanFacade_changeDebtType(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/huijinPlanFacade/freezeDebt", dataProvider = "provider", description = "冻结债权")
    public void huijinPlanFacade_freezeDebt(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/huijinPlanFacade/getBidRecordIdByDebtId", dataProvider = "provider", description = "根据债权ID 查询投标记录ID")
    public void huijinPlanFacade_getBidRecordIdByDebtId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/huijinPlanFacade/getDebtInfoByBidRecordId", dataProvider = "provider", description = "根据投标记录ID 查询债权信息")
    public void huijinPlanFacade_getDebtInfoByBidRecordId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/huijinPlanFacade/lockDebt", dataProvider = "provider", description = "锁定/解锁债权")
    public void huijinPlanFacade_lockDebt(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsQueryFacade/getBiddingBids", dataProvider = "provider", description = "获取投资中的标的")
    public void ibsQueryFacade_getBiddingBids(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsQueryFacade/getIbsInvestInfo", dataProvider = "provider", description = "获取智能投标的投资信息")
    public void ibsQueryFacade_getIbsInvestInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/createInvestOrder", dataProvider = "provider", description = "投资下单")
    public void investFacade_createInvestOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/getBiddingStatusByVoucherNo", dataProvider = "provider", description = "根据凭证号查询投标状态")
    public void investFacade_getBiddingStatusByVoucherNo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/getInvestmentInfo", dataProvider = "provider", description = "获取用户投资信息")
    public void investFacade_getInvestmentInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/getInvestmentProperty", dataProvider = "provider", description = "获取用户投资资产信息")
    public void investFacade_getInvestmentProperty(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/getInvestStatusByOrderId", dataProvider = "provider", description = "根据订单号查询投资状态")
    public void investFacade_getInvestStatusByOrderId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/getInvestStatusByRequestNo", dataProvider = "provider", description = "根据用户预处理请求流水号查询投资状态(查询非消金投资)")
    public void investFacade_getInvestStatusByRequestNo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/getMyInvestDetail", dataProvider = "provider", description = "查询我的投资交易详情")
    public void investFacade_getMyInvestDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/getNumberOfBidders", dataProvider = "provider", description = "获取标的ID获取该标的已经投资的人数")
    public void investFacade_getNumberOfBidders(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/getOfflineOrder", dataProvider = "provider", description = "获取用户海利计划投资记录")
    public void investFacade_getOfflineOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/getOfflineProperty", dataProvider = "provider", description = "获取用户海利计划资产信息")
    public void investFacade_getOfflineProperty(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/getUserPurchaseRecordListByHryId", dataProvider = "provider", description = "查询用户所有投资记录信息")
    public void investFacade_getUserPurchaseRecordListByHryId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/intelligentInvest", dataProvider = "provider", description = "智能投资")
    public void investFacade_intelligentInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/investCountStatistics", dataProvider = "provider", description = "根据hryIdList统计用户投资笔数")
    public void investFacade_investCountStatistics(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/investCountStatisticsByHryId", dataProvider = "provider", description = "根据hryId统计单个用户投资笔数")
    public void investFacade_investCountStatisticsByHryId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/noviceCheck", dataProvider = "provider", description = "投标，新手效验")
    public void investFacade_noviceCheck(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/queryAllPrincipalAndInterestReceived", dataProvider = "provider", description = "根据hryId查询用户全部待收本息")
    public void investFacade_queryAllPrincipalAndInterestReceived(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/queryInvestByCond", dataProvider = "provider", description = "查询条件查询投资列表（console后台）")
    public void investFacade_queryInvestByCond(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/queryInvestRecord", dataProvider = "provider", description = "获取我的投资列表信息")
    public void investFacade_queryInvestRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/queryMyInvest", dataProvider = "provider", description = "查询我的投资列表")
    public void investFacade_queryMyInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/queryPurchaseCondByHryIdList", dataProvider = "provider", description = "批量查询指定用户的投资情况")
    public void investFacade_queryPurchaseCondByHryIdList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/queryPurchaseRecordList", dataProvider = "provider", description = "查询投资记录")
    public void investFacade_queryPurchaseRecordList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/queryRepaymentRecordList", dataProvider = "provider", description = "根据条件查询用户投资还款信息列表")
    public void investFacade_queryRepaymentRecordList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investFacade/queryTotalMoney", dataProvider = "provider", description = "根据条件查询用户投资总金额")
    public void investFacade_queryTotalMoney(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investReservationFacade/addShortMsgBlackList", dataProvider = "provider", description = "添加短信黑名单")
    public void investReservationFacade_addShortMsgBlackList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investReservationFacade/getInvestReservationList", dataProvider = "provider", description = "获取代客理财")
    public void investReservationFacade_getInvestReservationList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investReservationFacade/getShortMsgBlackList", dataProvider = "provider", description = "获取短信黑名单列表")
    public void investReservationFacade_getShortMsgBlackList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investReservationFacade/removeFromBlackList", dataProvider = "provider", description = "允许短信")
    public void investReservationFacade_removeFromBlackList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanFacade/loanByBid", dataProvider = "provider", description = "标的放款")
    public void loanFacade_loanByBid(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanFacade/queryLoanBid", dataProvider = "provider", description = "查询待放款标的信息")
    public void loanFacade_queryLoanBid(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanFacade/queryLoanBidDetail", dataProvider = "provider", description = "查询放款标的信息")
    public void loanFacade_queryLoanBidDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanFacade/queryLoanOrder", dataProvider = "provider", description = "查询已放款标的信息")
    public void loanFacade_queryLoanOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanFacade/queryUserLoanOrders", dataProvider = "provider", description = "查询放款订单")
    public void loanFacade_queryUserLoanOrders(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanFacade/resendContractMq", dataProvider = "provider", description = "合同系统MQ重发")
    public void loanFacade_resendContractMq(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanFacade/specifyTransfer", dataProvider = "provider", description = "触发指定交易确认")
    public void loanFacade_specifyTransfer(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/messageFacade/sendMessage", dataProvider = "provider", description = "发送消息")
    public void messageFacade_sendMessage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/abandonInvest", dataProvider = "provider", description = "【傲融】认购计划作废")
    public void offlinePlanFacade_abandonInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/addBatchOfflinePlan", dataProvider = "provider", description = "批量添加计划")
    public void offlinePlanFacade_addBatchOfflinePlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/addOfflinePlan", dataProvider = "provider", description = "添加计划")
    public void offlinePlanFacade_addOfflinePlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/crmInvest", dataProvider = "provider", description = "【傲融】CRM客户认购计划,自营投资")
    public void offlinePlanFacade_crmInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/getOfflinePlan", dataProvider = "provider", description = "查询计划")
    public void offlinePlanFacade_getOfflinePlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/getOfflinePlanDetail", dataProvider = "provider", description = "WEB-查询产品详情")
    public void offlinePlanFacade_getOfflinePlanDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/getUserInvestOrder", dataProvider = "provider", description = "获取用户投资订单")
    public void offlinePlanFacade_getUserInvestOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/getWhetherInvest", dataProvider = "provider", description = "是否发起投资")
    public void offlinePlanFacade_getWhetherInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/invalidOrder", dataProvider = "provider", description = "作废订单")
    public void offlinePlanFacade_invalidOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/listOfflineIssuerAndConsignee", dataProvider = "provider", description = "获取发行人和承销商信息")
    public void offlinePlanFacade_listOfflineIssuerAndConsignee(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/listOfflineRepayOrder", dataProvider = "provider", description = "获取用户还款订单")
    public void offlinePlanFacade_listOfflineRepayOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/listReleaseOfflinePlan", dataProvider = "provider", description = "WEB-查询上线产品列表")
    public void offlinePlanFacade_listReleaseOfflinePlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/queryInvestByPage", dataProvider = "provider", description = "根据条件分页查询投资记录")
    public void offlinePlanFacade_queryInvestByPage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/queryOfflinePlan", dataProvider = "provider", description = "分页查询计划")
    public void offlinePlanFacade_queryOfflinePlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/resetOfflineRepayOrder", dataProvider = "provider", description = "重置还款订单")
    public void offlinePlanFacade_resetOfflineRepayOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/setOnOffOfOfflinePlan", dataProvider = "provider", description = "设置线下理财上下线")
    public void offlinePlanFacade_setOnOffOfOfflinePlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/updateOfflinePlan", dataProvider = "provider", description = "修改计划")
    public void offlinePlanFacade_updateOfflinePlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/updateOfflineRepayDate", dataProvider = "provider", description = "修改还款日")
    public void offlinePlanFacade_updateOfflineRepayDate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/updateUserInvestOrder", dataProvider = "provider", description = "修改用户投资订单")
    public void offlinePlanFacade_updateUserInvestOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/offlinePlanFacade/userInvest", dataProvider = "provider", description = "后台-用户预约,外部合作投资")
    public void offlinePlanFacade_userInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/orderFacade/exportPurchaseRecord", dataProvider = "provider", description = "导出查询投资记录")
    public void orderFacade_exportPurchaseRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/orderFacade/getRealTimePurchaseRecord", dataProvider = "provider", description = "获取首页实时理财信息")
    public void orderFacade_getRealTimePurchaseRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/orderFacade/getRepaymentStatusByOrderIdList", dataProvider = "provider", description = "批量查询订单还款状态")
    public void orderFacade_getRepaymentStatusByOrderIdList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/orderFacade/queryPurchaseRecord", dataProvider = "provider", description = "查询投资记录")
    public void orderFacade_queryPurchaseRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/orderFacade/queryPurchaseRecordDetail", dataProvider = "provider", description = "根据投标记录查询标的信息")
    public void orderFacade_queryPurchaseRecordDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/platformMarkingFacade/addAlterNativeRecharge", dataProvider = "provider", description = "新增页面获取用户ID")
    public void platformMarkingFacade_addAlterNativeRecharge(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/platformMarkingFacade/creatPlatformMarking", dataProvider = "provider", description = "平台营销")
    public void platformMarkingFacade_creatPlatformMarking(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/platformMarkingFacade/queryAlterNativeList", dataProvider = "provider", description = "查询代充值列表")
    public void platformMarkingFacade_queryAlterNativeList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/platformMarkingFacade/selectUserInfo", dataProvider = "provider", description = "查询用户信息")
    public void platformMarkingFacade_selectUserInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/productFacade/generateProduct", dataProvider = "provider", description = "发标接口")
    public void productFacade_generateProduct(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/queryTransferOfDebtFacades/getMyAssetByTransferOfDebt", dataProvider = "provider", description = "获取我的债转投资资产信息")
    public void queryTransferOfDebtFacades_getMyAssetByTransferOfDebt(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/queryTransferOfDebtFacades/listMyTransferOfDebt", dataProvider = "provider", description = "获取我的债转投资列表信息")
    public void queryTransferOfDebtFacades_listMyTransferOfDebt(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/queryTransferOfDebtFacades/listRepaymentDetails", dataProvider = "provider", description = "获取回款债转列表")
    public void queryTransferOfDebtFacades_listRepaymentDetails(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/realtimeStatisticsFacade/getBidAndCFRealtimeStatistics", dataProvider = "provider", description = "实时查询募集统计（供console使用）")
    public void realtimeStatisticsFacade_getBidAndCFRealtimeStatistics(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/createAdjustAccountOrder", dataProvider = "provider", description = "创建调账订单")
    public void rechargeAndWithdrawFacade_createAdjustAccountOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/createRechargeOrder", dataProvider = "provider", description = "充值")
    public void rechargeAndWithdrawFacade_createRechargeOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/createWithdrawOrder", dataProvider = "provider", description = "提现")
    public void rechargeAndWithdrawFacade_createWithdrawOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/directWithdraw", dataProvider = "provider", description = "自动提现")
    public void rechargeAndWithdrawFacade_directWithdraw(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/p2pDirectRecharge", dataProvider = "provider", description = "自动充值")
    public void rechargeAndWithdrawFacade_p2pDirectRecharge(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/queryAdjustAccountOrder", dataProvider = "provider", description = "查询调账订单")
    public void rechargeAndWithdrawFacade_queryAdjustAccountOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/queryRechargeList", dataProvider = "provider", description = "【console】查询充值订单列表")
    public void rechargeAndWithdrawFacade_queryRechargeList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/queryRechargeRecord", dataProvider = "provider", description = "前端查询充值交易记录")
    public void rechargeAndWithdrawFacade_queryRechargeRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/queryRechargeRecordDetail", dataProvider = "provider", description = "前端查询充值交易记录详情")
    public void rechargeAndWithdrawFacade_queryRechargeRecordDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/queryWithdrawList", dataProvider = "provider", description = "【console】查询所有用户提现列表")
    public void rechargeAndWithdrawFacade_queryWithdrawList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/queryWithdrawRecord", dataProvider = "provider", description = "前端查询用户提现订单")
    public void rechargeAndWithdrawFacade_queryWithdrawRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/queryWithdrawRecordDetail", dataProvider = "provider", description = "前端查询提现交易详情")
    public void rechargeAndWithdrawFacade_queryWithdrawRecordDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rechargeAndWithdrawFacade/sumWithdrawPending", dataProvider = "provider", description = "查询提现中的总金额")
    public void rechargeAndWithdrawFacade_sumWithdrawPending(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/reconFacade/queryBackrollReconciliation", dataProvider = "provider", description = "查询资金回退充值订单对账信息")
    public void reconFacade_queryBackrollReconciliation(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/reconFacade/queryCommissionInfo", dataProvider = "provider", description = "查询佣金对账信息")
    public void reconFacade_queryCommissionInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/reconFacade/queryRechargeReconciliation", dataProvider = "provider", description = "查询充值订单对账信息")
    public void reconFacade_queryRechargeReconciliation(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/reconFacade/queryReconInfo", dataProvider = "provider", description = "查询交易对账信息")
    public void reconFacade_queryReconInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/reconFacade/queryWithdrawReconciliation", dataProvider = "provider", description = "查询提现充值订单对账信息")
    public void reconFacade_queryWithdrawReconciliation(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/regionFacade/getSubRegion", dataProvider = "provider", description = "根据ID查询上级地区信息")
    public void regionFacade_getSubRegion(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/regionFacade/regionInfo", dataProvider = "provider", description = "查询地区信息接口")
    public void regionFacade_regionInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/autoPrepayment", dataProvider = "provider", description = "融资人提前代扣还款")
    public void repaymentFacade_autoPrepayment(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/financierAutoRepayment", dataProvider = "provider", description = "融资人代扣还款")
    public void repaymentFacade_financierAutoRepayment(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/financierRepayment", dataProvider = "provider", description = "融资人还款")
    public void repaymentFacade_financierRepayment(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/financierRepaymentWithExinterest", dataProvider = "provider", description = "融资人还款(无息)。场景：募集成功、放款后，借款人又不借了。")
    public void repaymentFacade_financierRepaymentWithExinterest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/financierStatistics", dataProvider = "provider", description = "融资统计")
    public void repaymentFacade_financierStatistics(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/getBidHkjh", dataProvider = "provider", description = "查询标的标还款记录(标的应还款信息查询接口)")
    public void repaymentFacade_getBidHkjh(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/getFinancierRepaymentOrder", dataProvider = "provider", description = "查询融资人还款记录 详情")
    public void repaymentFacade_getFinancierRepaymentOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/getInvestorRepaymentDetail", dataProvider = "provider", description = "查询投资人收款明细详情")
    public void repaymentFacade_getInvestorRepaymentDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/getPrepaymentCompensationOrderDetail", dataProvider = "provider", description = "根据提前还款补偿订单记录ID查询订单状态")
    public void repaymentFacade_getPrepaymentCompensationOrderDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/getRepayingDetail", dataProvider = "provider", description = "查询最近一期还款详情")
    public void repaymentFacade_getRepayingDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/getReserveRepaymentDetail", dataProvider = "provider", description = "查询投资人-预约回款详情")
    public void repaymentFacade_getReserveRepaymentDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/listFinancierRepaymentOrders", dataProvider = "provider", description = "查询融资人还款记录")
    public void repaymentFacade_listFinancierRepaymentOrders(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/listFinancierRepaymentOrdersConsole", dataProvider = "provider", description = "查询融资人还款记录（console使用）")
    public void repaymentFacade_listFinancierRepaymentOrdersConsole(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/listFinancierRepaymentPlans", dataProvider = "provider", description = "查询标的还款明细")
    public void repaymentFacade_listFinancierRepaymentPlans(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/listInvestorRepaymentDetails", dataProvider = "provider", description = "查询投资人收款明细")
    public void repaymentFacade_listInvestorRepaymentDetails(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/listInvestorRepaymentDetailsConsole", dataProvider = "provider", description = "查询投资人收款明细（Console使用）")
    public void repaymentFacade_listInvestorRepaymentDetailsConsole(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/listPrepaymentCompensationConsole", dataProvider = "provider", description = "提前还款补偿查询记录明细（Console使用）")
    public void repaymentFacade_listPrepaymentCompensationConsole(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/prepayment", dataProvider = "provider", description = "融资人提前还款")
    public void repaymentFacade_prepayment(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/prepaymentApplication", dataProvider = "provider", description = "提前还款申请与审核")
    public void repaymentFacade_prepaymentApplication(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryBiddersHkjh", dataProvider = "provider", description = "查询用户投标还款计划信息")
    public void repaymentFacade_queryBiddersHkjh(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryCfBiddingOrderHkjh", dataProvider = "provider", description = "查询用户预约标的还款计划信息")
    public void repaymentFacade_queryCfBiddingOrderHkjh(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryExistsPrepaymentPlan", dataProvider = "provider", description = "查询已经提前还款的计划详情")
    public void repaymentFacade_queryExistsPrepaymentPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryPerfectHkjh", dataProvider = "provider", description = "查询标的还款计划")
    public void repaymentFacade_queryPerfectHkjh(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryPrepaymentApplication", dataProvider = "provider", description = "查询提前还款标的信息")
    public void repaymentFacade_queryPrepaymentApplication(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryPrepaymentPlan", dataProvider = "provider", description = "查询提前还款计划")
    public void repaymentFacade_queryPrepaymentPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryRepayingBids", dataProvider = "provider", description = "查询还款中标的")
    public void repaymentFacade_queryRepayingBids(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryRepaymentBids", dataProvider = "provider", description = "融资查询")
    public void repaymentFacade_queryRepaymentBids(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryRepaymentDetail", dataProvider = "provider", description = "【console】查询标的还款、代偿详情")
    public void repaymentFacade_queryRepaymentDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryRepaymentList", dataProvider = "provider", description = "【console】查询标的还款、代偿列表")
    public void repaymentFacade_queryRepaymentList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryReserveRepaymentDetails", dataProvider = "provider", description = "查询投资人-预约回款列表")
    public void repaymentFacade_queryReserveRepaymentDetails(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/querySettledBids", dataProvider = "provider", description = "查询已结清标的")
    public void repaymentFacade_querySettledBids(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryUeBidRepaymentPlan", dataProvider = "provider", description = "查询优易智投标的借款人还款计划（Console使用）")
    public void repaymentFacade_queryUeBidRepaymentPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/queryUnpaidBidDetail", dataProvider = "provider", description = "【console】查询待还款标的详情")
    public void repaymentFacade_queryUnpaidBidDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/rebuildInvestorRepaymentDetailsConsole", dataProvider = "provider", description = "重发失败的还款确认明细（Console使用）")
    public void repaymentFacade_rebuildInvestorRepaymentDetailsConsole(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/repaymentFacade/rebuildPrepaymentCompensationConsole", dataProvider = "provider", description = "重发失败的提前还款补偿确认明细（Console使用）")
    public void repaymentFacade_rebuildPrepaymentCompensationConsole(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/riskLevelFacade/listRiskLevelInfo", dataProvider = "provider", description = "风险等级信息")
    public void riskLevelFacade_listRiskLevelInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/stockPrepaymentApplyFacade/listStockPrepayment", dataProvider = "provider", description = "根据条件查询存量提前还款列表")
    public void stockPrepaymentApplyFacade_listStockPrepayment(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/stockPrepaymentApplyFacade/listStockPrepaymentByIds", dataProvider = "provider", description = "根据条件查询存量提前还款列表")
    public void stockPrepaymentApplyFacade_listStockPrepaymentByIds(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/addBatchEnclosure", dataProvider = "provider", description = "新增批量附件")
    public void tenderFacade_addBatchEnclosure(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/addBidExtraInfo", dataProvider = "provider", description = "新增标的附加信息")
    public void tenderFacade_addBidExtraInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/addBidLabel", dataProvider = "provider", description = "新增标的的标签")
    public void tenderFacade_addBidLabel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/addEnclosure", dataProvider = "provider", description = "新增附件")
    public void tenderFacade_addEnclosure(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/addLabelInfo", dataProvider = "provider", description = "增加标签")
    public void tenderFacade_addLabelInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/agreeTenderBidInfo", dataProvider = "provider", description = "审核同意标的信息接口")
    public void tenderFacade_agreeTenderBidInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/checkReleaseQueueBidValiad", dataProvider = "provider", description = "校验发布队列标的有效性")
    public void tenderFacade_checkReleaseQueueBidValiad(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/createBidToCopy", dataProvider = "provider", description = "根据当前标的复制创建新标的")
    public void tenderFacade_createBidToCopy(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/deleteBidLabel", dataProvider = "provider", description = "删除标的的标签")
    public void tenderFacade_deleteBidLabel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/deleteEnclosure", dataProvider = "provider", description = "删除附件")
    public void tenderFacade_deleteEnclosure(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/deleteLabelInfo", dataProvider = "provider", description = "删除标签")
    public void tenderFacade_deleteLabelInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/disagreeTenderBidInfo", dataProvider = "provider", description = "审核不同意标的信息接口")
    public void tenderFacade_disagreeTenderBidInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/discardTenderBidInfo", dataProvider = "provider", description = "作废标的信息接口")
    public void tenderFacade_discardTenderBidInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/getBidExtraInfo", dataProvider = "provider", description = "查询标的附加信息")
    public void tenderFacade_getBidExtraInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/getEnclosure", dataProvider = "provider", description = "查询附件")
    public void tenderFacade_getEnclosure(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/getEnclosureTypes", dataProvider = "provider", description = "查询附件类型")
    public void tenderFacade_getEnclosureTypes(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/getLabelInfos", dataProvider = "provider", description = "查询标签")
    public void tenderFacade_getLabelInfos(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/getLabelInfosByBid", dataProvider = "provider", description = "查询标的标签")
    public void tenderFacade_getLabelInfosByBid(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/getRepayPlanPage", dataProvider = "provider", description = "后台查询还款计划（分页）")
    public void tenderFacade_getRepayPlanPage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/getTenderBidInfo", dataProvider = "provider", description = "发标后台标的详情接口")
    public void tenderFacade_getTenderBidInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/getTenderBidList", dataProvider = "provider", description = "发标后台列表接口")
    public void tenderFacade_getTenderBidList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/getUserLogDetailPageInfo", dataProvider = "provider", description = "获取用户日志分页信息")
    public void tenderFacade_getUserLogDetailPageInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/miscarryBid", dataProvider = "provider", description = "指定待放款的标的流标")
    public void tenderFacade_miscarryBid(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/preReleaseTenderBidInfo", dataProvider = "provider", description = "预发布标的信息接口")
    public void tenderFacade_preReleaseTenderBidInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/queryBidCheckList", dataProvider = "provider", description = "查询标的审核信息")
    public void tenderFacade_queryBidCheckList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/queryBidListByQueueId", dataProvider = "provider", description = "根据标的发布队列查询标的列表信息")
    public void tenderFacade_queryBidListByQueueId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/queryBidReleaseQueueByCond", dataProvider = "provider", description = "根据条件查询标的发布队列")
    public void tenderFacade_queryBidReleaseQueueByCond(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/releaseTenderBidInfo", dataProvider = "provider", description = "发布标的信息接口")
    public void tenderFacade_releaseTenderBidInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/saveBidReleaseQueue", dataProvider = "provider", description = "新增标的发布队列")
    public void tenderFacade_saveBidReleaseQueue(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/settingScheduleReleaseTime", dataProvider = "provider", description = "设置标的定时发布时间")
    public void tenderFacade_settingScheduleReleaseTime(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/submitBidInfo", dataProvider = "provider", description = "提交标的信息")
    public void tenderFacade_submitBidInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/updateBidExtraInfo", dataProvider = "provider", description = "更新标的附加信息")
    public void tenderFacade_updateBidExtraInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/updateBidReleaseQueue", dataProvider = "provider", description = "修改标的发布队列")
    public void tenderFacade_updateBidReleaseQueue(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/updateLabel", dataProvider = "provider", description = "更新标签")
    public void tenderFacade_updateLabel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tenderFacade/updateTenderBidInfo", dataProvider = "provider", description = "更新标的信息")
    public void tenderFacade_updateTenderBidInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFacade/getMatchBidRemarkByIds", dataProvider = "provider", description = "根据标的Id集合获取对应流标退标备注(管理后台使用)")
    public void uePlanFacade_getMatchBidRemarkByIds(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFacade/getUeMatchedInfo", dataProvider = "provider", description = "根据优易智投授权订单获取匹配信息 - (uePlan系统)")
    public void uePlanFacade_getUeMatchedInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFacade/listAuthOrderProfitAmount", dataProvider = "provider", description = "根据授权码集合,获取对应的收益")
    public void uePlanFacade_listAuthOrderProfitAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFacade/listBidByUeAuthRequestNo", dataProvider = "provider", description = "根据优易智投授权订单获取匹配标的列表 - (前端)")
    public void uePlanFacade_listBidByUeAuthRequestNo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFacade/listMatchingBid", dataProvider = "provider", description = "获取待匹配的标的信息")
    public void uePlanFacade_listMatchingBid(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFacade/listMyStandardBid", dataProvider = "provider", description = "获取我的散标 - （前端，我的出借）")
    public void uePlanFacade_listMyStandardBid(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFacade/listUeBidStatisticsInfo", dataProvider = "provider", description = "获取优易智投下标的统计信息 - (uePlan系统)")
    public void uePlanFacade_listUeBidStatisticsInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFacade/queryUeMatchedBidHkjh", dataProvider = "provider", description = "查询优易匹配标的还款计划/匹配详情 - (前端)")
    public void uePlanFacade_queryUeMatchedBidHkjh(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/uePlanFacade/queryUeMatchedBidInfo", dataProvider = "provider", description = "优易智投标的信息查询(供ueplan使用)")
    public void uePlanFacade_queryUeMatchedBidInfo(HryTest test) {
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

    @Test(testName = "/yyTradeStatFacade/annualInvestmentAmount", dataProvider = "provider", description = "根据投资时间和海融易id,查询该时间段内的年化投资总额")
    public void yyTradeStatFacade_annualInvestmentAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/yyTradeStatFacade/getInvestmentTotalAmount", dataProvider = "provider", description = "根据投资时间和ID，查询用户该时间段内的投资金额")
    public void yyTradeStatFacade_getInvestmentTotalAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/yyTradeStatFacade/loanCalculate", dataProvider = "provider", description = "贷款/收益计算器")
    public void yyTradeStatFacade_loanCalculate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/yyTradeStatFacade/queryBidOrderByBidRecordId", dataProvider = "provider", description = "根据投资记录号（bidRecordId）查询投资订单")
    public void yyTradeStatFacade_queryBidOrderByBidRecordId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/yyTradeStatFacade/queryBidOrderByOrderId", dataProvider = "provider", description = "根据投资订单号（orderId）查询投资订单）")
    public void yyTradeStatFacade_queryBidOrderByOrderId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/yyTradeStatFacade/queryInvestmentRecord", dataProvider = "provider", description = "根据客户端ID,加密后的user id,查询该用户的所有投资记录")
    public void yyTradeStatFacade_queryInvestmentRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/yyTradeStatFacade/queryTenderRecordRecord", dataProvider = "provider", description = "根据客户端ID,加密后的user id,查询该用户的散标投资记录")
    public void yyTradeStatFacade_queryTenderRecordRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/yyTradeStatFacade/totalInvestmentAmount", dataProvider = "provider", description = "根据投资时间和海融易id,查询这段时间内的投资总金额")
    public void yyTradeStatFacade_totalInvestmentAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/yyTradeStatFacade/twoAnniversary", dataProvider = "provider", description = "根据投资时间和ID，查询用户该时间段内的投资金额(只包含标的期限30天以上)")
    public void yyTradeStatFacade_twoAnniversary(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

}
