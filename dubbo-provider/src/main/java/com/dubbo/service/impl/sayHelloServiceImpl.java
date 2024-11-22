package com.dubbo.service.impl;

import com.dubbo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author: CCL
 * @description
 * @date: 2024/7/17 8:41
 */
@DubboService
public class sayHelloServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
