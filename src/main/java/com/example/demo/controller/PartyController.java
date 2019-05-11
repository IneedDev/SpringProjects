package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PartyController {
    @GetMapping("/party/{age}/{name}")

    public String guestAge(@PathVariable("age") int age,
                           @PathVariable("name") String name,
                           Model model){

        if(age >= 18){
            model.addAttribute("text","Witaj "+ name);
        }else {
            model.addAttribute("text","Your age is: "+age+"masz mniej niz 18lat" + name);
        }
        model.addAttribute("age",age);

        //model.addAttribute("text","your age is: "+age);
        return "party";
    }
}
