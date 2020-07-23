package com.study.dubbo.controller;

import com.study.dubbo.consumer.CallService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CallController {

    @Resource
    private CallService callService;

    @GetMapping("/{name}/call")
    public String call(@PathVariable String name){
        return callService.sayHello(name);
    }
}
