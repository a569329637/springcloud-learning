package com.gsq.learning.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author guishangquan
 * @date 2018/9/7
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    @Bean
    public TokenFilter getTokenFilter() {
        return new TokenFilter();
    }

    @Bean
    public ProducerFallback getProducerFallback() {
        return new ProducerFallback();
    }
}
