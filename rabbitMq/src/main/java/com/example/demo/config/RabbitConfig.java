package com.example.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jcb
 * @version : RabbitConfig, v 0.1 2019/6/6 10:22 jcb Exp$
 * @Description: 消息队列配置
 */
@Configuration
public class RabbitConfig {

    //queue

    @Bean
    public Queue helloQueue() {
        return  new Queue("hello");
    }

    @Bean
    public Queue topicMessage() {
        return new Queue("topic.message");
    }

    @Bean
    public Queue fanoutQueue() {
        return new Queue("fanout.A");
    }


    //exchange

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }
    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    //bind

    //绑定单个topicExchange
    @Bean
    Binding bindingExchangeMessage(Queue topicMessage, TopicExchange exchange) {
        return BindingBuilder.bind(topicMessage).to(exchange).with("topic.message");
    }

    //绑定多个topicExchange
    @Bean
    Binding bindingExchangeMessages(Queue topicMessage, TopicExchange exchange) {
        return BindingBuilder.bind(topicMessage).to(exchange).with("topic.#");
    }

    //绑定单个 fanoutExchange
    @Bean
    Binding bindingFanoutExchange(Queue fanoutQueue ,FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutQueue).to(fanoutExchange);
    }

}
