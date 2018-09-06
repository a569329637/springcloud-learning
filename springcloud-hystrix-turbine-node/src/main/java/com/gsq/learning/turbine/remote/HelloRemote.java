package com.gsq.learning.turbine.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guishangquan
 * @date 2018/9/6
 */
@FeignClient(name = "spring-cloud-eureka-producer2", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @GetMapping(value = "/hello")
    String hello2(@RequestParam(value = "name") String name);
}
