package com.anand.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("${address.city}")
    private String city;

    @Value("${address.state}")
    private String state;

    @Value("${address.country}")
    private String country;

    //@Value("${address.pinCode}")
    private String pinCode;

    public Address()
    {
        System.out.println("Address bean is created");
    }
    public Address(String city, String state, String country, String pinCode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
