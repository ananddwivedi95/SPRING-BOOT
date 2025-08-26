package com.anand.application.controller;

import com.anand.application.Request.UserRequest;
import com.anand.application.entity.UserEntity;
import com.anand.application.service.UserService;
import com.fasterxml.jackson.databind.introspect.AnnotatedAndMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserService service;

     // springboot project
    // registration page
    @GetMapping("/registration")
    public String registration()
    {
        return "registration";
    }

    @PostMapping("/register")
    public ModelAndView userRegistration(@ModelAttribute UserRequest request)
    {
        ModelAndView view = new ModelAndView(service.userRegistration(request));
        view.addObject("gmail",request.getEmail());
        return view;
    }


    //login page
    @GetMapping("/login")
    public String loginUser()
    {
        return "login";
    }
    @PostMapping("/user/login")
    public String loginUserData(@ModelAttribute UserRequest request)
    {
         return service.loginCheck(request);
    }

    @GetMapping("/home")
    public String dashBoard()
    {
        return "dashboard";
    }

    @GetMapping("/check")
    public String checkUser()
    {
        return "Spring Boot Project working ";
    }
}
