package com.ashokit.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {

    //simple properties
    private String username;
    private String password;

    //object properties
    @Autowired
    @Qualifier("address1")
    private Address address;

    @Autowired
    private Demo demo;


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(Address address) {
        System.out.println("Inside setter  method for Address Object");
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }

    public void setDemo(Demo demo) {
        System.out.println("Inside setter  method for Demo Object");
        this.demo = demo;
    }

    public Demo getDemo() {
        return demo;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", address=" + address + ", demo=" + demo
                + "]";
    }
}