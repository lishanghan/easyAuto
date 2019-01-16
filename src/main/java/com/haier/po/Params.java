package com.haier.po;

import lombok.Data;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/27 9:25
 */
@Data
public class Params {
    private Tcase tcase;
    private Ti ti;
    //重写toString(),测试报告中将展示CaseID
    @Override
    public String toString(){
        return "CaseId:"+tcase.getId();
    }
}
