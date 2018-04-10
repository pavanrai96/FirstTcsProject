package com.invictus.bean;

public class EmployeeLoginBean {

	private int empHid;
	private String password;
	private EmployeeBean employee;

	public EmployeeBean getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeBean employee) {
		this.employee = employee;
	}
	public EmployeeLoginBean() {
		super();

	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmpHid() {
		return empHid;
	}
	public void setEmpHid(int empHid) {
		this.empHid = empHid;
	}


}
