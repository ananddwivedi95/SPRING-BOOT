package com.anand.college;

public class Address {

    private String location;
    private String pincode;

    public Address(String location, String pincode) {
        this.location = location;
        this.pincode = pincode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "location='" + location + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
