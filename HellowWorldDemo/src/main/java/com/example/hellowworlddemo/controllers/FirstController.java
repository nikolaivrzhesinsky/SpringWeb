package com.example.hellowworlddemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model){
        System.out.println(name+" "+surname);
        model.addAttribute("message", name+" "+surname);
        return "all/first/hello";
    }

    @GetMapping("/goodBye")
    public  String goodBye(){
        return "all/first/goodBye";
    }
}
