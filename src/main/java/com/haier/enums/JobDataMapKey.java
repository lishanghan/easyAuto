package com.haier.enums;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/12/18 14:03
 */
public enum JobDataMapKey {
    CUSTOM_ID("customId"),
    EXECUTE_USER_ID("executeUserId"),
    EXECUTE_USER_NAME("executeUserName");

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;

    }

    JobDataMapKey(String key) {

        this.key = key;
    }

    private String key;

}
