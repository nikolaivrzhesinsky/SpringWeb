package com.example.hellowworlddemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String SayHello(){
        return "hello-world";
    }
}
