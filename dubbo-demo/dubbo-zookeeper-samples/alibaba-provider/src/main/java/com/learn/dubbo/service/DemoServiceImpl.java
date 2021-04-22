package com.learn.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;
import com.learn.dubbo.api.service.DemoService;

@Service(
        version = "1.0.0",
        loadbalance = RoundRobinLoadBalance.NAME

)
public class DemoServiceImpl implements DemoService {

    public String sayHello(String data) {
        return "it is alibaba privider,\t" + data;
    }
}
