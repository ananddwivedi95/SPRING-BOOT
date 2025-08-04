package com.anand.Application.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${student.name}")
    //@Value("anand")
    private String name;

    @Value("${student.age}")
    //@Value("20")
    private byte age;

    @Value("${student.dobYear}")
    //@Value("1999")
    private short dobYear;

    @Value("${student.salary}")
    //@Value("1234567890")
    private int salary;

    @Value("${student.accountBalance}")
    //@Value("30000000000")
    private long accountBalance;

    @Value("${student.avgOfMark}")
    //@Value("85")
    private double avgOfMark;

    @Value("${student.percentage}")
    //@Value("85.52")
    private float percentage;

    @Value("${student.gender}")
    //@Value("M")
    private char gender;

    @Value("${student.youAreHuman}")
    //@Value("true")
    private boolean youAreHuman;

    public Student()
    {
        System.out.println("student bean is created");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dobYear=" + dobYear +
                ", salary=" + salary +
                ", accountBalance=" + accountBalance +
                ", avgOfMark=" + avgOfMark +
                ", percentage=" + percentage +
                ", gender=" + gender +
                ", youAreHuman=" + youAreHuman +
                '}';
    }
}
