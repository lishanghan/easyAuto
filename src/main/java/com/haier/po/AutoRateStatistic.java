package com.haier.po;

import lombok.Data;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/11/27 9:52
 */
@Data
public class AutoRateStatistic {
    private String serviceKey;
    private String serviceName;
    private Integer iTotal;//服务中的所有接口数量
    private Integer customTotal;//定制的接口的数量
    private String rate;//定制率(自动化率)
}
