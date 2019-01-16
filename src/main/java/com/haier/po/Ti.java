package com.haier.po;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Ti {
    private Integer id;

    @NotNull(message = "接口必须指定服务ID")
    @Min(value = 1, message = "接口必须指定服务ID")
    private Integer serviceid;

    @NotBlank(message = "接口地址必须")
    private String iuri;

    @NotBlank(message = "接口说明必须")
    private String remark;

    private Integer irequestmethod;

    private Integer icontenttype;

    private String iheadersample;

    private Integer iparamtype;

    private String iparamsample;

    private Integer iresponsetype;

    private String idev;

    private Integer casecount;

    private Integer istatus;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public String getIuri() {
        return iuri;
    }

    public void setIuri(String iuri) {
        this.iuri = iuri == null ? null : iuri.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getIrequestmethod() {
        return irequestmethod;
    }

    public void setIrequestmethod(Integer irequestmethod) {
        this.irequestmethod = irequestmethod;
    }

    public Integer getIcontenttype() {
        return icontenttype;
    }

    public void setIcontenttype(Integer icontenttype) {
        this.icontenttype = icontenttype;
    }

    public String getIheadersample() {
        return iheadersample;
    }

    public void setIheadersample(String iheadersample) {
        this.iheadersample = iheadersample == null ? null : iheadersample.trim();
    }

    public Integer getIparamtype() {
        return iparamtype;
    }

    public void setIparamtype(Integer iparamtype) {
        this.iparamtype = iparamtype;
    }

    public String getIparamsample() {
        return iparamsample;
    }

    public void setIparamsample(String iparamsample) {
        this.iparamsample = iparamsample == null ? null : iparamsample.trim();
    }

    public Integer getIresponsetype() {
        return iresponsetype;
    }

    public void setIresponsetype(Integer iresponsetype) {
        this.iresponsetype = iresponsetype;
    }

    public String getIdev() {
        return idev;
    }

    public void setIdev(String idev) {
        this.idev = idev == null ? null : idev.trim();
    }

    public Integer getCasecount() {
        return casecount;
    }

    public void setCasecount(Integer casecount) {
        this.casecount = casecount;
    }

    public Integer getIstatus() {
        return istatus;
    }

    public void setIstatus(Integer istatus) {
        this.istatus = istatus;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}