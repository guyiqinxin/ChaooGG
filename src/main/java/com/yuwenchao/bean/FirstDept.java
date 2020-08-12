package com.yuwenchao.bean;

public class FirstDept {
    private Integer id;

    private String deptName;

    private String deptNature;

    private String deptId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptNature() {
        return deptNature;
    }

    public void setDeptNature(String deptNature) {
        this.deptNature = deptNature == null ? null : deptNature.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }
}