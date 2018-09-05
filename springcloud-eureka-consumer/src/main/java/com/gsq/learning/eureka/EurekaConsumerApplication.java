package com.gsq.learning.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author guishangquan
 * @date 2018/9/5
 */
@SpringBootApplication
// 启用服务注册与发现
@EnableDiscoveryClient
// 启用feign进行远程调用
@EnableFeignClients
public class EurekaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }
}
