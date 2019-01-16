package com.haier.enums;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/11/12 17:28
 */
public enum GenReplaceKWEnum {
    SKEY("\\$\\{sKey\\}", "${sKey}"),
    URI("\\$\\{uri\\}", "${uri}"),
    CLASS_NAME("\\$\\{className\\}", "${className}"),
    DESC("\\$\\{desc\\}", "${desc}"),
    METHOD_NAME("\\$\\{methodName\\}", "${methodName}"),
    PROVIDER("\\$\\{provider\\}","${provider}");
    private String regex;
    private String sample;

    GenReplaceKWEnum(String regex, String sample) {
        this.regex = regex;
        this.sample = sample;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }
}
