package com.haier.enums;

public enum HttpTypeEnum {
    HTTP(1, "http"),
    HTTPS(2, "https");
    private int id;
    private String value;

    HttpTypeEnum(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static String getValue(int id) {
        for (HttpTypeEnum e : HttpTypeEnum.values()) {
            if (e.getId() == id) {
                return e.getValue();
            }
        }
        return null;
    }

    public static Integer getId(String value) {
        for (HttpTypeEnum e : HttpTypeEnum.values()) {
            if (e.getValue().equalsIgnoreCase(value)) {
                return e.getId();
            }
        }
        return null;
    }
}
