package com.anand.application.propertiessources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AwsDatabase {

    @Value( "${aws.db.url}")
    private String url;

    @Value("${aws.db.username}")
    private String username;

    @Value("${aws.db.password}")
    private String password;

    @Value("${aws.db.driverClassName}")
    private String driverClassName;

    public AwsDatabase()
    {
        System.out.println( "AwsDatabase bean is created");
    }
    public AwsDatabase(String url, String username, String password, String driverClassName) {
        this.url = "jdbc:mysql://localhost:3306/assignment2";
        this.username = "root";
        this.password = "<PASSWORD>";
        this.driverClassName = "com.mysql.cj.jdbc.Driver";
    }
    public String getUrl() {
        return url;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getDriverClassName() {
        return driverClassName;
    }

    @Override
    public String toString() {
        return "AwsDatabase{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                '}';
    }
}
