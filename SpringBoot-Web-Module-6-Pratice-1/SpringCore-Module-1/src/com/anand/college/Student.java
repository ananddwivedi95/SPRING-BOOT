package com.anand.college;

public class Student {

    private String name;
    private long mobileNumber;
    private Address address;

    public Student(String name, long mobileNumber, Address address) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", address=" + address +
                '}';
    }
}
