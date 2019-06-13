package com.example.tkmapper.controller;

import com.example.tkmapper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jcb
 * @version : UserController, v 0.1 2019/6/11 14:52 jcb Exp$
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public Object getUser(Long id){
        return userService.getUser(id);
    }


    @GetMapping("/getUserList")
    public Object getUserList(int pageNum,int pageSize){
        return userService.getUserList(pageNum,pageSize);
    }


    @GetMapping("/getByEntity")
    public Object getByEntity(String name){
        return userService.getByEntity(name);
    }


    @GetMapping("/getUserListByExample")
    public Object getUserListByExample(String name,int age){
        return userService.getByExample(name,age);
    }
}
