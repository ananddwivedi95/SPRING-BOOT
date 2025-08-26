package com.anand.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private String className;
    private int age;
    private String address;

    @Qualifier("address2")
    @Autowired
    private Address addressRef;


    public Student()
    {
        System.out.println("student 1 bean is created");
    }
    public Student(String name, String className, int age, String address) {
        this.name = name;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", addressRef=" + addressRef +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Address getAddressRef() {
        return addressRef;
    }

    public void setAddressRef(Address addressRef) {
        this.addressRef = addressRef;
    }
}
