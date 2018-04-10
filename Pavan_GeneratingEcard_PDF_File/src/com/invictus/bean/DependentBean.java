package com.invictus.bean;

import java.sql.Date;

public class DependentBean 
{
	private int dependentHid;
	private String beneficiaryName;
	private String relation;
	private Date dob;
	private String gender;
	private Date policyDate;
	private int policyPeriod;
	private double totalSumInsured;
	private double premiumAmount;
	private Date requestSubmitDate_Time;
	private String status;
	private Date approvalDate;

	private EmployeeBean employee;

	public DependentBean() {
		// TODO Auto-generated constructor stub
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getPolicyDate() {
		return policyDate;
	}
	public void setPolicyDate(Date policyDate) {
		this.policyDate = policyDate;
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
	public Date getRequestSubmitDate_Time() {
		return requestSubmitDate_Time;
	}
	public void setRequestSubmitDate_Time(Date requestSubmitDate_Time) {
		this.requestSubmitDate_Time = requestSubmitDate_Time;
	}

	public int getDependentHid() {
		return dependentHid;
	}

	public void setDependentHid(int dependentHid) {
		this.dependentHid = dependentHid;
	}

	public EmployeeBean getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeBean employee) {
		this.employee = employee;
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

	public DependentBean(int dependentHid, String beneficiaryName, String relation,
			Date dob, String gender, Date policyDate, int policyPeriod,
			double totalSumInsured, double premiumAmount,
			Date requestSubmitDate_Time, EmployeeBean employee) {
		super();
		this.dependentHid = dependentHid;
		this.beneficiaryName = beneficiaryName;
		this.relation = relation;
		this.dob = dob;
		this.gender = gender;
		this.policyDate = policyDate;
		this.policyPeriod = policyPeriod;
		this.totalSumInsured = totalSumInsured;
		this.premiumAmount = premiumAmount;
		this.requestSubmitDate_Time = requestSubmitDate_Time;
		this.employee = employee;
	}
}
