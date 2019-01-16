package com.haier.po;

import lombok.Data;

/**
 * @Description: Ti的表的查询包装类, 主要是要囊括tserviceName,
 * 用户可以通过服务描述或者服务Id查询到ti记录
 * @Author: luqiwei
 * @Date: 2018/5/23 14:12
 */
@Data
public class TiCustom extends Ti {
    private String servicekey;
    private String servicename;
}
