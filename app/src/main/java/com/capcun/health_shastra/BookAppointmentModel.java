package com.capcun.health_shastra;


public class BookAppointmentModel {

    String name,address,education;

    public BookAppointmentModel(String name, String address, String education) {
        this.name = name;
        this.address = address;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
