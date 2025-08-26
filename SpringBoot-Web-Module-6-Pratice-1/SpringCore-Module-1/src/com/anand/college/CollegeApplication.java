package com.anand.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.List;

public class CollegeApplication {

    public static void main(String[] args)
    {
        /*Address addr= new Address("Bangalore","510101");

        Student student= new Student("anand",2124542,addr);
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student.getMobileNumber());
        System.out.println(student.getAddress());*/

        ApplicationContext container= new FileSystemXmlApplicationContext("C:\\Users\\anand\\IdeaProjects\\SptingBoot\\SpringCore-Module-1\\ApplicationConfiguration.xml");

        //get the bean(object) by its ref name, firstly its check whether this ref name object is present or not
        Address adr= (Address) container.getBean("adr");
        Student std= (Student) container.getBean("std1");
        Address adr1= (Address) container.getBean("adr1");
        Student std1= (Student) container.getBean("std2");
        Student std2= (Student) container.getBean("std3");
        System.out.println(adr);
        System.out.println(std);
        System.out.println(adr1);
        System.out.println(std1);
        System.out.println(std2);

        StreamDetails detail=(StreamDetails)container.getBean("subject1");
        List<String> list=detail.getSubjects();
        System.out.println(detail.getStreamName());
        System.out.println(list.size());
        list.forEach(System.out::println);

    }
}
