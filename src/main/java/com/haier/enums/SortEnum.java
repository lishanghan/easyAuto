package com.haier.enums;

/**
 * @Description: 排序字段
 * @Author: luqiwei
 * @Date: 2018/6/5 9:10
 */
public enum SortEnum {
    UPDATETIME("updateTime desc"),//根据更新时间倒序
    ID("id desc"),//根据id倒序
    TESTTIME("testtime desc"),//根据测试时间倒序
    ;
    private String value;

    SortEnum(String sortBy) {
        this.value = sortBy;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
