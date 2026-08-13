package com.ashokit.beans;

public class User {

    private String userName;

    private String password;

    private Address address;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAddress(Address address) {
        System.out.println("Setter method of Address bean....");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
