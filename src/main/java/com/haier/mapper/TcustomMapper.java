package com.haier.mapper;

import com.haier.po.Tcustom;
import com.haier.po.TcustomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TcustomMapper {
    long countByExample(TcustomExample example);

    int deleteByExample(TcustomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tcustom record);

    int insertSelective(Tcustom record);

    List<Tcustom> selectByExample(TcustomExample example);

    Tcustom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tcustom record, @Param("example") TcustomExample example);

    int updateByExample(@Param("record") Tcustom record, @Param("example") TcustomExample example);

    int updateByPrimaryKeySelective(Tcustom record);

    int updateByPrimaryKey(Tcustom record);
}