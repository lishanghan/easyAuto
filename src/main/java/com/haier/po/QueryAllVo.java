package com.haier.po;

import lombok.Data;

/**
 * 查询Case,interface,service,env的包装类型
 * */
@Data
public class QueryAllVo {
    private Tcase tcase;
    private Ti ti;
    private Tservice tservice;
    private Tenv tenv;
}
