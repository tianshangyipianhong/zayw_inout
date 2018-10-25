package com.zay.inout.handler.controller;

import com.zay.inout.pojo.users;
import com.zay.inout.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private TestService service;
@RequestMapping("login.zay")
public  String getUsers(Model model){
    List<users> users = service.getUsers();
    System.out.println(users);
    model.addAttribute("users",users);
    return "login";
}
}
