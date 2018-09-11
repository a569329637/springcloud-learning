package com.gsq.learning.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guishangquan
 * @date 2018/9/5
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("hello")
    public String hello(@RequestParam String name) {
        return "hello " + name + "，this is first message";
    }

    @GetMapping("zuul_hello")
    public String zuulHello(@RequestParam String name) {
        logger.info("request two name is "+name);
        try{
            Thread.sleep(1000000);
        }catch ( Exception e){
            logger.error(" hello two error", e);
        }
        return "hello "+name+"，this is two message";
    }
}
