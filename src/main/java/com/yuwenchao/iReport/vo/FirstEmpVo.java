package com.yuwenchao.iReport.vo;

public class FirstEmpVo {
	private Integer id;

    private String firstName;

    private String firstGender;

    private Integer firstAge;

    private String firstEmail;

    private String firstPhone;

    private String firstAddress;

    private Double firstSalary;

    private String dId;
    
    private String deptName;
    
    private String deptNature;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstGender() {
		return firstGender;
	}

	public void setFirstGender(String firstGender) {
		this.firstGender = firstGender;
	}

	public Integer getFirstAge() {
		return firstAge;
	}

	public void setFirstAge(Integer firstAge) {
		this.firstAge = firstAge;
	}

	public String getFirstEmail() {
		return firstEmail;
	}

	public void setFirstEmail(String firstEmail) {
		this.firstEmail = firstEmail;
	}

	public String getFirstPhone() {
		return firstPhone;
	}

	public void setFirstPhone(String firstPhone) {
		this.firstPhone = firstPhone;
	}

	public String getFirstAddress() {
		return firstAddress;
	}

	public void setFirstAddress(String firstAddress) {
		this.firstAddress = firstAddress;
	}

	public Double getFirstSalary() {
		return firstSalary;
	}

	public void setFirstSalary(Double firstSalary) {
		this.firstSalary = firstSalary;
	}

	public String getdId() {
		return dId;
	}

	public void setdId(String dId) {
		this.dId = dId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptNature() {
		return deptNature;
	}

	public void setDeptNature(String deptNature) {
		this.deptNature = deptNature;
	}

	public FirstEmpVo() {
		super();
	}

	public FirstEmpVo(Integer id, String firstName, String firstGender, Integer firstAge, String firstEmail,
			String firstPhone, String firstAddress, Double firstSalary, String dId, String deptName,
			String deptNature) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.firstGender = firstGender;
		this.firstAge = firstAge;
		this.firstEmail = firstEmail;
		this.firstPhone = firstPhone;
		this.firstAddress = firstAddress;
		this.firstSalary = firstSalary;
		this.dId = dId;
		this.deptName = deptName;
		this.deptNature = deptNature;
	}

	@Override
	public String toString() {
		return "FirstEmpVo [id=" + id + ", firstName=" + firstName + ", firstGender=" + firstGender + ", firstAge="
				+ firstAge + ", firstEmail=" + firstEmail + ", firstPhone=" + firstPhone + ", firstAddress="
				+ firstAddress + ", firstSalary=" + firstSalary + ", dId=" + dId + ", deptName=" + deptName
				+ ", deptNature=" + deptNature + "]";
	}
    
    
    
}
