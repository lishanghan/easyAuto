package com.haier.enums;

/**
 * @Description: 记录常用的常量
 * @Author: luqiwei
 * @Date: 2018/9/14 9:21
 */
public enum ConstantEnum {
    SUPPER_VERIFY_CODE("Ed%8r5", "member万能验证码"),;

    private String constant;
    private String desc;

    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    ConstantEnum(String constant, String desc) {
        this.constant = constant;
        this.desc = desc;
    }
}
