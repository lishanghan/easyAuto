package com.haier.service.impl;

import com.haier.enums.StatusCodeEnum;
import com.haier.enums.StatusEnum;
import com.haier.exception.HryException;
import com.haier.mapper.TcustomdetailBatchMapper;
import com.haier.mapper.TcustomdetailMapper;
import com.haier.po.Tcustomdetail;
import com.haier.po.TcustomdetailExample;
import com.haier.service.TcustomdetailService;
import com.haier.util.ReflectUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/7/11 15:25
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Slf4j
@Service
public class TcustomdetailServiceImpl implements TcustomdetailService {

    @Autowired
    TcustomdetailMapper mapper;

    @Autowired
    TcustomdetailBatchMapper batchMapper;

    @Override
    public Integer insertOne(Tcustomdetail tcustomdetail) {
        mapper.insertSelective(tcustomdetail);
        return tcustomdetail.getId();
    }

    @Override
    public Integer insertBatch(List<Tcustomdetail> tcustomdetails) {
        return batchMapper.insertBatch(tcustomdetails);
    }

    @Override
    public Integer updateOne(Tcustomdetail tcustomDetail) {
        ReflectUtil.setInvalidFieldToNull(tcustomDetail, false);
        if (tcustomDetail == null || tcustomDetail.getId() == null) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "更新操作时,tcustomdetail.id必填");
        }
        return mapper.updateByPrimaryKeySelective(tcustomDetail);
    }

    @Override
    public Integer deleteOne(Integer id) {
        if (id == null) {
            return null;
        }
        Tcustomdetail tcustomdetail = new Tcustomdetail();
        tcustomdetail.setId(id);
        tcustomdetail.setStatus(StatusEnum._ONE.getId());
        return this.updateOne(tcustomdetail);
    }

    @Override
    public Integer physicalDeleteOne(Integer id) {
        return mapper.deleteByPrimaryKey(id);

    }

    @Override
    public Integer deleteByCondition(Tcustomdetail tcustomdetail) {
        ReflectUtil.setInvalidFieldToNull(tcustomdetail, false);
        if (tcustomdetail == null) {
            return null;
        }
        Tcustomdetail model = new Tcustomdetail();
        model.setStatus(StatusEnum._ONE.getId());

        TcustomdetailExample example = new TcustomdetailExample();
        TcustomdetailExample.Criteria criteria = example.createCriteria();

        if (tcustomdetail.getCustomid() != null) {
            //根据定制id批量删除定制详情记录
            criteria.andCustomidEqualTo(tcustomdetail.getCustomid());
            if (tcustomdetail.getClientlevel() != null) {
                //如果指定的定制id,可进一步根据定制级别批量删除定制详情
                criteria.andClientlevelEqualTo(tcustomdetail.getClientlevel());
            }
        }
        return mapper.updateByExampleSelective(model, example);
    }

    @Override
    public Integer physicalDeleteByCondition(Tcustomdetail tcustomdetail) {
        TcustomdetailExample example = new TcustomdetailExample();
        TcustomdetailExample.Criteria criteria = example.createCriteria();
        if (tcustomdetail != null && tcustomdetail.getCustomid() != null) {
            criteria.andCustomidEqualTo(tcustomdetail.getCustomid());
        } else {
            return 0;
        }
        return mapper.deleteByExample(example);
    }

    @Override
    public List<Tcustomdetail> selectByCondition(Tcustomdetail tcustomdetail) {
        //ReflectUtil.setFieldAddPercentAndCleanZero(tcustomdetail, false);
        TcustomdetailExample example = new TcustomdetailExample();
        TcustomdetailExample.Criteria criteria = example.createCriteria();
        criteria.andStatusGreaterThan(0);
        if (tcustomdetail != null) {
            if (tcustomdetail.getCustomid() != null) {//如果定制id存在 ,则根据定制id查询
                criteria.andCustomidEqualTo(tcustomdetail.getCustomid());
                if (tcustomdetail.getClientlevel() != null) {//如果定制级别存在 ,并且定制id也存在 ,则可查询定制级别
                    criteria.andClientlevelEqualTo(tcustomdetail.getClientlevel());
                }
            }
        }
        return mapper.selectByExample(example);
    }

    @Override
    public List<Tcustomdetail> selectByCondition(Integer customId) {
        return this.selectByCondition(customId, null);
    }

    @Override
    public List<Tcustomdetail> selectByCondition(Integer customId, Integer clientLevel) {
        Tcustomdetail tcustomdetail = new Tcustomdetail();
        tcustomdetail.setCustomid(customId);
        tcustomdetail.setClientlevel(clientLevel);
        return this.selectByCondition(tcustomdetail);
    }

    @Override
    public List<Tcustomdetail> selectByCustomIds(List<Integer> ids) {
        return batchMapper.selectByTcustomIds(ids);
    }

}
