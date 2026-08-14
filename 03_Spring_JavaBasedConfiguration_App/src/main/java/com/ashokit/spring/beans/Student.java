package com.ashokit.spring.beans;

public class Student {

    private String name;
    private String courseName;
    private String city;
    private Address address;

    public Student(){

    }
    public Student(String name,String courseName,String city){
        this.name = name;
        this.courseName = courseName;
        this.city =city;
    }

    public Student(String name,String courseName,String city,Address address){
        this.name = name;
        this.courseName = courseName;
        this.city =city;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}
