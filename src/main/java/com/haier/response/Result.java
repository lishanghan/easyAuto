package com.haier.response;

import lombok.Data;

/**
 * @Description: 统一报文返回体
 * @Author: luqiwei
 * @Date: 2018/5/16 18:05
 */
@Data
public class Result<T> {
    private Integer status;
    private String msg;
    private T data;
}
