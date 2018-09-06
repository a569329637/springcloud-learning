package com.gsq.learning.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author guishangquan
 * @date 2018/9/6
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
// 开启仪表盘，相当于开启 http://localhost:2223/hystrix
@EnableHystrixDashboard
// 开启断路器功能，相当于开启 http://localhost:2223/hystrix.stream
@EnableCircuitBreaker
public class EurekaConsumerHystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerHystrixDashboardApplication.class, args);
    }
}
