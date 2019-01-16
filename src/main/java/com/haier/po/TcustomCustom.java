package com.haier.po;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/28 19:08
 */
@Data
public class TcustomCustom extends Tcustom {
    private List<Tcustomdetail> tcustomdetails;
}
