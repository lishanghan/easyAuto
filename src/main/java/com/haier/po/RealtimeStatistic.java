package com.haier.po;

import lombok.Data;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/9 11:11
 */
@Data
public class RealtimeStatistic {
    private String serviceKey;//服务名
    private String serviceDesc;//服务说明
    private Integer iTotal;//接口总数
    private Integer cTotal;//用例总数
    private Integer iTotalByCase;//用例覆盖的接口数量
    private Integer iTotalNoCase;//未设计用例的接口
    private String iRate;//接口用例覆盖率
    private String cFineness;//用例粒度:用例数/每接口
}
