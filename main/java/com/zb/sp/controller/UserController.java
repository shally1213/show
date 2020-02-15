package com.zb.sp.controller;

import com.zb.sp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    ServletContext ServletContext;

    @RequestMapping("/buy")
    public String hello() {
        System.out.println("helloworld");
        return "购买一个产品";
    }


    @RequestMapping("/buy2")
    public String hello2() {
        System.out.println("helloworld");
        return "购买一个产品";
    }


    @RequestMapping("/search")
    public List<Map> list(){
        return userService.list(null);
    }


}
