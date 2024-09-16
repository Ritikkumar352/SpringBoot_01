package com.example.web_1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/")
    public String greet(){
        return "Ritik Home page ";
    }

    @RequestMapping("/about")
    public String about(){
        return "About page";
    }

}
