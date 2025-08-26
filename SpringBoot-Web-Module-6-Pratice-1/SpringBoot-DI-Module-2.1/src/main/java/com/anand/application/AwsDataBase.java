package com.anand.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AwsDataBase {

    @Value("${database.url}")
    private String url;

    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;

    public AwsDataBase()
    {
        System.out.println("AwsDataBase bean is created");
    }

    @Override
    public String toString() {
        return "AwsDataBase{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
