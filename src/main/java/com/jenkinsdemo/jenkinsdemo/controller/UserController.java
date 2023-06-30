package com.jenkinsdemo.jenkinsdemo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/hello")
    public  String getSimpleMsg(){
        return "Welcome in Java Integration With jenkins Project calling  hello end point...";
    }

    @GetMapping("/msg")
    public  String getMsg(){
        return "Welcome in Java Integration With jenkins Project calling msg end point...";
    }
}
