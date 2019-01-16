package com.haier.mapper;

import com.haier.po.Tenv;
import com.haier.po.TenvExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TenvMapper {
    long countByExample(TenvExample example);

    int deleteByExample(TenvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tenv record);

    int insertSelective(Tenv record);

    List<Tenv> selectByExample(TenvExample example);

    Tenv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tenv record, @Param("example") TenvExample example);

    int updateByExample(@Param("record") Tenv record, @Param("example") TenvExample example);

    int updateByPrimaryKeySelective(Tenv record);

    int updateByPrimaryKey(Tenv record);
}