package com.anand.application.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home()
    {
        return "welcome";
    }
    @ResponseBody
    @GetMapping("/check")
    public String check()
    {
        return "everything is working";
    }
}
