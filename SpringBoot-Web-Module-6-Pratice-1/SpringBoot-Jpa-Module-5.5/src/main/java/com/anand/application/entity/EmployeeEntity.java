package com.anand.application.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String grnder;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="employeeId")
    List<AddressEntity> addrrss;

    public EmployeeEntity() {
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

    public String getGrnder() {
        return grnder;
    }

    public void setGrnder(String grnder) {
        this.grnder = grnder;
    }

    public List<AddressEntity> getAddrrss() {
        return addrrss;
    }

    public void setAddrrss(List<AddressEntity> addrrss) {
        this.addrrss = addrrss;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grnder='" + grnder + '\'' +
                ", addrrss=" + addrrss +
                '}';
    }
}
