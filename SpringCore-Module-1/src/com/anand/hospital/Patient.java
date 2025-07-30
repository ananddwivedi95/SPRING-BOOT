package com.anand.hospital;

import java.util.List;

public class Patient {

    private String name;
    private long mobileNumber;
    private List<String> medicine;

    public Patient(String name, long mobileNumber ,List<String> medicine) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.medicine=medicine;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", medicine=" + medicine +
                '}';
    }
}
