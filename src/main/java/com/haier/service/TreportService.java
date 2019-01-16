package com.haier.service;

import com.github.pagehelper.PageInfo;
import com.haier.po.Treport;
import com.haier.vo.CustomVO;

import java.util.Date;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/28 15:22
 */
public interface TreportService {

    Integer insertOne(Treport treport);

    Treport insertOne(CustomVO customVO, Integer executeUserId, String executeUserName, Boolean isScheduler);

    Treport insertOne(CustomVO customVO, Boolean isScheduler);

    Integer updateOne(Treport treport);

    Integer deleteOne(Integer id);

    Treport selectOne(Integer id);

    Integer getStatus(String reportname);

    Integer getStatus(Integer id);

    PageInfo<Treport> selectByCondition(Treport treport, Date startTime, Date endTime, Integer pageNum, Integer pageSize);
}
