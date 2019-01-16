package com.haier.enums;

/**
 * @Description: 断言方式枚举
 * @Author: luqiwei
 * @Date: 2018/5/2 17:44
 */
public enum AssertTypeEnum {
    EQUAL(1, "equal", "实际值与期望值完全相等"),//完全相等

    CONTAIN(2, "contain", "实际值包含期望值(忽略大小写)"),

    KEY_VALUE(3, "key-value", "实际值与相对应key的期望中的值相等,或忽略大小写比较相等,或忽略空字符比较相等,或包含期望值,或匹配期望值的正则形式,所有的key-value对比较都为true,断言通过"),

    MATCH(4, "match", "实际值中匹配到期望值的正则表达式"),

    EXCLUDE(5, "exclude", "实际值中不包括期望的值|正则表达式")


    ;


    AssertTypeEnum(int id, String value, String desc) {
        this.id = id;
        this.value = value;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private int id;
    private String value;
    private String desc;

    public static String getValue(int id) {
        for (AssertTypeEnum e : AssertTypeEnum.values()) {
            if (e.getId() == id) {
                return e.getValue();
            }
        }
        return null;
    }

    public static Integer getId(String value) {
        for (AssertTypeEnum e : AssertTypeEnum.values()) {
            if (e.getValue().equalsIgnoreCase(value)) {
                return e.getId();
            }
        }
        return null;
    }
}
