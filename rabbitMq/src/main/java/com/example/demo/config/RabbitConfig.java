package com.example.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jcb
 * @version : RabbitConfig, v 0.1 2019/6/6 10:22 jcb Exp$
 * @Description: 消息队列配置
 */
@Configuration
public class RabbitConfig {


    @Bean
    public Queue helloQueue() {
        return  new Queue("hello");
    }
}
