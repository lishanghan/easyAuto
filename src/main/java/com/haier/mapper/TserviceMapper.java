package com.haier.mapper;

import com.haier.po.Tservice;
import com.haier.po.TserviceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TserviceMapper {
    long countByExample(TserviceExample example);

    int deleteByExample(TserviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tservice record);

    int insertSelective(Tservice record);

    List<Tservice> selectByExample(TserviceExample example);

    Tservice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tservice record, @Param("example") TserviceExample example);

    int updateByExample(@Param("record") Tservice record, @Param("example") TserviceExample example);

    int updateByPrimaryKeySelective(Tservice record);

    int updateByPrimaryKey(Tservice record);
}