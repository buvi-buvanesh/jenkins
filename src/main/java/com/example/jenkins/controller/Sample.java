package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

    @GetMapping("/sample")
    public String testingMethod(){
        return "hi buvanesh";
    }
}
