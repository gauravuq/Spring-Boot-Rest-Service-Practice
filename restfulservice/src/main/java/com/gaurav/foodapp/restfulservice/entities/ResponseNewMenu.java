package com.gaurav.foodapp.restfulservice.entities;

public class ResponseNewMenu {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseNewMenu(String message) {
        this.message = message;
    }
}
