package com.haier.enums;

public enum ContentTypeEnum {
    JSON(1, "application/json"),
    X_WWW_FORM_URLENCODED(2, "application/x-www-form-urlencoded"),
    JAVASCRIPT(3, "application/javascript"),
    TEXT_HTML(4, "text/html"),
    TEXT_XML(5, "text/xml"),
    TEXT_CSS(6, "text/css"),
    FORM_DATA(7, "multipart/form-data"),
    IMAGE_PNG(8, "image/png");

    private Integer id;
    private String value;

    ContentTypeEnum(Integer id, String value) {
        this.id = id;
        this.value = value;
    }

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

    public static String getValue(Integer id) {
        for (ContentTypeEnum e : ContentTypeEnum.values()) {
            if (e.getId().equals(id)) {
                return e.getValue();
            }
        }
        return null;
    }

    public static Integer getId(String value) {
        for (ContentTypeEnum e : ContentTypeEnum.values()) {
            if (e.getValue().equalsIgnoreCase(value)) {
                return e.getId();
            }
        }
        return null;
    }
}
