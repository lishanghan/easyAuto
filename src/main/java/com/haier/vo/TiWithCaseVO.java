package com.haier.vo;

import com.haier.po.Tcase;
import com.haier.po.Ti;
import lombok.Data;

import java.util.List;

/**
 * @Description: 接口-用例视图对象
 * @Author: luqiwei
 * @Date: 2018/7/13 15:17
 */
@Data
public class TiWithCaseVO extends Ti {
    private List<Tcase> tcases;
}
