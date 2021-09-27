package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @RequestMapping("/message")
    public String kitchenServerApp(){
        return "Kitchen Server Application";
    }
}
