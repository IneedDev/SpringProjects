package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/index")

    //if we remove below adnotation  than  browser will print tempalte
    //@ResponseBody
//    public String hello(){
//        return "Hello spring world";
//    }

    public String hello(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    //Path variable – zmienna zaszyta w adresie url
    @GetMapping("/hello/{text}")
//    @ResponseBody
//    public String printHello(@PathVariable("text") String text){
//        return "Przeszło " + text;
//    }

    // patrhvariable to zmienna
    public String printHello(@PathVariable("text") String text, Model model){
        model.addAttribute("text","z url "+text);
        return "print_hello";
    }


}
