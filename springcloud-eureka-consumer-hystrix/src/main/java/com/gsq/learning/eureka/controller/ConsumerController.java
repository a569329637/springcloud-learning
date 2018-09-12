package com.gsq.learning.eureka.controller;

import com.gsq.learning.eureka.remote.HelloRemote;
import com.gsq.learning.eureka.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guishangquan
 * @date 2018/9/6
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote helloRemote;

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

    @GetMapping("hello")
    public String hello() {
        return helloService.hello();
    }
}