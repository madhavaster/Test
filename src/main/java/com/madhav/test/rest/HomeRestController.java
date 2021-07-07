package com.madhav.test.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @GetMapping
    public String m1(){
        return "Hello Hemanth";
    }
}
