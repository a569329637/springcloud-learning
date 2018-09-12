package com.gsq.learning.eureka.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guishangquan
 * @date 2018/9/6
 */
// 在 FeignClient 使用 Hystrix 了, fallback 指定熔断后处理类
@FeignClient(name = "spring-cloud-eureka-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
