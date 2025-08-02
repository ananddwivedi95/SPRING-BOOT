package com.anand.duplicateconfigurationclass;

public class College1 {
    private String name;
    private String city;
    private String phoneNumber;


    public College1(String name, String city, String phoneNumber) {
        this.name = name;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
