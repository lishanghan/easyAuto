package com.haier.enums;

public enum ResponseTypeEnum {
    JSON(1, "json", "json类型"),
    MAP(2, "map", "map类型"),
    TEXT(3, "text", "文本类型");
    private Integer id;
    private String value;
    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    ResponseTypeEnum(Integer id, String value, String desc) {
        this.id = id;
        this.value = value;
        this.desc = desc;
    }

    public static String getValue(int id) {
        for (ResponseTypeEnum e : ResponseTypeEnum.values()) {
            if (e.getId() == id) {
                return e.getValue();
            }
        }
        return null;
    }

    public static Integer getId(String value) {
        for (ResponseTypeEnum e : ResponseTypeEnum.values()) {
            if (e.getValue().equalsIgnoreCase(value)) {
                return e.getId();
            }
        }
        return null;
    }
}
