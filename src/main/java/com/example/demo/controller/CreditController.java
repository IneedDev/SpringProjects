package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreditController {

    @GetMapping("/credit")
    public String credit(){
        return "credit_form";
    }

    @PostMapping("/credit")
    public String credit(@RequestParam("salary") int salary,
                             @RequestParam("credit_duration") int credit_duration,
                             @RequestParam("credit_amount") int credit_amount){
        System.out.println(salary);
        return "credit_form";
    }
}
