package com.study.dubbo.stub;

import com.study.dubbo.api.DemoService;

public class DemoVipStubService implements DemoService {

    private final DemoService demoService;

    public DemoVipStubService(DemoService demoService) {
        this.demoService = demoService;
    }

    @Override
    public String sayHi(String name) {
        return "{" + demoService.sayHi(name) + "}";
    }
}
