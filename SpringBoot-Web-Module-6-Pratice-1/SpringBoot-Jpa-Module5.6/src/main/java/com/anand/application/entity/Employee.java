package com.anand.application.entity;

import jakarta.persistence.*;
import org.hibernate.service.spi.InjectService;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String phone;
    private String gender;

    //many to one
    @ManyToOne
            @JoinColumn(name = "dept_id")
    Department department;

    public Employee() {
    }
    public Employee(String name, String email, String phone, String gender,Department department) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.department = department;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                '}';
    }
}
