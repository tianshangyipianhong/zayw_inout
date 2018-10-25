package com.zay.inout.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User {

    @RequestMapping("sda.zay")
    public String login(){
        System.out.println("我进来过啊");
        return "login";
    }

}
