package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("Contract")
public class ContractDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public ContractDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/caFacade/createCaForEnterprise", dataProvider = "provider", description = "企业CA申请接口")
    public void caFacade_createCaForEnterprise(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/caFacade/createCaForMember", dataProvider = "provider", description = "个人CA申请接口")
    public void caFacade_createCaForMember(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contract/doContractSign", dataProvider = "provider", description = "合同首次签章接口")
    public void contract_doContractSign(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contract/doContractSignSupplement", dataProvider = "provider", description = "内部合同补充签章接口")
    public void contract_doContractSignSupplement(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contract/finishPreSignedContract", dataProvider = "provider", description = "外部合同签章完成更新接口")
    public void contract_finishPreSignedContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contract/getBlankContract", dataProvider = "provider", description = "获取空白合同模板")
    public void contract_getBlankContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contract/getContractByState", dataProvider = "provider", description = "获取合同接口")
    public void contract_getContractByState(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contract/getFirstSignedContract", dataProvider = "provider", description = "获取<调用合同首次签章接口后>的合同的接口")
    public void contract_getFirstSignedContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contract/getInitSignedContract", dataProvider = "provider", description = "获取首次签章完成合同接口")
    public void contract_getInitSignedContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contract/getSignSuccContractList", dataProvider = "provider", description = "获取签章成功合同列表接口")
    public void contract_getSignSuccContractList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contract/reSignContract", dataProvider = "provider", description = "重新签署合同")
    public void contract_reSignContract(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contract/reSignContractByBizObjId", dataProvider = "provider", description = "根据业务ID重新签署合同")
    public void contract_reSignContractByBizObjId(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/contractFacade/extSignNotify", dataProvider = "provider", description = "法大大h5签章页面签名完成后，接收异步通知的接口")
    public void contractFacade_extSignNotify(HryTest test) {
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
