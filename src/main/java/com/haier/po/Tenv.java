package com.haier.po;

import javax.validation.constraints.NotBlank;

public class Tenv {
    private Integer id;

    @NotBlank(message = "环境标识不可为空")
    private String envkey;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnvkey() {
        return envkey;
    }

    public void setEnvkey(String envkey) {
        this.envkey = envkey == null ? null : envkey.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}