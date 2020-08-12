package com.yuwenchao.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuwenchao.iReport.vo.FirstEmpVo;
import com.yuwenchao.mapper.FirstEmpVoMapper;

@Service
public class FirstEmpVoService {
    @Autowired
    FirstEmpVoMapper  mapper;
    
    
    public List<FirstEmpVo> getAllEmp(){
    	return mapper.getAllEmp();
    }


	public List<FirstEmpVo> getAllEmpCondition(Integer id,String firstName,Integer firstAge,String firstGender,
			String firstEmail,String firstPhone,String firstAddress,Double firstSalary, 
			String deptName,String deptNature) {
		// TODO Auto-generated method stub
		return mapper.getAllEmpCondition(id,firstName,firstAge,firstGender,firstEmail,
				firstPhone,firstAddress,firstSalary,deptName,deptNature);
	}
	
	public List<FirstEmpVo> getAllEmpConditionone1(String firstName,String firstEmail){
		return mapper.getAllEmpConditionone1(firstName,firstEmail);
	};
}
