package com.yuwenchao.mapper;

import com.yuwenchao.bean.FirstEmp;
import com.yuwenchao.bean.FirstEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstEmpMapper {
    long countByExample(FirstEmpExample example);

    int deleteByExample(FirstEmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FirstEmp record);

    int insertSelective(FirstEmp record);

    List<FirstEmp> selectByExample(FirstEmpExample example);

    FirstEmp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FirstEmp record, @Param("example") FirstEmpExample example);

    int updateByExample(@Param("record") FirstEmp record, @Param("example") FirstEmpExample example);

    int updateByPrimaryKeySelective(FirstEmp record);

    int updateByPrimaryKey(FirstEmp record);
}