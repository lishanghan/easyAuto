package com.haier.mapper;

import com.haier.po.Tclass;
import com.haier.po.TclassExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TclassMapper {
    long countByExample(TclassExample example);

    int deleteByExample(TclassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tclass record);

    int insertSelective(Tclass record);

    List<Tclass> selectByExample(TclassExample example);

    Tclass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tclass record, @Param("example") TclassExample example);

    int updateByExample(@Param("record") Tclass record, @Param("example") TclassExample example);

    int updateByPrimaryKeySelective(Tclass record);

    int updateByPrimaryKey(Tclass record);
}