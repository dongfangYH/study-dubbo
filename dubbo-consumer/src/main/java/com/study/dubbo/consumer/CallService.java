package com.study.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.study.dubbo.api.DemoService;
import org.springframework.stereotype.Component;

@Component
public class CallService {

    @Reference
    private DemoService demoService;

    public String sayHello(String name){
        return demoService.sayHi(name);
    }
}
