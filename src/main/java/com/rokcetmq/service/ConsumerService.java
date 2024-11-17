package com.rokcetmq.service;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RocketMQMessageListener(topic = "my-topic", consumerGroup = "my-consumer_group")
public class ConsumerService implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("收到消息: " + s);
    }
}
