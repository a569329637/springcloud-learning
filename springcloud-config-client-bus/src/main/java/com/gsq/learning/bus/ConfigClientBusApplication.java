package com.gsq.learning.bus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guishangquan
 * @date 2018/9/6
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientBusApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientBusApplication.class, args);
    }

    @Value("${app.hello}")
    private String hello;

    @GetMapping("/hello")
    public String from() {
        return hello;
    }
}
