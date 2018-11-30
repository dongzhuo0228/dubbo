package com.example.dubboprovider1.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbointerface1.IHello;
import org.springframework.stereotype.Component;

@Service
@Component
public class HelloImpl implements IHello {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
