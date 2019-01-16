package com.haier.po;

public class Tcustomdetail {
    private Integer id;

    private Integer priority;

    private Integer customid;

    private Integer clientlevel;

    private Integer clientid;

    private Integer parentclientid;

    private Boolean haschild;

    private String clientname;

    private String classname;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getCustomid() {
        return customid;
    }

    public void setCustomid(Integer customid) {
        this.customid = customid;
    }

    public Integer getClientlevel() {
        return clientlevel;
    }

    public void setClientlevel(Integer clientlevel) {
        this.clientlevel = clientlevel;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getParentclientid() {
        return parentclientid;
    }

    public void setParentclientid(Integer parentclientid) {
        this.parentclientid = parentclientid;
    }

    public Boolean getHaschild() {
        return haschild;
    }

    public void setHaschild(Boolean haschild) {
        this.haschild = haschild;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}