package com.haier.mapper;

import com.haier.po.Treport;
import com.haier.po.TreportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TreportMapper {
    long countByExample(TreportExample example);

    int deleteByExample(TreportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Treport record);

    int insertSelective(Treport record);

    List<Treport> selectByExample(TreportExample example);

    Treport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Treport record, @Param("example") TreportExample example);

    int updateByExample(@Param("record") Treport record, @Param("example") TreportExample example);

    int updateByPrimaryKeySelective(Treport record);

    int updateByPrimaryKey(Treport record);
}