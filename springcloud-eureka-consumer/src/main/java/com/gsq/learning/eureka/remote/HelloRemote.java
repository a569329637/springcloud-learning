package com.gsq.learning.eureka.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guishangquan
 * @date 2018/9/5
 */
// name:远程服务名，及spring.application.name配置的名称
@FeignClient(name = "spring-cloud-eureka-producer")
public interface HelloRemote {

    // 此类中的方法和远程服务中contoller中的方法名和参数需保持一致
    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
