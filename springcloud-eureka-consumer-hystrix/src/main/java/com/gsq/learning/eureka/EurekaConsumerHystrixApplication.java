package com.gsq.learning.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author guishangquan
 * @date 2018/9/6
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
// 开启断路器，HystrixCommand 生效
@EnableCircuitBreaker
public class EurekaConsumerHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerHystrixApplication.class, args);
    }

    @Bean
    // 注解开启均衡负载能力
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
