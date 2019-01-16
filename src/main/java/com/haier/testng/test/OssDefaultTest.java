package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("Oss")
public class OssDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public OssDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/behaviorAnalysisFacade/addMarketingPushMessage", dataProvider = "provider", description = "推送消息")
    public void behaviorAnalysisFacade_addMarketingPushMessage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/behaviorAnalysisFacade/addMarketingSendRewards", dataProvider = "provider", description = "发送奖励")
    public void behaviorAnalysisFacade_addMarketingSendRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/behaviorAnalysisFacade/addMarketingSendSms", dataProvider = "provider", description = "发送短信")
    public void behaviorAnalysisFacade_addMarketingSendSms(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/behaviorAnalysisFacade/getAllUserBehaviorAnalysisResult", dataProvider = "provider", description = "查询所有用户")
    public void behaviorAnalysisFacade_getAllUserBehaviorAnalysisResult(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/behaviorAnalysisFacade/getBehaviorAnalysisResult", dataProvider = "provider", description = "根据营销行为查询用户")
    public void behaviorAnalysisFacade_getBehaviorAnalysisResult(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/behaviorAnalysisFacade/getMarketingBehaviorAnalysisRecord", dataProvider = "provider", description = "获取查询的信息")
    public void behaviorAnalysisFacade_getMarketingBehaviorAnalysisRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/behaviorAnalysisFacade/getMarketingBehaviorAnalysisRecordList", dataProvider = "provider", description = "获取查询的信息分页列表")
    public void behaviorAnalysisFacade_getMarketingBehaviorAnalysisRecordList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/commonFacade/executeTask", dataProvider = "provider", description = "执行任务")
    public void commonFacade_executeTask(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/commonFacade/getAccountBalance", dataProvider = "provider", description = "获取账户余额")
    public void commonFacade_getAccountBalance(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/commonFacade/getAccountBalanceAlarm", dataProvider = "provider", description = "获取账户预警金额")
    public void commonFacade_getAccountBalanceAlarm(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/commonFacade/getFeatureWhiteList", dataProvider = "provider", description = "根据hryid获取功能列表信息")
    public void commonFacade_getFeatureWhiteList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/commonFacade/getOperatingAccountExpense", dataProvider = "provider", description = "根据时间获取运营户支出信息")
    public void commonFacade_getOperatingAccountExpense(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/commonFacade/getOperatingAccountRecharge", dataProvider = "provider", description = "根据时间获取运营户支出信息")
    public void commonFacade_getOperatingAccountRecharge(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/commonFacade/pushMessage", dataProvider = "provider", description = "推送消息")
    public void commonFacade_pushMessage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/commonFacade/sendSms", dataProvider = "provider", description = "批量发送短信")
    public void commonFacade_sendSms(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/commonFacade/setAccountBalanceAlarm", dataProvider = "provider", description = "设置账户预警金额和邮箱")
    public void commonFacade_setAccountBalanceAlarm(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/compensateFacade/addPrepaymentCompensateRecord", dataProvider = "provider", description = "提前还款补偿")
    public void compensateFacade_addPrepaymentCompensateRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/compensateFacade/addReservationCompensateRecord", dataProvider = "provider", description = "预约补偿")
    public void compensateFacade_addReservationCompensateRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleBirthFacade/deleteByBatchNo", dataProvider = "provider", description = "删除活动活动规则")
    public void consoleBirthFacade_deleteByBatchNo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleBirthFacade/getBirthRuleByBatchNo", dataProvider = "provider", description = "根据批次号查询生日特权规则")
    public void consoleBirthFacade_getBirthRuleByBatchNo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleBirthFacade/getBirthRuleByPromotionActivityId", dataProvider = "provider", description = "根据活动ID查询生日特权规则")
    public void consoleBirthFacade_getBirthRuleByPromotionActivityId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleBirthFacade/saveActivityRule", dataProvider = "provider", description = "保存活动规则配置")
    public void consoleBirthFacade_saveActivityRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleMemberLevelFacade/addMemberInvestRule", dataProvider = "provider", description = "新增投资奖励权益规则")
    public void consoleMemberLevelFacade_addMemberInvestRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleMemberLevelFacade/deleteMemberInvestRule", dataProvider = "provider", description = "删除投资奖励权益规则")
    public void consoleMemberLevelFacade_deleteMemberInvestRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleMemberLevelFacade/getMemberLevelList", dataProvider = "provider", description = "查询会员等级规则列表")
    public void consoleMemberLevelFacade_getMemberLevelList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleMemberLevelFacade/queryMemberInvestActivityRuleInfo", dataProvider = "provider", description = "查询投资奖励权益活动和规则信息")
    public void consoleMemberLevelFacade_queryMemberInvestActivityRuleInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleMemberLevelFacade/queryMemberInvestRule", dataProvider = "provider", description = "查询投资奖励权益规则")
    public void consoleMemberLevelFacade_queryMemberInvestRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleMemberLevelFacade/setMemberLevelList", dataProvider = "provider", description = "设置会员等级规则")
    public void consoleMemberLevelFacade_setMemberLevelList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consoleMemberLevelFacade/updateMemberInvestRule", dataProvider = "provider", description = "更新投资奖励权益规则")
    public void consoleMemberLevelFacade_updateMemberInvestRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/addBlackList", dataProvider = "provider", description = "新增黑名单")
    public void consolePromotionFacade_addBlackList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/addMerchantChannel", dataProvider = "provider", description = "新增商户活动渠道")
    public void consolePromotionFacade_addMerchantChannel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/addPromotionActivity", dataProvider = "provider", description = "新增活动信息")
    public void consolePromotionFacade_addPromotionActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/addPromotionActivityRule", dataProvider = "provider", description = "新增活动规则")
    public void consolePromotionFacade_addPromotionActivityRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/deleteBlackList", dataProvider = "provider", description = "删除黑名单")
    public void consolePromotionFacade_deleteBlackList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/deletePromotionActivityRule", dataProvider = "provider", description = "删除活动规则")
    public void consolePromotionFacade_deletePromotionActivityRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/getInvestRankActivity", dataProvider = "provider", description = "查询打榜活动")
    public void consolePromotionFacade_getInvestRankActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/getMerchantChannel", dataProvider = "provider", description = "查询商户渠道信息")
    public void consolePromotionFacade_getMerchantChannel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/getMerchantChannelList", dataProvider = "provider", description = "查询商户渠道列表")
    public void consolePromotionFacade_getMerchantChannelList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/getPromotionActivity", dataProvider = "provider", description = "查询活动信息")
    public void consolePromotionFacade_getPromotionActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/getPromotionActivityDetail", dataProvider = "provider", description = "查看推广活动活动及其活动规则信息")
    public void consolePromotionFacade_getPromotionActivityDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/getPromotionActivityList", dataProvider = "provider", description = "获取推广活动列表: 1、渠道ID为空: 查询全部推广; 2、渠道ID为0: 查询普通推广; 3、其他渠道ID: 查询商户推广;")
    public void consolePromotionFacade_getPromotionActivityList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/getPromotionActivityRule", dataProvider = "provider", description = "查看活动规则")
    public void consolePromotionFacade_getPromotionActivityRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/getPromotionActivityRuleList", dataProvider = "provider", description = "查看推广活动规则列表")
    public void consolePromotionFacade_getPromotionActivityRuleList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/getPromotionRewardsInfo", dataProvider = "provider", description = "查询推广活动奖励统计信息")
    public void consolePromotionFacade_getPromotionRewardsInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/queryPromotionRewards", dataProvider = "provider", description = "海融易推广活动奖励查询")
    public void consolePromotionFacade_queryPromotionRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/saveInvestRankActivity", dataProvider = "provider", description = "保存打榜活动")
    public void consolePromotionFacade_saveInvestRankActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/updateInvestRankActivity", dataProvider = "provider", description = "更新打榜活动")
    public void consolePromotionFacade_updateInvestRankActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/updateMerchantChannel", dataProvider = "provider", description = "修改商户活动渠道")
    public void consolePromotionFacade_updateMerchantChannel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/updatePromotionActivity", dataProvider = "provider", description = "更新活动信息")
    public void consolePromotionFacade_updatePromotionActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consolePromotionFacade/updatePromotionActivityRule", dataProvider = "provider", description = "更新活动规则")
    public void consolePromotionFacade_updatePromotionActivityRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/activateCoupon", dataProvider = "provider", description = "激活券")
    public void couponFacade_activateCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/addBatchCoupon", dataProvider = "provider", description = "批量生成券/券包")
    public void couponFacade_addBatchCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/addCouponCategory", dataProvider = "provider", description = "添加CouponCategory信息")
    public void couponFacade_addCouponCategory(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/addCouponGroup", dataProvider = "provider", description = "添加CouponGroup信息")
    public void couponFacade_addCouponGroup(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/addGrabCouponActivity", dataProvider = "provider", description = "新增领券活动")
    public void couponFacade_addGrabCouponActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/addPrepaidCoupon", dataProvider = "provider", description = "新增抵扣券")
    public void couponFacade_addPrepaidCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/auditBatchCoupon", dataProvider = "provider", description = "批量生成券审核")
    public void couponFacade_auditBatchCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/deleteBatchCoupon", dataProvider = "provider", description = "批量生成券删除")
    public void couponFacade_deleteBatchCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/exchangePrepaidCouponWithLcj", dataProvider = "provider", description = "抵用金兑换抵扣券")
    public void couponFacade_exchangePrepaidCouponWithLcj(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/freezeCoupon", dataProvider = "provider", description = "冻结券")
    public void couponFacade_freezeCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/generateCouponRewards", dataProvider = "provider", description = "生成优惠券奖励，生成的Coupon状态为COUPON_INTERNAL_ACTIVITY")
    public void couponFacade_generateCouponRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getAvailableCouponList", dataProvider = "provider", description = "查询当前产品可用券列表")
    public void couponFacade_getAvailableCouponList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getAvailableRewardsListForBid", dataProvider = "provider", description = "查询用户智能标的可用券")
    public void couponFacade_getAvailableRewardsListForBid(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getBatchCouponDetailList", dataProvider = "provider", description = "批量生成券查看(返回某一批次生成的券信息列表)")
    public void couponFacade_getBatchCouponDetailList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getBatchCouponList", dataProvider = "provider", description = "批量生成券/券包查询")
    public void couponFacade_getBatchCouponList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getBidSubsidyValue", dataProvider = "provider", description = "查询投资加息金额")
    public void couponFacade_getBidSubsidyValue(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCountForNonSendCoupon", dataProvider = "provider", description = "获取第三方券未发放的个数")
    public void couponFacade_getCountForNonSendCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCoupon", dataProvider = "provider", description = "券使用情况查询")
    public void couponFacade_getCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponAmount", dataProvider = "provider", description = "券数量统计")
    public void couponFacade_getCouponAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponAndGroupItemList", dataProvider = "provider", description = "会员的券和券包信息")
    public void couponFacade_getCouponAndGroupItemList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponCategory", dataProvider = "provider", description = "获取CouponCategory信息")
    public void couponFacade_getCouponCategory(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponCategoryAndGroupList", dataProvider = "provider", description = "获取CouponCategory/CouponGroup列表")
    public void couponFacade_getCouponCategoryAndGroupList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponCategoryAndGroupListForActivity", dataProvider = "provider", description = "查询配置活动券/券包列表")
    public void couponFacade_getCouponCategoryAndGroupListForActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponCategoryList", dataProvider = "provider", description = "获取CouponCategoryList信息")
    public void couponFacade_getCouponCategoryList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponDetailList", dataProvider = "provider", description = "券明细查询")
    public void couponFacade_getCouponDetailList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponDoubledCategoryList", dataProvider = "provider", description = "获取CouponCategory信息")
    public void couponFacade_getCouponDoubledCategoryList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponGroup", dataProvider = "provider", description = "获取CouponGroup信息")
    public void couponFacade_getCouponGroup(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponSubsidyValue", dataProvider = "provider", description = "获取加息券收益")
    public void couponFacade_getCouponSubsidyValue(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getCouponValue", dataProvider = "provider", description = "券金额统计")
    public void couponFacade_getCouponValue(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getExchangePrepaidCouponList", dataProvider = "provider", description = "获取可兑换的抵扣券列表")
    public void couponFacade_getExchangePrepaidCouponList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getGrabCouponActivity", dataProvider = "provider", description = "查看领券活动")
    public void couponFacade_getGrabCouponActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getImportThirdPartyCoupon", dataProvider = "provider", description = "查询异业券文件列表")
    public void couponFacade_getImportThirdPartyCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getLcjExchangeRecordList", dataProvider = "provider", description = "获取已兑换记录")
    public void couponFacade_getLcjExchangeRecordList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getPrepaidCouponInfo", dataProvider = "provider", description = "查询抵扣券信息")
    public void couponFacade_getPrepaidCouponInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getReportThirdPartyCouponRewards", dataProvider = "provider", description = "查询异业券发放列表")
    public void couponFacade_getReportThirdPartyCouponRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getSummarizingPayout", dataProvider = "provider", description = "发放汇总")
    public void couponFacade_getSummarizingPayout(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getUnfulfilledSubsidy", dataProvider = "provider", description = "提前还款导致减少的贴息和加息")
    public void couponFacade_getUnfulfilledSubsidy(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getUsablePrepaidCouponList", dataProvider = "provider", description = "获取可用抵扣券列表")
    public void couponFacade_getUsablePrepaidCouponList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getUsedPrepaidCouponOrderList", dataProvider = "provider", description = "获取使用抵扣券订单列表")
    public void couponFacade_getUsedPrepaidCouponOrderList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/getUsedSummarizing", dataProvider = "provider", description = "使用汇总")
    public void couponFacade_getUsedSummarizing(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/grabCoupon", dataProvider = "provider", description = "领取券")
    public void couponFacade_grabCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/queryCouponList", dataProvider = "provider", description = "查询用户券信息列表")
    public void couponFacade_queryCouponList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/queryFreezeRewards", dataProvider = "provider", description = "查询冻结奖励")
    public void couponFacade_queryFreezeRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/queryGrabCouponActivity", dataProvider = "provider", description = "定时发放券查看")
    public void couponFacade_queryGrabCouponActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/queryGrabCouponSessionItem", dataProvider = "provider", description = "查询某一时间段有哪些奖励")
    public void couponFacade_queryGrabCouponSessionItem(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/queryGrabCouponSessionItemByDate", dataProvider = "provider", description = "查询某天有哪些奖励")
    public void couponFacade_queryGrabCouponSessionItemByDate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/queryGrabCouponSessionSummary", dataProvider = "provider", description = "查询某一时间段有哪些场次（概要）")
    public void couponFacade_queryGrabCouponSessionSummary(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/queryMemberRewardList", dataProvider = "provider", description = "查询会员推广奖励-抵用券")
    public void couponFacade_queryMemberRewardList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/queryNextGrabCouponSessionItemByDate", dataProvider = "provider", description = "查询某天之后的第一天有哪些奖励")
    public void couponFacade_queryNextGrabCouponSessionItemByDate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/refundCoupon", dataProvider = "provider", description = "券退款")
    public void couponFacade_refundCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/unFreezeCoupon", dataProvider = "provider", description = "解冻券")
    public void couponFacade_unFreezeCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/updateCouponGroup", dataProvider = "provider", description = "编辑CouponGroup信息")
    public void couponFacade_updateCouponGroup(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/updateGrabCouponActivity", dataProvider = "provider", description = "编辑领券活动")
    public void couponFacade_updateGrabCouponActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/updatePrepaidCoupon", dataProvider = "provider", description = "修改抵扣券")
    public void couponFacade_updatePrepaidCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/useCoupon", dataProvider = "provider", description = "券使用")
    public void couponFacade_useCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/couponFacade/validateCoupon", dataProvider = "provider", description = "券使用验证")
    public void couponFacade_validateCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/loanUnderUmbrellaFacade/addLoansUnderUmbrellaRegisterInfo", dataProvider = "provider", description = "增加伞下贷注册信息")
    public void loanUnderUmbrellaFacade_addLoansUnderUmbrellaRegisterInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/addUserMessage", dataProvider = "provider", description = "新增消息")
    public void memberLevelFacade_addUserMessage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/checkIn", dataProvider = "provider", description = "会员签到")
    public void memberLevelFacade_checkIn(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/deleteMemberMonthlyCouponRule", dataProvider = "provider", description = "删除会员每月返券权益规则")
    public void memberLevelFacade_deleteMemberMonthlyCouponRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/deleteMemberUpGradeRule", dataProvider = "provider", description = "删除会员每月返券权益规则")
    public void memberLevelFacade_deleteMemberUpGradeRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getCheckInSeriesInfo", dataProvider = "provider", description = "获取会员连续签到信息")
    public void memberLevelFacade_getCheckInSeriesInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getCheckInState", dataProvider = "provider", description = "查看用户某日是否签到")
    public void memberLevelFacade_getCheckInState(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getCheckInStatisticInfo", dataProvider = "provider", description = "查询用户签到统计信息")
    public void memberLevelFacade_getCheckInStatisticInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberCheckinActivityInfo", dataProvider = "provider", description = "查看会员签到活动信息")
    public void memberLevelFacade_getMemberCheckinActivityInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberCheckinRuleList", dataProvider = "provider", description = "查看会员签到权益规则列表")
    public void memberLevelFacade_getMemberCheckinRuleList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberLevelActivity", dataProvider = "provider", description = "获取会员等级活动信息")
    public void memberLevelFacade_getMemberLevelActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberLevelDetail", dataProvider = "provider", description = "获取会员等级详情")
    public void memberLevelFacade_getMemberLevelDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberLevelDetailByLoginName", dataProvider = "provider", description = "根据登录名获取会员等级详情")
    public void memberLevelFacade_getMemberLevelDetailByLoginName(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberLevelList", dataProvider = "provider", description = "查询会员等级规则列表")
    public void memberLevelFacade_getMemberLevelList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberLevelPointHistory", dataProvider = "provider", description = "获取会员历史积分变动")
    public void memberLevelFacade_getMemberLevelPointHistory(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberLevelPointTrend", dataProvider = "provider", description = "获取会员积分趋势")
    public void memberLevelFacade_getMemberLevelPointTrend(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberMonthlyCouponActivityInfo", dataProvider = "provider", description = "查看会员每月返券活动信息")
    public void memberLevelFacade_getMemberMonthlyCouponActivityInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberMonthlyCouponRuleList", dataProvider = "provider", description = "查看会员规则列表")
    public void memberLevelFacade_getMemberMonthlyCouponRuleList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberPrivilege", dataProvider = "provider", description = "查看当前用户等级参与活动规则信息")
    public void memberLevelFacade_getMemberPrivilege(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberRewardsStatisticInfo", dataProvider = "provider", description = "查询会员权益奖励统计信息")
    public void memberLevelFacade_getMemberRewardsStatisticInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberUpGradeActivityInfo", dataProvider = "provider", description = "查看会员升级活动信息")
    public void memberLevelFacade_getMemberUpGradeActivityInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/getMemberUpGradeRuleList", dataProvider = "provider", description = "查看会员升级规则列表")
    public void memberLevelFacade_getMemberUpGradeRuleList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/queryCheckInDays", dataProvider = "provider", description = "根据时间范围查询哪些天有签到信息")
    public void memberLevelFacade_queryCheckInDays(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/queryCheckInRewardsValue", dataProvider = "provider", description = "查询指定时间段累计签到金")
    public void memberLevelFacade_queryCheckInRewardsValue(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/queryMemberLevelRewards", dataProvider = "provider", description = "查询会员权益奖励信息")
    public void memberLevelFacade_queryMemberLevelRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/queryRewardsInfoMessageList", dataProvider = "provider", description = "查看券奖励的消息列表")
    public void memberLevelFacade_queryRewardsInfoMessageList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/queryUserMessageList", dataProvider = "provider", description = "查看消息列表")
    public void memberLevelFacade_queryUserMessageList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/readUserMessage", dataProvider = "provider", description = "读取消息")
    public void memberLevelFacade_readUserMessage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/saveMemberCheckinRule", dataProvider = "provider", description = "新增会员签到权益规则")
    public void memberLevelFacade_saveMemberCheckinRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/saveMemberMonthlyCouponRule", dataProvider = "provider", description = "新增会员每月返券权益规则")
    public void memberLevelFacade_saveMemberMonthlyCouponRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/saveMemberUpGradeRule", dataProvider = "provider", description = "新增礼包升级权益规则")
    public void memberLevelFacade_saveMemberUpGradeRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/memberLevelFacade/setMemberLevelList", dataProvider = "provider", description = "设置会员等级规则")
    public void memberLevelFacade_setMemberLevelList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/addMediaAd", dataProvider = "provider", description = "添加媒体广告信息")
    public void miscConsoleFacade_addMediaAd(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/addMediaNews", dataProvider = "provider", description = "添加媒体新闻")
    public void miscConsoleFacade_addMediaNews(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/appPushMessage", dataProvider = "provider", description = "app消息推送")
    public void miscConsoleFacade_appPushMessage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/batchDeleteMediaNews", dataProvider = "provider", description = "批量删除媒体新闻")
    public void miscConsoleFacade_batchDeleteMediaNews(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/deleteMediaAd", dataProvider = "provider", description = "删除媒体广告信息")
    public void miscConsoleFacade_deleteMediaAd(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/deleteMediaNews", dataProvider = "provider", description = "删除媒体新闻")
    public void miscConsoleFacade_deleteMediaNews(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/getMediaAdById", dataProvider = "provider", description = "根据id获取媒体广告信息")
    public void miscConsoleFacade_getMediaAdById(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/getMediaAdList", dataProvider = "provider", description = "获取媒体广告列表")
    public void miscConsoleFacade_getMediaAdList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/getMediaNews", dataProvider = "provider", description = "获取媒体新闻")
    public void miscConsoleFacade_getMediaNews(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/queryMediaNews", dataProvider = "provider", description = "查询媒体新闻")
    public void miscConsoleFacade_queryMediaNews(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/queryMediaNewsList", dataProvider = "provider", description = "查询媒体新闻列表")
    public void miscConsoleFacade_queryMediaNewsList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/stickMediaAd", dataProvider = "provider", description = "置顶媒体广告信息")
    public void miscConsoleFacade_stickMediaAd(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/updateMediaAd", dataProvider = "provider", description = "编辑媒体广告信息信息")
    public void miscConsoleFacade_updateMediaAd(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/updateMediaNews", dataProvider = "provider", description = "更新媒体新闻")
    public void miscConsoleFacade_updateMediaNews(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscConsoleFacade/uploadImgFile", dataProvider = "provider", description = "上传图片")
    public void miscConsoleFacade_uploadImgFile(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/addAdvertisement", dataProvider = "provider", description = "新增广告信息")
    public void miscContentFacade_addAdvertisement(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/addMiscContent", dataProvider = "provider", description = "添加misc_content信息")
    public void miscContentFacade_addMiscContent(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/batchAddOrModifyH5LandingPage", dataProvider = "provider", description = "批量新增/修改海融易H5 landingPage广告")
    public void miscContentFacade_batchAddOrModifyH5LandingPage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/batchOfflineH5LandingPage", dataProvider = "provider", description = "批量下线海融易H5 landingPage广告")
    public void miscContentFacade_batchOfflineH5LandingPage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/deleteAdvertisement", dataProvider = "provider", description = "删除广告信息")
    public void miscContentFacade_deleteAdvertisement(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/deleteMiscContent", dataProvider = "provider", description = "删除misc_content信息")
    public void miscContentFacade_deleteMiscContent(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/getAdvertisement", dataProvider = "provider", description = "获取广告信息")
    public void miscContentFacade_getAdvertisement(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/getMiscContent", dataProvider = "provider", description = "根据id获取misc_content信息")
    public void miscContentFacade_getMiscContent(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/getMiscContentList", dataProvider = "provider", description = "获取misc_content列表")
    public void miscContentFacade_getMiscContentList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/offLineAdvertisement", dataProvider = "provider", description = "下线广告信息")
    public void miscContentFacade_offLineAdvertisement(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/queryAdvertisementList", dataProvider = "provider", description = "查询广告信息")
    public void miscContentFacade_queryAdvertisementList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/queryBidProductList", dataProvider = "provider", description = "查询标的产品列表")
    public void miscContentFacade_queryBidProductList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/queryRecommendBidList", dataProvider = "provider", description = "查询推荐标的信息")
    public void miscContentFacade_queryRecommendBidList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/queryRecommendBidProduct", dataProvider = "provider", description = "查询推荐标信息列表")
    public void miscContentFacade_queryRecommendBidProduct(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/setRecommendBidList", dataProvider = "provider", description = "更新推荐标的信息")
    public void miscContentFacade_setRecommendBidList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/sortAdvertisement", dataProvider = "provider", description = "排序广告信息")
    public void miscContentFacade_sortAdvertisement(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/stickMiscContent", dataProvider = "provider", description = "置顶misc_content信息")
    public void miscContentFacade_stickMiscContent(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/updateAdvertisement", dataProvider = "provider", description = "编辑广告信息")
    public void miscContentFacade_updateAdvertisement(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/updateMiscContent", dataProvider = "provider", description = "编辑misc_content信息")
    public void miscContentFacade_updateMiscContent(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/miscContentFacade/updateState", dataProvider = "provider", description = "编辑state信息")
    public void miscContentFacade_updateState(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/addActivateUserRule", dataProvider = "provider", description = "新增唤醒好友活动规则")
    public void promotionFacade_addActivateUserRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/addPromotionChannel", dataProvider = "provider", description = "添加推广渠道信息")
    public void promotionFacade_addPromotionChannel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/addReturnMoneyRule", dataProvider = "provider", description = "新增回款奖励活动规则")
    public void promotionFacade_addReturnMoneyRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/checkActivatable", dataProvider = "provider", description = "检查某个用户是否能被唤醒")
    public void promotionFacade_checkActivatable(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/deleteActivateUserRule", dataProvider = "provider", description = "删除唤醒好友活动规则")
    public void promotionFacade_deleteActivateUserRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/deletePaymentRebateRule", dataProvider = "provider", description = "删除投资完成抽奖活动规则")
    public void promotionFacade_deletePaymentRebateRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/deleteReturnMoneyRule", dataProvider = "provider", description = "删除回款奖励活动规则")
    public void promotionFacade_deleteReturnMoneyRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getActivatableUserByPromoter", dataProvider = "provider", description = "获取可以唤醒用户列表")
    public void promotionFacade_getActivatableUserByPromoter(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getActivateUserRule", dataProvider = "provider", description = "获取唤醒好友活动规则")
    public void promotionFacade_getActivateUserRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getDailyTaskList", dataProvider = "provider", description = "获取每日任务列表")
    public void promotionFacade_getDailyTaskList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getEndTimeWithThirdPartActivity", dataProvider = "provider", description = "获取第三方活动的结束时间")
    public void promotionFacade_getEndTimeWithThirdPartActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getInviteUserRewardsQuantity", dataProvider = "provider", description = "推荐人邀请用户首投活动获得奖励次数")
    public void promotionFacade_getInviteUserRewardsQuantity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getPageActivityList", dataProvider = "provider", description = "获取活动列表: 1、extraInfo1==null: 查询全部推广; 2、extraInfo1==0: 查询普通推广; 3、其他: 查询商户推广")
    public void promotionFacade_getPageActivityList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getPaymentRebate", dataProvider = "provider", description = "投资完成获取未领奖奖励信息或者投资成功广告信息")
    public void promotionFacade_getPaymentRebate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getPromotionChannelList", dataProvider = "provider", description = "获取推广渠道列表")
    public void promotionFacade_getPromotionChannelList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getPromotionInvestRewardRuleList", dataProvider = "provider", description = "获取推广活动投资有奖规则列表")
    public void promotionFacade_getPromotionInvestRewardRuleList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getPromotionRegisterReward", dataProvider = "provider", description = "获取用户已发放的注册奖励信息")
    public void promotionFacade_getPromotionRegisterReward(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getPromotionUriInfo", dataProvider = "provider", description = "获取用户推广信息")
    public void promotionFacade_getPromotionUriInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getUserPromotionInfo", dataProvider = "provider", description = "根据推广码查询用户信息")
    public void promotionFacade_getUserPromotionInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getUserPromotionRewardsInfo", dataProvider = "provider", description = "获取某个用户的推荐奖励信息")
    public void promotionFacade_getUserPromotionRewardsInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/getUserSometimePromotionRewardsInfo", dataProvider = "provider", description = "获取某个用户某段时间内推荐用户而获得的奖励信息")
    public void promotionFacade_getUserSometimePromotionRewardsInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/queryActivateUserRuleList", dataProvider = "provider", description = "查询唤醒好友活动规则列表")
    public void promotionFacade_queryActivateUserRuleList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/queryPromotionActivityRewards", dataProvider = "provider", description = "查询推广奖励")
    public void promotionFacade_queryPromotionActivityRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/queryPromotionRelationList", dataProvider = "provider", description = "查询推广关系")
    public void promotionFacade_queryPromotionRelationList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/queryReturnMoneyRuleList", dataProvider = "provider", description = "查询回款奖励活动规则列表")
    public void promotionFacade_queryReturnMoneyRuleList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/updateActivateUserRule", dataProvider = "provider", description = "编辑唤醒好友活动规则")
    public void promotionFacade_updateActivateUserRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotionFacade/updateReturnMoneyRule", dataProvider = "provider", description = "编辑回款奖励活动规则")
    public void promotionFacade_updateReturnMoneyRule(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/checkUserTeamFlag", dataProvider = "provider", description = "检查用户是否可以加入战队")
    public void provisionalFacade_checkUserTeamFlag(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/drawCoupon", dataProvider = "provider", description = "领券")
    public void provisionalFacade_drawCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/joinTeam", dataProvider = "provider", description = "加入战队")
    public void provisionalFacade_joinTeam(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/queryDepositActivity", dataProvider = "provider", description = "查询存管的活动信息")
    public void provisionalFacade_queryDepositActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/queryGuoqingAvailableCoupon", dataProvider = "provider", description = "查询国庆活动可领取券")
    public void provisionalFacade_queryGuoqingAvailableCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/querySinglesDayTeamStatisticList", dataProvider = "provider", description = "获取双十一战队统计列表")
    public void provisionalFacade_querySinglesDayTeamStatisticList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/querySinglesDayUserStatisticInfo", dataProvider = "provider", description = "获取双十一个人信息记录")
    public void provisionalFacade_querySinglesDayUserStatisticInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/queryThirdAnniversaryAvailableCoupon", dataProvider = "provider", description = "查询三周年活动可领取券")
    public void provisionalFacade_queryThirdAnniversaryAvailableCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/queryThirdAnniversaryInvestRankActivity", dataProvider = "provider", description = "查询三周年排行榜活动信息")
    public void provisionalFacade_queryThirdAnniversaryInvestRankActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/queryWorldCupGameRecords", dataProvider = "provider", description = "查询用户世界杯比赛战绩")
    public void provisionalFacade_queryWorldCupGameRecords(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/queryWorldCupGames", dataProvider = "provider", description = "查询世界杯赛事信息")
    public void provisionalFacade_queryWorldCupGames(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/receivingThirdAnniversaryCoupon", dataProvider = "provider", description = "三周年活动领券")
    public void provisionalFacade_receivingThirdAnniversaryCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/provisionalFacade/saveTmpInvitee", dataProvider = "provider", description = "保存被邀请者信息")
    public void provisionalFacade_saveTmpInvitee(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/reportFacade/queryMerchantRewardsReport", dataProvider = "provider", description = "商户推广返现总览")
    public void reportFacade_queryMerchantRewardsReport(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/reportFacade/queryOrderSubsidyReport", dataProvider = "provider", description = "查询已发放加息券明细")
    public void reportFacade_queryOrderSubsidyReport(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/batchSendRewards", dataProvider = "provider", description = "批量发放奖励请求")
    public void rewardsFacade_batchSendRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/freezeLcj", dataProvider = "provider", description = "冻结理财金")
    public void rewardsFacade_freezeLcj(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/getManualRewardsDetails", dataProvider = "provider", description = "查询人工发放奖励列明细")
    public void rewardsFacade_getManualRewardsDetails(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/getManualRewardsList", dataProvider = "provider", description = "查询没有限制的人数的人工发放奖励列表")
    public void rewardsFacade_getManualRewardsList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/getUserLcjDetail", dataProvider = "provider", description = "查询用户抵用金详情")
    public void rewardsFacade_getUserLcjDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/getUserProfitInfo", dataProvider = "provider", description = "获取用户收益信息（待收加速收益、已收加速收益、待收加息、已收加息）")
    public void rewardsFacade_getUserProfitInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/queryLcjListByStatus", dataProvider = "provider", description = "根据状态查询抵用金信息")
    public void rewardsFacade_queryLcjListByStatus(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/returnLcj", dataProvider = "provider", description = "抵用金退款")
    public void rewardsFacade_returnLcj(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/sendRewards", dataProvider = "provider", description = "手动发放抵用金奖励")
    public void rewardsFacade_sendRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/unFreezeLcj", dataProvider = "provider", description = "解冻理财金")
    public void rewardsFacade_unFreezeLcj(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/rewardsFacade/useLcj", dataProvider = "provider", description = "使用抵用金")
    public void rewardsFacade_useLcj(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tpPromotionFacade/getChannelPromotionUri", dataProvider = "provider", description = "根据用户获取推广码（链接）")
    public void tpPromotionFacade_getChannelPromotionUri(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tpPromotionFacade/getDailyPromotionRewards", dataProvider = "provider", description = "查询奖励信息")
    public void tpPromotionFacade_getDailyPromotionRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tpPromotionFacade/getPromotionActivity", dataProvider = "provider", description = "查询活动信息")
    public void tpPromotionFacade_getPromotionActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tpPromotionFacade/getPromotionRewards", dataProvider = "provider", description = "查询好友投资记录")
    public void tpPromotionFacade_getPromotionRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tpPromotionFacade/getPromotionUri", dataProvider = "provider", description = "根据用户获取推广码（链接）")
    public void tpPromotionFacade_getPromotionUri(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tpPromotionFacade/getRegisteredUserBehaviorData", dataProvider = "provider", description = "查询已注册用户行为数据")
    public void tpPromotionFacade_getRegisteredUserBehaviorData(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tpPromotionFacade/getSummaryPromotionRewards", dataProvider = "provider", description = "查询奖励总额信息")
    public void tpPromotionFacade_getSummaryPromotionRewards(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tpPromotionFacade/getUserType", dataProvider = "provider", description = "查询是否属于客服可跟进用户")
    public void tpPromotionFacade_getUserType(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tpPromotionFacade/queryChannelInfo", dataProvider = "provider", description = "查询渠道数据总览")
    public void tpPromotionFacade_queryChannelInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tpPromotionFacade/rebindPromotionRelation", dataProvider = "provider", description = "重新绑定推广关系")
    public void tpPromotionFacade_rebindPromotionRelation(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/addHryIdMapper", dataProvider = "provider", description = "添加hry_id_mapper信息")
    public void userFacade_addHryIdMapper(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getInvestRankingDetail", dataProvider = "provider", description = "查询当前投资打榜活动")
    public void userFacade_getInvestRankingDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getPersonalInvestRank", dataProvider = "provider", description = "查询个人当前投资打榜信息")
    public void userFacade_getPersonalInvestRank(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserInfoByLoginNames", dataProvider = "provider", description = "批量查询投资用户基本信息")
    public void userFacade_getUserInfoByLoginNames(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserInfoByUserIds", dataProvider = "provider", description = "批量查询投资用户基本信息")
    public void userFacade_getUserInfoByUserIds(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/userFacade/getUserInvestRank", dataProvider = "provider", description = "查询用户投资排名")
    public void userFacade_getUserInvestRank(HryTest test) {
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
