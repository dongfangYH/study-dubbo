package com.study.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.study.dubbo.api.DemoService;
import org.springframework.stereotype.Component;

@Component
public class CallService {

    @Reference(check = false, group = "normal-group")
    private DemoService demoService;

    @Reference(check = false, group = "super-group")
    private DemoService superDemoService;

    public String sayHello(String name){
        return demoService.sayHi(name);
    }

    public String sayHiToVip(String name) {
        return superDemoService.sayHi(name);
    }
}
