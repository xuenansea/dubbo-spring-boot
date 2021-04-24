package com.learn.dubbo.service;

import com.learn.dubbo.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;

@DubboService(
        version = "1.0.0",
//        protocol = "rmi",//多协议方式暴露服务 {"rmi","dubbo","hessian"}
        loadbalance = RoundRobinLoadBalance.NAME
)
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String data) {
        return null;
    }
}
