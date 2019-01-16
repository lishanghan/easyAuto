package com.haier.exception;

import com.haier.response.Result;
import com.haier.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: 全局异常处理
 * @Author: luqiwei
 * @Date: 2018/5/18 9:59
 */
@Slf4j
@ControllerAdvice
public class HryExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result getHryException(Exception e) {
        //捕获自定义异常
        if (e instanceof HryException) {
            HryException hryException = (HryException) e;
            return ResultUtil.error(hryException.getCode(), hryException.getMessage());
        }
        //捕获Spring框架参数校验异常
        if (e instanceof BindException) {
            StringBuilder sb = new StringBuilder();
            List<ObjectError> allErrors = ((BindException) e).getAllErrors();
            for (ObjectError error : allErrors) {
                if (error instanceof FieldError) {
                    sb.append(((FieldError) error).getField());
                } else {
                    sb.append(error.getObjectName());
                }
                sb.append(" : " + error.getDefaultMessage() + " ; ");
            }
            return ResultUtil.error(1999, sb.toString());
        }
        log.error("【未知异常】,详细信息如下:", e);
        return ResultUtil.error(9999, e.getMessage());
    }
}
