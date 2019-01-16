package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("Eam")
public class EamDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public EamDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/abolishAss", dataProvider = "provider", description = "废弃一笔资产")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_abolishAss(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/addAssets", dataProvider = "provider", description = "新增一笔资产信息")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_addAssets(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/addAssIncomeAdjust", dataProvider = "provider", description = "资产收益调整")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_addAssIncomeAdjust(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/addAssInvest", dataProvider = "provider", description = "新增资产并和标的关联")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_addAssInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/addAssOrg", dataProvider = "provider", description = "新增机构资产和标的")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_addAssOrg(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/addAssrepay", dataProvider = "provider", description = "信贷资产回款")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_addAssrepay(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/addAssRepayPlan", dataProvider = "provider", description = "新增资产还款计划")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_addAssRepayPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/addRenewAssets", dataProvider = "provider", description = "资产续借接口")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_addRenewAssets(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/queryAssets", dataProvider = "provider", description = "查询单条资产信息")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_queryAssets(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/updAssAmount", dataProvider = "provider", description = "资产金额调整")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_updAssAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/updAssets", dataProvider = "provider", description = "资产修改接口")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_updAssets(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/updAssExtend", dataProvider = "provider", description = "资产展期调整")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_updAssExtend(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/updAssRepayPlan", dataProvider = "provider", description = "更新资产还款计划")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_updAssRepayPlan(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.AssetsResource/updAssValue", dataProvider = "provider", description = "更新资产起息日")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_AssetsResource_updAssValue(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.BasicInfoResource/addBD", dataProvider = "provider", description = "新增资产BD")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_BasicInfoResource_addBD(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.BasicInfoResource/addCompany", dataProvider = "provider", description = "新增资产相关方")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_BasicInfoResource_addCompany(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.InvestResource/addAssfinance", dataProvider = "provider", description = "线上融资(标的发布/废弃)")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_InvestResource_addAssfinance(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.InvestResource/addOffinvest", dataProvider = "provider", description = "新增线下投资")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_InvestResource_addOffinvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.InvestResource/investRepay", dataProvider = "provider", description = "标的还款")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_InvestResource_investRepay(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.InvestResource/offinvestRepay", dataProvider = "provider", description = "线下投资还款")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_InvestResource_offinvestRepay(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.InvestResource/onlineLending", dataProvider = "provider", description = "线上放款")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_InvestResource_onlineLending(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.InvestResource/updPreInvest", dataProvider = "provider", description = "预发标更新")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_InvestResource_updPreInvest(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/eam-api/resource/com.haier.eam.biz.resource.rs.facade.ListedInvestResource/queryRegion", dataProvider = "provider", description = "查询区域信息")
    public void eam_api_resource_com_haier_eam_biz_resource_rs_facade_ListedInvestResource_queryRegion(HryTest test) {
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
