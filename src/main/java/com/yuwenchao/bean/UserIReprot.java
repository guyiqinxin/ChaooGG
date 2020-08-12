package com.yuwenchao.bean;

public class UserIReprot {
  
	
	private String name;
	
	private Integer age;

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public UserIReprot(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public UserIReprot() {
		super();
	}

	@Override
	public String toString() {
		return "UserIReprot [name=" + name + ", age=" + age + "]";
	}

	
	
}
