package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("Worldunion")
public class WorldunionDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public WorldunionDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/worldunionFacade/approachIntegration", dataProvider = "provider", description = "估价综合方法")
    public void worldunionFacade_approachIntegration(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/worldunionFacade/approachManual", dataProvider = "provider", description = "据根通过案例号发起重评")
    public void worldunionFacade_approachManual(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/worldunionFacade/areasById", dataProvider = "provider", description = "根据城市ID获取行政区域")
    public void worldunionFacade_areasById(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/worldunionFacade/citys", dataProvider = "provider", description = "获取所有城市信息")
    public void worldunionFacade_citys(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/worldunionFacade/citysById", dataProvider = "provider", description = "根据ID获取城市信息")
    public void worldunionFacade_citysById(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/worldunionFacade/getBuild", dataProvider = "provider", description = "根据楼盘ID获取楼栋列表")
    public void worldunionFacade_getBuild(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/worldunionFacade/getConstruction", dataProvider = "provider", description = "通过城市编号、关键字模糊检索小区列表")
    public void worldunionFacade_getConstruction(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/worldunionFacade/getConstrutionViewInfoById", dataProvider = "provider", description = "据根据楼盘ID获取楼盘详情")
    public void worldunionFacade_getConstrutionViewInfoById(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/worldunionFacade/getHouse", dataProvider = "provider", description = "据楼栋ID 获取该楼栋的全部房号信息")
    public void worldunionFacade_getHouse(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/worldunionFacade/getQueryPriceData", dataProvider = "provider", description = "据根地址拆分自动估价结果")
    public void worldunionFacade_getQueryPriceData(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/worldunionFacade/provinces", dataProvider = "provider", description = "获取所有省份信息")
    public void worldunionFacade_provinces(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

}
