package com.anand.hospital;

public class Hospital {
    private String name;
    private Patient patient;

    public Hospital(Patient patient) {
        this.name = name;
        this.patient = patient;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Patient getPatient() {
        return patient;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", patient=" + patient +
                '}';
    }
}
