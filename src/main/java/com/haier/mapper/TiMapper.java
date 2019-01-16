package com.haier.mapper;

import com.haier.po.Ti;
import com.haier.po.TiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TiMapper {
    long countByExample(TiExample example);

    int deleteByExample(TiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ti record);

    int insertSelective(Ti record);

    List<Ti> selectByExample(TiExample example);

    Ti selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ti record, @Param("example") TiExample example);

    int updateByExample(@Param("record") Ti record, @Param("example") TiExample example);

    int updateByPrimaryKeySelective(Ti record);

    int updateByPrimaryKey(Ti record);
}