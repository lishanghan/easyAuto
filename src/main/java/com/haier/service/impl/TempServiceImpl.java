package com.haier.service.impl;

import com.haier.mapper.TempMapper;
import com.haier.po.Temp;
import com.haier.po.TempExample;
import com.haier.service.TempService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/9/27 17:04
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
@Slf4j
public class TempServiceImpl implements TempService {
    @Autowired
    TempMapper tempMapper;

    @Override
    public Integer insertOne(Temp temp) {
        tempMapper.insertSelective(temp);
        return temp.getId();
    }

    @Override
    public Temp selectOne(Integer id) {
        return tempMapper.selectByPrimaryKey(id);
    }

    @Override
    public Temp selectOne(String testingId, String tempKey) {
        if (StringUtils.isAnyBlank(testingId, tempKey)) {
            return null;
        }
        Temp condition = new Temp();
        condition.setTestingid(testingId);
        condition.setTempkey(tempKey);
        List<Temp> temps = this.selectAll(condition);
        for (Temp temp : temps) {
            return temp;
        }
        return null;
    }

    @Override
    public String getTempValue(String testingId, String tempKey) {
        if (!StringUtils.isAnyBlank(testingId, tempKey)) {
            Temp condition = new Temp();
            condition.setTestingid(testingId);
            condition.setTempkey(tempKey);
            List<Temp> temps = this.selectAll(condition);
            for (Temp temp : temps) {
                return temp.getTempvalue() == null ? "" : temp.getTempvalue();
            }
        }
        return "";
    }

    @Override
    public List<Temp> selectList(String testingId) {
        if (StringUtils.isBlank(testingId)) {
            return new ArrayList<>();
        }
        Temp condition = new Temp();
        condition.setTestingid(testingId);
        return this.selectAll(condition);
    }

    public List<Temp> selectAll(Temp temp) {
        TempExample example = new TempExample();
        example.setOrderByClause("updateTime desc,id desc");//时间倒序,id倒序
        TempExample.Criteria criteria = example.createCriteria();
        criteria.andStatusGreaterThan(0);
        if (temp != null) {
            if (StringUtils.isNotBlank(temp.getTestingid())) {
                criteria.andTestingidEqualTo(temp.getTestingid());
            }
            if (StringUtils.isNotBlank(temp.getServicekey())) {
                criteria.andServicekeyEqualTo(temp.getServicekey());
            }
            if (StringUtils.isNotBlank(temp.getTempkey())) {
                criteria.andTempkeyEqualTo(temp.getTempkey());
            }
            if (StringUtils.isNotBlank(temp.getIuri())) {
                criteria.andIuriEqualTo(temp.getIuri());
            }
        }
        return tempMapper.selectByExample(example);
    }

}
