package com.haier.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Tcase {
    private Integer id;

    @NotBlank(message = "用例名称必须")
    private String casename;

    private String remark;

    @NotNull(message = "用例对应的服务必须")
    private Integer serviceid;

    @NotNull(message = "用例所属的接口必须")
    private Integer iid;

    private Integer envid;

    private String testclass;

    private String requestheader;

    private String requestparam;

    private Integer asserttype;

    private String expected;

    private String cafter;

    private Integer status;

    private String author;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename == null ? null : casename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getEnvid() {
        return envid;
    }

    public void setEnvid(Integer envid) {
        this.envid = envid;
    }

    public String getTestclass() {
        return testclass;
    }

    public void setTestclass(String testclass) {
        this.testclass = testclass == null ? null : testclass.trim();
    }

    public String getRequestheader() {
        return requestheader;
    }

    public void setRequestheader(String requestheader) {
        this.requestheader = requestheader == null ? null : requestheader.trim();
    }

    public String getRequestparam() {
        return requestparam;
    }

    public void setRequestparam(String requestparam) {
        this.requestparam = requestparam == null ? null : requestparam.trim();
    }

    public Integer getAsserttype() {
        return asserttype;
    }

    public void setAsserttype(Integer asserttype) {
        this.asserttype = asserttype;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected == null ? null : expected.trim();
    }

    public String getCafter() {
        return cafter;
    }

    public void setCafter(String cafter) {
        this.cafter = cafter == null ? null : cafter.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}