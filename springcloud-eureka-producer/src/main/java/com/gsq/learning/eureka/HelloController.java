package com.gsq.learning.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guishangquan
 * @date 2018/9/5
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(@RequestParam String name) {
        return "hello " + name + "，this is first messge";
    }
}
