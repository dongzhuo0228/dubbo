package com.example.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbointerface.inter.IHello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xx")
public class TestController {
    @Reference
    private IHello iHello;

    @RequestMapping("/hello")
    public String hello() {
        String hello = iHello.sayHello("world");
        System.out.println(iHello.sayHello("SnailClimb"));
        return hello;
    }


}
