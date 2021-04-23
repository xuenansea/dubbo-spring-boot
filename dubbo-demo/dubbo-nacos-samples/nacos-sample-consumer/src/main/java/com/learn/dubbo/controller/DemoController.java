package com.learn.dubbo.controller;

import com.learn.dubbo.api.service.DemoService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("dubbo")
public class DemoController {


    @DubboReference(
            version = "1.0.0",
            loadbalance = RoundRobinLoadBalance.NAME
    )
    private DemoService demoService;

    @GetMapping("hello/{data}")
    public String sayHello(@PathVariable(value = "data") String data) {
        return demoService.sayHello(data + "\t" + DateFormatUtils.format(new Date(), "HH:mm:ss"));
    }
}
