package com.anand.Annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    @Qualifier("address")
    private Address address;

    private int id;
    private String name;
    private String cource;

    public Student()
    {
        System.out.println("Student bean is created");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cource='" + cource + '\'' +
                '}';
    }
}
