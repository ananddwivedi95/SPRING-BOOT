package com.anand.application.entity;

import jakarta.persistence.*;

@Entity
public class AddressEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int addressId;
    private String city;
    private int pinCode;
    private String country;

    public AddressEntity()
    {

    }
    public AddressEntity(String city, int pinCode, String country) {
        this.city = city;
        this.pinCode = pinCode;
        this.country = country;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "AddressEntity{" +
                "addressId=" + addressId +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", country='" + country + '\'' +
                '}';
    }
}
