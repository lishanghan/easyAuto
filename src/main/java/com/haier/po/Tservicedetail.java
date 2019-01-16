package com.haier.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Tservicedetail {
    private Integer id;

    @NotNull(message = "服务必须")
    private Integer serviceid;

    @NotNull(message = "环境必须")
    private Integer envid;

    @NotBlank(message = "hostinfo必须")
    private String hostinfo;

    private String dbinfo;

    private String swaggerurl;

    private String clazz;

    private Integer status;

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

    public Integer getEnvid() {
        return envid;
    }

    public void setEnvid(Integer envid) {
        this.envid = envid;
    }

    public String getHostinfo() {
        return hostinfo;
    }

    public void setHostinfo(String hostinfo) {
        this.hostinfo = hostinfo == null ? null : hostinfo.trim();
    }

    public String getDbinfo() {
        return dbinfo;
    }

    public void setDbinfo(String dbinfo) {
        this.dbinfo = dbinfo == null ? null : dbinfo.trim();
    }

    public String getSwaggerurl() {
        return swaggerurl;
    }

    public void setSwaggerurl(String swaggerurl) {
        this.swaggerurl = swaggerurl == null ? null : swaggerurl.trim();
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz == null ? null : clazz.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}