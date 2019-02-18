package com.bridgelabz.jdbc.model;

public class Employee {

	private int empId;
	private String empName;
	private String empAddress;
	private String empTechnology;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpTechnology() {
		return empTechnology;
	}

	public void setEmpTechnology(String empTechnology) {
		this.empTechnology = empTechnology;
	}
}