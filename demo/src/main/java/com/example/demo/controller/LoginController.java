package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jcb
 * @version : LoginController, v 0.1 2019/6/4 16:17 jcb Exp$
 * @Description:
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
    public Object login(){
        System.out.println("login com.example.tkmapper.controller");
        return "login.html";
    }
}
