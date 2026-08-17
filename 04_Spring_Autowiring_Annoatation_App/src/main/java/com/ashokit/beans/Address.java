package com.ashokit.beans;

public class Address {

    //simple properties
    private String doorNo;
    private String streetName;
    private String city;

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", city=" + city + "]";
    }
}
