package com.gsq.learning.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author guishangquan
 * @date 2018/9/12
 */
@SpringBootApplication
// 注解来添加发现服务能力和注册能力
@EnableDiscoveryClient
@RestController
public class RibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    @Bean
    // 注解开启均衡负载能力
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return restTemplate.getForEntity("http://spring-cloud-eureka-producer/hello?name={1}", String.class, "ribbon").getBody();
    }
}
