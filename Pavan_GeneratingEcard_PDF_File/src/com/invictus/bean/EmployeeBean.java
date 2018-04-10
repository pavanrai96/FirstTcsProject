package com.invictus.bean;


import java.util.Date;
import java.util.Set;

public class EmployeeBean {
	private int empHid;
	private int employeeId;
	private String employeeName;
	private Date dateOfBirth;
	private String gender;
	private String Email;
	private String alternateEmail;
	private String phoneNumber;
	private String alternateMobileNumber;
	private Date policyStartDate;
	private int policyPeriod;
	private double totalSumInsured;//see double
	private double premiumAmount;//see double
	private String companyName;
	private Date requestSubmitDate_Time;
	private String status;
	private Date approvalDate;

	private BankDetailsBean bankDetails;
	private EmployeeLoginBean login;
	private Set<DependentBean> dependents;

	public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeLoginBean getLogin() {
		return login;
	}
	public void setLogin(EmployeeLoginBean login) {
		this.login = login;
	}
	public BankDetailsBean getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetailsBean bankDetails) {
		this.bankDetails = bankDetails;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public Date getPolicyStartDate() {
		return policyStartDate;
	}
	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}
	public double getTotalSumInsured() {
		return totalSumInsured;
	}
	public void setTotalSumInsured(double totalSumInsured) {
		this.totalSumInsured = totalSumInsured;
	}
	public double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getRequestSubmitDate_Time() {
		return requestSubmitDate_Time;
	}
	public void setRequestSubmitDate_Time(Date requestSubmitDate_Time) {
		this.requestSubmitDate_Time = requestSubmitDate_Time;
	}
	public int getEmpHid() {
		return empHid;
	}
	public void setEmpHid(int empHid) {
		this.empHid = empHid;
	}
	public Set<DependentBean> getDependents() {
		return dependents;
	}
	public void setDependents(Set<DependentBean> dependents) {
		this.dependents = dependents;
	}
	public int getPolicyPeriod() {
		return policyPeriod;
	}
	public void setPolicyPeriod(int policyPeriod) {
		this.policyPeriod = policyPeriod;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}


}
