package com.example.demo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jcb
 * @version : HelloSender, v 0.1 2019/6/6 10:28 jcb Exp$
 * @Description:
 */
@Component
public class HelloSender {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void sendHello(String message){
        amqpTemplate.convertAndSend("hello",message);
    }

}
