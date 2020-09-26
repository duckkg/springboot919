package com.niu.springboot_9_19.controller;

import com.niu.springboot_9_19.pojo.User;
import com.niu.springboot_9_19.service.User_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class User_controller {

    @Autowired
    private User_service user_service;

    @RequestMapping("/login")
    public String login(User user){
        User u = user_service.login(user);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("user",u);
        return  "index";
    }
}
