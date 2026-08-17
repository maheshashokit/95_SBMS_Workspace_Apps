package com.ashokit.beans;

public class Demo {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Demo [message=" + message + "]";
    }
}