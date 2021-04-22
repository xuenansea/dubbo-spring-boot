package com.learn.dubbo.servie;

import com.learn.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;

@DubboService(
        version = "1.0.0",
        loadbalance = RoundRobinLoadBalance.NAME
)
public class DemoServiceImpl implements DemoService {

    public String sayHello(String data) {
        return "it is apache provider, " + data;
    }
}
