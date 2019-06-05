package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.serivce.MybatisUserService;
import com.example.demo.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jcb
 * @version : UserController, v 0.1 2019/5/30 16:57 jcb Exp$
 * @Description:
 */
@RestController
@RequestMapping("/mybatisUser")
public class MybatisUserController {

    @Autowired
    MybatisUserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object addUser(@RequestBody User user){

        return userService.add(user);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Object updateUser(@RequestBody User user){

        return userService.update(user);
    }

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Object updateUser(long id){
        return userService.getById(id);
    }

}
