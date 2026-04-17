package com.example.SpringBoot_REST_.APIs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getDemo {

    @GetMapping("/get")
    public String get(){
        return "Hello This is my First Get Request";
    }

}
