package com.haier.enums;

public enum RequestMethodTypeEnum {
    POST(1, "post"),
    GET(2, "get");
    private Integer id;
    private String value;

    RequestMethodTypeEnum(Integer id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
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

    public static String getValue(Integer id) {
        for (RequestMethodTypeEnum e : RequestMethodTypeEnum.values()) {
            if (e.getId() == id) {
                return e.getValue();
            }
        }
        return null;
    }

    public static Integer getId(String value) {
        for (RequestMethodTypeEnum e : RequestMethodTypeEnum.values()) {
            if (e.getValue().equalsIgnoreCase(value)) {
                return e.getId();
            }
        }
        return null;
    }

    public static RequestMethodTypeEnum getRequestMethodTypeEnum(String value) {
        for (RequestMethodTypeEnum e : RequestMethodTypeEnum.values()) {
            if (e.getValue().equalsIgnoreCase(value)) {
                return e;
            }
        }
        return null;
    }

    public static RequestMethodTypeEnum getRequestMethodTypeEnum(Integer id) {
        for (RequestMethodTypeEnum e : RequestMethodTypeEnum.values()) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
