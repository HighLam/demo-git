package com.example.demogit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("helo")
    public String helo() {
        return "helo";
    }
}
