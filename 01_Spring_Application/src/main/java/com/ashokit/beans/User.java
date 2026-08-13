package com.ashokit.beans;

public class User {

    private String userName;
    private String password;

    //Address bean

    //Student bean

    //Demo bean

    public void setUserName(String userName) {
        System.out.println("Inside the UserName");
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        System.out.println("Inside the Password");
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    //business method
    public void displayUserInformation(){
        System.out.println("userName = " + userName);
        System.out.println("password = " + password);
    }
}

