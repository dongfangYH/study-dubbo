package com.study.dubbo.stub;

import com.study.dubbo.api.DemoService;

/**
 * stub， 传入远程服务代理，可在客户端执行部分逻辑
 */
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
