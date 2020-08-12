package com.yuwenchao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yuwenchao.iReport.vo.FirstEmpVo;

public interface FirstEmpVoMapper {

	//查询所有FirstEmpVo
	public List<FirstEmpVo> getAllEmp();
  
	//带条件查询
	public List<FirstEmpVo> getAllEmpCondition(@Param("id")Integer id,@Param("firstName")String firstName, @Param("firstAge")Integer firstAge, @Param("firstGender")String firstGender,
			@Param("firstEmail")String firstEmail, @Param("firstPhone")String firstPhone, @Param("firstAddress")String firstAddress, @Param("firstSalary")Double firstSalary, @Param("deptName")String deptName,
			@Param("deptNature")String deptNature);
	//带1个条件查询	
	public List<FirstEmpVo> getAllEmpConditionone1(@Param("firstName")String firstName,@Param("firstEmail")String firstEmail);
	
	
}
