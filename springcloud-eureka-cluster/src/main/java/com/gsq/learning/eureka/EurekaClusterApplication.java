package com.gsq.learning.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author guishangquan
 * @date 2018/9/5
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaClusterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterApplication.class, args);
    }
}
