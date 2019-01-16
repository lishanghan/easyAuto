package com.haier.service.impl;

import com.haier.mapper.TenvMapper;
import com.haier.po.Tcase;
import com.haier.po.Tenv;
import com.haier.po.Tservicedetail;
import com.haier.service.TcaseService;
import com.haier.service.TenvService;
import com.haier.service.TservicedetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/9 9:31
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class TenvServiceImpl implements TenvService {

    @Autowired
    TenvMapper tenvMapper;

    @Autowired
    TservicedetailService tservicedetailService;

    @Autowired
    TcaseService tcaseService;

    @Override
    public List<Tenv> selectAll() {
        List<Tenv> tenvs = tenvMapper.selectByExample(null);
        return tenvs;
    }

    @Override
    public Tenv selectOne(Integer id) {
        return tenvMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer updateOne(Tenv tenv) {
        return tenvMapper.updateByPrimaryKeySelective(tenv);
    }

    @Override
    public Integer insertOne(Tenv tenv) {
        return tenvMapper.insertSelective(tenv);
    }

    @Override
    public Integer deleteOne(Integer id) {
        //先删除tservicedetail表中的记录
        Tservicedetail tservicedetail = new Tservicedetail();
        tservicedetail.setEnvid(id);
        tservicedetailService.deleteByCondition(tservicedetail);

        //删除tcase表中的记录
        Tcase tcase = new Tcase();
        tcase.setEnvid(id);
        tcaseService.deleteByCondition(tcase);

        //删除tenv表中的记录
        return tenvMapper.deleteByPrimaryKey(id);
    }
}
