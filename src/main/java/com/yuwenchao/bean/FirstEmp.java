package com.yuwenchao.bean;

public class FirstEmp {
    private Integer id;

    private String firstName;

    private String firstGender;

    private Integer firstAge;

    private String firstEmail;

    private String firstPhone;

    private String firstAddress;

    private Double firstSalary;

    private String dId;

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
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getFirstGender() {
        return firstGender;
    }

    public void setFirstGender(String firstGender) {
        this.firstGender = firstGender == null ? null : firstGender.trim();
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
        this.firstEmail = firstEmail == null ? null : firstEmail.trim();
    }

    public String getFirstPhone() {
        return firstPhone;
    }

    public void setFirstPhone(String firstPhone) {
        this.firstPhone = firstPhone == null ? null : firstPhone.trim();
    }

    public String getFirstAddress() {
        return firstAddress;
    }

    public void setFirstAddress(String firstAddress) {
        this.firstAddress = firstAddress == null ? null : firstAddress.trim();
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
        this.dId = dId == null ? null : dId.trim();
    }

	public FirstEmp(Integer id, String firstName, String firstGender, Integer firstAge, String firstEmail,
			String firstPhone, String firstAddress, Double firstSalary, String dId) {
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
	}

	public FirstEmp() {
		super();
	}
    
    
}