package com.example.demo.Controller;

import com.example.demo.sender.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jcb
 * @version : RabbitController, v 0.1 2019/6/6 10:41 jcb Exp$
 * @Description:
 */
@RestController
@RequestMapping("/rabbit")
public class RabbitController {

    @Autowired
    HelloSender helloSender;

    @RequestMapping("/hello")
    public Object helloRabbit(String message){

        helloSender.sendHello(message);

        return "success";
    }
}
