package com.haier.po;

import lombok.Data;

import java.util.List;

/**
 * @Description: 描述单条Case测试结果,因为环境可能有多个,所以测试结果应该兼容多个
 * @Author: luqiwei
 * @Date: 2018/6/7 16:32
 */
@Data
public class RunOneResult {
    private String serviceKey;
    private String iUri;
    private String requestMethod;
    private String contentType;
    private String prarmType;
    private String param;
    private String responseType;
    private String assertType;
    private String expected;
    private List<RunOneResultSub> runOneResultSubList;//env,hostInfo,actual,result
}
