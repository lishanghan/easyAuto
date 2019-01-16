package com.haier.util;

import com.haier.enums.StatusCodeEnum;
import com.haier.response.Result;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/18 9:09
 */
public class ResultUtil {
    //需要出参的,传入返回体出参
    public static <T> Result success(T t) {
        Result result = new Result();
        result.setStatus(StatusCodeEnum.SUCCESS.getCode());
        result.setMsg(StatusCodeEnum.SUCCESS.getMsg());
        result.setData(t);
        return result;
    }


    //不需要出参的
    public static Result success() {
        return success(null);
    }

    //返回异常信息,在已知的范围内
    public static Result error(StatusCodeEnum statusCodeEnum) {
        Result result = new Result();
        result.setStatus(statusCodeEnum.getCode());
        result.setMsg(statusCodeEnum.getMsg());
        result.setData(null);
        return result;
    }

    //自定义异常信息
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setStatus(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

}
