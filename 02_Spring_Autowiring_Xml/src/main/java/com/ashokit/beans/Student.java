package com.ashokit.beans;

public class Student {

    private String name;
    private String course;
    private Address address;

    //Default Constructor
    public Student(){
        System.out.println("Student Class Default");
    }

    //parameterized constructor
    public Student(String name, String course){
        this.name= name;
        this.course = course;
    }

    //parameterized constructor
    public Student(String name, String course, Address address){
        System.out.println("Parameterized constructor..");
        this.name= name;
        this.course =course;
        this.address =address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", address=" + address +
                '}';
    }
}
