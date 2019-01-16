package com.haier.mapper;


import com.haier.po.Tcustomdetail;

import java.util.List;

/**
 * @Description: 为提升效率 ,自定义批量接口
 * @Author: luqiwei
 * @Date: 2018/8/27 10:35
 */
public interface TcustomdetailBatchMapper {
    Integer insertBatch(List<Tcustomdetail> tcustomdetails);

    List<Tcustomdetail> selectByTcustomIds(List<Integer> ids);
}
