package com.haier.po;

import com.haier.enums.AssertResultEnum;
import lombok.Data;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/7 16:46
 */
@Data
public class RunOneResultSub {
    private String env;
    private String hostInfo;
    private String actualParam;
    private String actual;//实际结果
    private AssertResultEnum result;
}
