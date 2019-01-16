package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("IBS")
public class IBSDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public IBSDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/ibsFrontFacade/closeIntelligentInvest", dataProvider = "provider", description = "关闭智能投资")
    public void ibsFrontFacade_closeIntelligentInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/getUserPermissionInfoOfIntelligent", dataProvider = "provider", description = "获取智能投资的用户权限信息")
    public void ibsFrontFacade_getUserPermissionInfoOfIntelligent(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/modifyIntelligentInvest", dataProvider = "provider", description = "修改智能投资方案")
    public void ibsFrontFacade_modifyIntelligentInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/openIntelligentInvest", dataProvider = "provider", description = "开启智能投资")
    public void ibsFrontFacade_openIntelligentInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/pauseIntelligentInvest", dataProvider = "provider", description = "暂停智能投资")
    public void ibsFrontFacade_pauseIntelligentInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/queryBlankContract", dataProvider = "provider", description = "获取智能投资签订合同空模板信息")
    public void ibsFrontFacade_queryBlankContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/queryLatestPlanInfo", dataProvider = "provider", description = "查询最新的用户投资方案详情")
    public void ibsFrontFacade_queryLatestPlanInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/queryPlanStatus", dataProvider = "provider", description = "根据用户Id查询用户智能投资开启状态")
    public void ibsFrontFacade_queryPlanStatus(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/queryPlatformLimit", dataProvider = "provider", description = "查询平台当前限额")
    public void ibsFrontFacade_queryPlatformLimit(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/querySysRetentionLimit", dataProvider = "provider", description = "查询智投系统配置")
    public void ibsFrontFacade_querySysRetentionLimit(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/queryUserBiddingOrders", dataProvider = "provider", description = "查询用户智能投资记录")
    public void ibsFrontFacade_queryUserBiddingOrders(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/queryUserInvestStaticAmount", dataProvider = "provider", description = "查询用户投资统计金额")
    public void ibsFrontFacade_queryUserInvestStaticAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsFrontFacade/resetIntelligentInvest", dataProvider = "provider", description = "恢复智能投资")
    public void ibsFrontFacade_resetIntelligentInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsSystemConfigFacade/querySystemConfig", dataProvider = "provider", description = "查询参数配置-【console使用】")
    public void ibsSystemConfigFacade_querySystemConfig(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsSystemConfigFacade/querySystemSupportBidType", dataProvider = "provider", description = "查询系统支持标的类型-【console使用】")
    public void ibsSystemConfigFacade_querySystemSupportBidType(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsSystemConfigFacade/updateSystemConfig", dataProvider = "provider", description = "更新参数配置-【console使用】")
    public void ibsSystemConfigFacade_updateSystemConfig(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ibsSystemConfigFacade/updateSystemSupportBidType", dataProvider = "provider", description = "更新标的类型-【console使用】")
    public void ibsSystemConfigFacade_updateSystemSupportBidType(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/intelligentBiddingPlanDetailFacade/queryIntelligentBiddingPlanDetail", dataProvider = "provider", description = "智投投标方案明细查询-【console使用】")
    public void intelligentBiddingPlanDetailFacade_queryIntelligentBiddingPlanDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/statisticsFacade/queryAllFastEarnStatistics", dataProvider = "provider", description = "全部用户的快准赚统计")
    public void statisticsFacade_queryAllFastEarnStatistics(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/statisticsFacade/queryFastEarnStatisticsByUser", dataProvider = "provider", description = "单个用户的快准赚统计")
    public void statisticsFacade_queryFastEarnStatisticsByUser(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/systemDailyLimitFacade/getSystemDailyLimit", dataProvider = "provider", description = "查询限额-【console使用】")
    public void systemDailyLimitFacade_getSystemDailyLimit(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/systemDailyLimitFacade/updateSystemDailyLimit", dataProvider = "provider", description = "更新限额")
    public void systemDailyLimitFacade_updateSystemDailyLimit(HryTest test) {
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
