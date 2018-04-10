package com.invictus.bean;

public class BankDetailsBean {
	private int empHid;
	private long bankAccountNumber;
	private String bankName;
	private String ifscCode;

	private EmployeeBean employee;

	public EmployeeBean getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeBean employee) {
		this.employee = employee;
	}

	public BankDetailsBean() {
		// TODO Auto-generated constructor stub
	}
	public long getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public int getEmpHid() {
		return empHid;
	}
	public void setEmpHid(int empHid) {
		this.empHid = empHid;
	}




}
