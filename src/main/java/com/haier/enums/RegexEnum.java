package com.haier.enums;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/1 14:56
 */
public enum RegexEnum {
    EMAIL_REGEX("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$", "邮箱正则"),

    PWD_REGEX("^[A-Za-z0-9~`!@#\\$%^&\\*\\(\\),\\.\\+\\<>\\?\\-_\\=\\\\/:;\"'\\|\\[\\]\\{\\}]{6,}+$", "密码正则,字母,数字,英文符号不包括空格"),

    GROUP_SH_REGEX("^1[0-9]$", "上海组"),

    GROUP_HZ_REGEX("^2[0-9]$", "杭州组"),

    CLASSNAME_REGEX("[A-Z][A-Za-z0-9_]*", "测试类名,首字符必须是大写字母,其余部分只能由字母或数字或下划线组成"),

    INVALID_CHAR_REGEX("\\W", "非单词字符,用于iUri转换成MethodName "),

    SELECT_REGEX("^(?i)\\s*select.+", "查询语句(以select开头)"),

    INSERT_REGEX("^(?i)\\s*insert.+", "新增语句(以insert开头)"),

    UPDATE_REGEX("^(?i)\\s*update.+", "更新语句(以update开头)"),

    NOTBLANK("[^\\s]*", "非空校验,校验不包含非空字符"),

    SIMPLE_JSONKEY("^\\$(\\w+)", "$后面紧跟json key,如:$title"),

    HARD_JSONKEY("^\\$(\\{\\w+|\\[\\d+)+", "根据JSON路径获取相应的值,如:${aaa[0{title   ,  ${aaa{bbb 等"),

    META_PATH("(\\{\\w+)|(\\[\\d+)", "JSON中的元路径,{xxx或者[xxx"),

    VIRTUAL_INTERFACE("(?i)^\\/virtual\\/\\w+$", "虚拟接口,/virtual/xxx");


    private String regex;
    private String desc;

    RegexEnum(String regex, String desc) {
        this.regex = regex;
        this.desc = desc;
    }

    public String getRegex() {
        return regex;
    }


    public String getDesc() {
        return desc;
    }

}
