package com.yuwenchao.test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yuwenchao.bean.Employee;
import com.yuwenchao.bean.FirstEmp;
import com.yuwenchao.mapper.DepartmentMapper;
import com.yuwenchao.mapper.EmployeeMapper;
import com.yuwenchao.mapper.FirstEmpMapper;
import com.yuwenchao.utils.AutomaticCommon;

/**
 * 测试dao层的工作
 * @author lfy
 *推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位置
 *3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@Autowired
	EmployeeMapper employeeMapper;
	//在配置文件中注入一个批量的sqlSession
	@Autowired
	SqlSession sqlSession;
	
	
	@Test
	public void testsyso(){
		System.out.println(employeeMapper);
		System.out.println(departmentMapper);
		System.out.println(sqlSession);
	}
	
	@Test
	public void testsyso1(){
		List<Employee> list = employeeMapper.selectByExample(null);
		System.out.println("员工集合："+list);
	}
	
	
	@Test
	public void testsyso3(){
		List<Employee> list = employeeMapper.selectByExampleWithDept(null);
		System.out.println("员工集合："+list);
	}
	
	
	//批量插入多个员工	
	@Test
	public void insertBath(){
		AutomaticCommon.getName();
		FirstEmpMapper mapper = sqlSession.getMapper(FirstEmpMapper.class);
		for (int i = 0; i < 100; i++) {
			Map all = AutomaticCommon.getAll();
			String name = (String) all.get("name");
			String gender = (String) all.get("sex");
			int age = (int) all.get("age");
			String email = (String)all.get("email");
			String address = (String)all.get("road");
			String phone = (String)all.get("tel");
			Double salary = (Double) all.get("salary");
			String did = (String)all.get("did");
			mapper.insertSelective(new FirstEmp(null, name, gender, age, email, phone, address, salary, did));
		}
	}
}
