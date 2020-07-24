package com.study.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.dubbo.api.DemoService;

@Service(group = "super-group")
public class SuperDemoServiceImpl implements DemoService {

    @Override
    public String sayHi(String name) {
        return "hi vip user : " + name;
    }
}
