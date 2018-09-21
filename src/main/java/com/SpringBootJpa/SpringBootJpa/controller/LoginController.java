package com.SpringBootJpa.SpringBootJpa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {

    @RequestMapping(value = "/")
    public String homePage(){
        return "login";
    }
}
