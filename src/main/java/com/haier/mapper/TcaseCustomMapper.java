package com.haier.mapper;

import com.haier.po.TcaseCustom;

import java.util.List;

/**
 * @Description: tcase综合查询
 * @Author: luqiwei
 * @Date: 2018/5/30 13:40
 */
public interface TcaseCustomMapper {
    List<TcaseCustom> selectByCondition(TcaseCustom tcaseCustom);
    List<String> selectCaseDesigners();
}
