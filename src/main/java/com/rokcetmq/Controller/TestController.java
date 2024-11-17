package com.rokcetmq.Controller;

import jakarta.annotation.Resource;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("send")
    public String send() {
        rocketMQTemplate.convertAndSend("my-topic2", "hello rocketmq!");
        return "success";
    }
}
