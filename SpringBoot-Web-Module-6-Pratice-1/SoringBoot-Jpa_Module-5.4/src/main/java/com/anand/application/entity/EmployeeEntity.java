package com.anand.application.entity;

import jakarta.persistence.*;

@Entity
public class EmployeeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;

    private String name;
    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    AddressEntity address;

    public EmployeeEntity(int empid, String name, String gender, AddressEntity address) {
        this.empid = empid;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public EmployeeEntity() {

    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }
}
