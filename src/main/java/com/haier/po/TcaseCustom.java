package com.haier.po;

import lombok.Data;

/**
 * @Description: Tcase包装类,用于构造综合查询的查询条件
 * @Author: luqiwei
 * @Date: 2018/5/24 16:42
 */
@Data
public class TcaseCustom  extends Tcase{
    private String servicekey;
    private String servicename;
    private String iuri;
    private String iremark;
}
