package com.example.demo.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author jcb
 * @version : HelloReceive, v 0.1 2019/6/6 10:39 jcb Exp$
 * @Description:
 */
@Component
@RabbitListener(queues= {"hello"})
public class HelloReceive {

    @RabbitHandler
    public  void helloProcess(String message){
        System.out.println(message);
    }
}
