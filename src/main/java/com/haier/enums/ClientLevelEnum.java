package com.haier.enums;

/**
 * @Description: 定制级别
 * @Author: luqiwei
 * @Date: 2018/7/11 14:37
 */
public enum ClientLevelEnum {
    SERVICE(1, "服务"),
    INTERFACE(2, "接口"),
    CASE(3, "用例"),;

    private Integer level;
    private String desc;

    ClientLevelEnum(Integer level, String desc) {
        this.level = level;
        this.desc = desc;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
