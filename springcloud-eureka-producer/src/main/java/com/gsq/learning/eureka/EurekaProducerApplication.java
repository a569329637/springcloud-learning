package com.gsq.learning.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author guishangquan
 * @date 2018/9/5
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerApplication.class, args);
    }
}
