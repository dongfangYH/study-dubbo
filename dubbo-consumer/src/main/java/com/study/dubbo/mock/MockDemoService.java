package com.study.dubbo.mock;

import com.study.dubbo.api.DemoService;

public class MockDemoService implements DemoService {
    @Override
    public String sayHi(String name) {
        return "hi mock user.";
    }
}
