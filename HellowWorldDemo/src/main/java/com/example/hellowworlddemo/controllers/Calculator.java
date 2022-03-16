package com.example.hellowworlddemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {

    @GetMapping("/calculator")
    public String calculate(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            @RequestParam("action") String action,
                            Model model){

        double result;

        switch (action){
            case "multiplication":
                result=num1*num2;
                break;
            case "addition":
                result=num1+num2;
                break;
            case "subtraction":
                result=num1-num2;
                break;
            case "division":
                result=num1/num2;
                break;
            default:
                result=0;
                break;
        }
        model.addAttribute("result",result);
        return "all/first/calculator";
    }
}
