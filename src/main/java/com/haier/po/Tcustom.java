package com.haier.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Tcustom {
    private Integer id;

    @NotBlank(message = "定制名称必须")
    private String customname;

    private Integer userid;

    private String username;

    @NotNull(message ="运行环境必须")
    private Integer envid;

    private String envkey;

    private String strategy;

    private Integer status;

    private Date updatetime;

    private Integer intersect;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getEnvid() {
        return envid;
    }

    public void setEnvid(Integer envid) {
        this.envid = envid;
    }

    public String getEnvkey() {
        return envkey;
    }

    public void setEnvkey(String envkey) {
        this.envkey = envkey == null ? null : envkey.trim();
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy == null ? null : strategy.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getIntersect() {
        return intersect;
    }

    public void setIntersect(Integer intersect) {
        this.intersect = intersect;
    }
}