package com.study.dubbo.filter;

import com.alibaba.dubbo.rpc.*;

public class LogFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("invoke before : "  + invocation.getMethodName());
        Result result = invoker.invoke(invocation);
        System.out.println("invoke after : "  + invocation.getMethodName());
        return result;
    }
}
