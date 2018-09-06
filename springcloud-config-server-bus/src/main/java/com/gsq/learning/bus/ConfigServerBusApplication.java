package com.gsq.learning.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author guishangquan
 * @date 2018/9/6
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerBusApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBusApplication.class, args);
    }
}
