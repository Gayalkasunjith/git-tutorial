package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/")
public class LoginController {

    @GetMapping(value = "login")
    public ModelAndView getLogin() {
        return new ModelAndView("login");
    }

}
