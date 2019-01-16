package com.haier.vo;

import com.haier.po.Tcustom;
import com.haier.po.Tcustomdetail;
import lombok.Data;

import java.util.List;

/**
 * @Description: Tcustom视图对象
 * @Author: luqiwei
 * @Date: 2018/7/12 9:14
 */
@Data
public class CustomVO extends Tcustom {
    private List<Tcustomdetail> tcustomdetails;
}
