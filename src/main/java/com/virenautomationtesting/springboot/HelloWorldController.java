package com.virenautomationtesting.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="Spring Boot Project") String name) {
        
        String message="Welcome to Viren Automation Testing- Spring Boot Maven project for demo!!!";
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        
        return "hello";
    }
}
