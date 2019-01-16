package com.haier.mapper;

import com.haier.po.Tservicedetail;
import com.haier.po.TservicedetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TservicedetailMapper {
    long countByExample(TservicedetailExample example);

    int deleteByExample(TservicedetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tservicedetail record);

    int insertSelective(Tservicedetail record);

    List<Tservicedetail> selectByExample(TservicedetailExample example);

    Tservicedetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tservicedetail record, @Param("example") TservicedetailExample example);

    int updateByExample(@Param("record") Tservicedetail record, @Param("example") TservicedetailExample example);

    int updateByPrimaryKeySelective(Tservicedetail record);

    int updateByPrimaryKey(Tservicedetail record);
}