package com.ashokit.spring.beans;

public class Address {

    private String doorNo;
    private String streetName;
    private String city;

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    //business method
    public void displayAddressDetails(){
        System.out.println("doorNo = " + doorNo);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo='" + doorNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


