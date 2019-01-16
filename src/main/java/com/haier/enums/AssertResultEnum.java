package com.haier.enums;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/7 16:51
 */
public enum AssertResultEnum {
    /**
     * 用例运行结果与预期相符
     */
    PASS,
    /**
     * 运行结果与预期不相符
     */
    FAIL,
    /**
     * 忽略
     */
    IGNORE,
    /**
     * 运行异常
     */
    ERROR
}
