package com.anand.application.jpql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee1")
public class Employee1 {
    @Id
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String city;
    private String salary;

    public Employee1() {
        System.out.println("employee1 bean is created");
    }
   public Employee1(int id,String name,String email, String phoneNumber, String city,String salary)
   {
       this.id=id;
       this.name=name;
       this.email=email;
       this.phoneNumber=phoneNumber;
       this.city=city;
       this.salary=salary;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
