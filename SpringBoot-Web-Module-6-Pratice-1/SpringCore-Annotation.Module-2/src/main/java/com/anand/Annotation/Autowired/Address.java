package com.anand.Annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String address;
    private String pincode;

    public Address() {
        System.out.println("Address bean is created");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
                "address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
