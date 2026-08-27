package com.ashokit.beans;

public class Employee {

    private Integer empId;

    private String empName;

    private String emailId;

    public Employee(){
        System.out.println("Inside the Employee Constructor");
    }

    public Employee(Integer empId, String emailId, String empName) {
        this.empId = empId;
        this.emailId = emailId;
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
