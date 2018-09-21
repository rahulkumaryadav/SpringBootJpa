package com.SpringBootJpa.SpringBootJpa.controller;


import com.SpringBootJpa.SpringBootJpa.model.dao.IUserDao;
import com.SpringBootJpa.SpringBootJpa.model.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class controller {

    @Autowired
    IUserDao iUserDao;


   /* @RequestMapping(value = "/")
    public String homePage(){
        return "login";
    }*/


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showForm(Model model) {
        Users users = new Users();
        users.setId(Long.parseLong("11"));
        users.setUserName("rahul");
        iUserDao.save(users);
        System.out.println("User name ----->" + users.getUserName());
        model.addAttribute("users", users);
        return null;
    }


    @RequestMapping(value = "/dashBoard", method = RequestMethod.POST)
    public String processForm(@ModelAttribute(value = "users") Users users) {
        users.setUserName(users.getUserName());
        iUserDao.save(users);
        return null;
    }


}
