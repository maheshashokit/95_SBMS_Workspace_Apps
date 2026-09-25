package com.ashokit;

public class Employee {
	
	private String empId;
	
	private String empName;
	
	private String location;
	
	public Employee() {
		
	}

	public Employee(String empId, String empName, String location) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.location = location;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
