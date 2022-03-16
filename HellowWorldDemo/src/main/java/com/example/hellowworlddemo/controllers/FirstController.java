package com.example.hellowworlddemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(){
        return "all/first/hello";
    }

    @GetMapping("/goodBye")
    public  String goodBye(){
        return "all/first/goodBye";
    }
}
