package com.example.dubboconsumer1;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer1Application.class, args);
    }
}
