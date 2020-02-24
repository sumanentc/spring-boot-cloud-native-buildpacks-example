package com.example.buildpacks.cloudnativebuildpacks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/{name}")
    public String hello(@PathVariable String name){
        return "Welcome " + name +" to Cloud native World !!!";
    }
}
