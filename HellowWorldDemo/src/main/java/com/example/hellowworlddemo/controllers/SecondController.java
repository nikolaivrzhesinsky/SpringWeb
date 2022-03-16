package com.example.hellowworlddemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/exit")
    public String exit(){
        return "all/second/exit";
    }
}
