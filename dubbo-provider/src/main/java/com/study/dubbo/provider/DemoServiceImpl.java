package com.study.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.dubbo.api.DemoService;

@Service(group = "normal-group")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHi(String name) {
        return "hello " + name;
    }
}
