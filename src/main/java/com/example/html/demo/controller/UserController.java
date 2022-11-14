package com.example.html.demo.controller;

import com.example.html.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("userForm", new User());
        return "index";
    }



    @PostMapping("/save")
    public String getUser(@ModelAttribute User user, Model model){
        System.out.println(user.toString());
        model.addAttribute("userForm", new User());
        System.out.println( user.getFname());
        return "index";
    }
}
