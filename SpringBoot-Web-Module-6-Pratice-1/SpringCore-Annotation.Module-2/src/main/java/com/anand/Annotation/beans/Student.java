package com.anand.Annotation.beans;

public class Student {
    private String name;
    private int age;
    private String course;
    private String department;
    private String college;
    private String email;

    public Student(String name, int age, String course, String department, String college, String email) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.department = department;
        this.college = college;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", department='" + department + '\'' +
                ", college='" + college + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
