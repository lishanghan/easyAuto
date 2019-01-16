package com.haier.exception;

import com.haier.enums.StatusCodeEnum;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/18 9:51
 */
public class HryException extends RuntimeException {
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public HryException() {
        this(StatusCodeEnum.UNKNOW_ERROR);
    }

    //继承exception,加入错误状态值
    public HryException(StatusCodeEnum statusCodeEnum) {
        super(statusCodeEnum.getMsg());
        this.code = statusCodeEnum.getCode();
    }

    //追加错误信息
    public HryException(StatusCodeEnum statusCodeEnum, String msg) {
        super(statusCodeEnum.getMsg() + "--" + msg);
        this.code = statusCodeEnum.getCode();
    }

    //自定义错误信息
    public HryException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
}
