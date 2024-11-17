package com.rokcetmq.service;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(topic = "my-topic2", consumerGroup = "my-consumer_group")
public class ConsumerService2 implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("收到消息2: " + s);
    }
}
