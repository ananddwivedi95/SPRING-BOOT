package com.anand.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalApplication {
    public static void main(String[] args)
    {
        ApplicationContext container= new ClassPathXmlApplicationContext("PatientConfiguration.xml");
        Hospital h1= (Hospital)container.getBean("hospital");
        System.out.println(h1);System.out.println(h1.getPatient());
    }
}
