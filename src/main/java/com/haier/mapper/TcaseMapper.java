package com.haier.mapper;

import com.haier.po.Tcase;
import com.haier.po.TcaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TcaseMapper {
    long countByExample(TcaseExample example);

    int deleteByExample(TcaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tcase record);

    int insertSelective(Tcase record);

    List<Tcase> selectByExample(TcaseExample example);

    Tcase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tcase record, @Param("example") TcaseExample example);

    int updateByExample(@Param("record") Tcase record, @Param("example") TcaseExample example);

    int updateByPrimaryKeySelective(Tcase record);

    int updateByPrimaryKey(Tcase record);
}