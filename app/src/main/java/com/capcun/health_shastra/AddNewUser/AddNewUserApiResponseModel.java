package com.capcun.health_shastra.AddNewUser;

public class AddNewUserApiResponseModel {

    String message;

    public AddNewUserApiResponseModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
