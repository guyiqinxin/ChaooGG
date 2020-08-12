package com.yuwenchao.mapper;

import com.yuwenchao.bean.FirstDept;
import com.yuwenchao.bean.FirstDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstDeptMapper {
    long countByExample(FirstDeptExample example);

    int deleteByExample(FirstDeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FirstDept record);

    int insertSelective(FirstDept record);

    List<FirstDept> selectByExample(FirstDeptExample example);

    FirstDept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FirstDept record, @Param("example") FirstDeptExample example);

    int updateByExample(@Param("record") FirstDept record, @Param("example") FirstDeptExample example);

    int updateByPrimaryKeySelective(FirstDept record);

    int updateByPrimaryKey(FirstDept record);
}