package com.ashokit.beans;

public class Welcome {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
    public void display(){
        System.out.println("message = " + message);
    }

    @Override
    public String toString() {
        return message;
    }
}

