package com.gsq.learning.eureka.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author guishangquan
 * @date 2018/9/12
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello() {
        return restTemplate.getForEntity("http://spring-cloud-eureka-producer/hello?name={1}", String.class, "hystrix").getBody();
    }

    public String helloFallback() {
        return "error";
    }
}
