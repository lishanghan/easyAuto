package com.haier.mapper;

import com.haier.po.Tcustomdetail;
import com.haier.po.TcustomdetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TcustomdetailMapper {
    long countByExample(TcustomdetailExample example);

    int deleteByExample(TcustomdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tcustomdetail record);

    int insertSelective(Tcustomdetail record);

    List<Tcustomdetail> selectByExample(TcustomdetailExample example);

    Tcustomdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tcustomdetail record, @Param("example") TcustomdetailExample example);

    int updateByExample(@Param("record") Tcustomdetail record, @Param("example") TcustomdetailExample example);

    int updateByPrimaryKeySelective(Tcustomdetail record);

    int updateByPrimaryKey(Tcustomdetail record);
}