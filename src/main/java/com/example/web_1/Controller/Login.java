package com.example.web_1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @RequestMapping("/login")
    public String loginPage(){
        return "Login Page";
    }
}
