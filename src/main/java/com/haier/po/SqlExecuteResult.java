package com.haier.po;

import com.haier.enums.SqlExecuted;
import com.haier.enums.SqlTypeEnum;
import lombok.Data;

/**
 * @Description: sql执行结果描述
 * @Author: luqiwei
 * @Date: 2018/11/14 16:55
 */
@Data
public class SqlExecuteResult<T> {
    private SqlExecuted sqlExecuted;//sql执行状态,required
    private SqlTypeEnum sqlType;//sql类型,增|删|改|查
    private T result;//约定,当status==-1时,result类型恒为java.lang.String
}
