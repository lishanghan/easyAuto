package com.haier.enums;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/7/10 10:56
 */
public enum StatusEnum {

    ONE(1, "正常"),
    _ONE(-1, "删除"),
    _TWO(-2, "作废"),
    FIVE(5, "报告中"),
    TEN(10, "报告完成");

    private Integer id;
    private String desc;

    StatusEnum(Integer id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
