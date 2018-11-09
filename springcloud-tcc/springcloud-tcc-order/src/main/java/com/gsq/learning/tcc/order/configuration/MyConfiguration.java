package com.gsq.learning.tcc.order.configuration;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guishangquan
 * @date 2018/11/8
 */
@Configuration
public class MyConfiguration {

//    @Bean
//    @Scope("prototype")
//    public Feign.Builder feignBuilder() {
//        return Feign.builder()
//                .requestInterceptor(new HmilyRestTemplateInterceptor())
//                .invocationHandlerFactory(invocationHandlerFactory());
//    }
//
//    @Bean
//    public InvocationHandlerFactory invocationHandlerFactory() {
//        return (target, dispatch) -> {
//            HmilyFeignHandler handler = new HmilyFeignHandler();
//            //handler.setTarget(target);
//            handler.setHandlers(dispatch);
//            return handler;
//        };
//    }

    @Bean
    Request.Options feignOptions() {
        return new Request.Options(5000, 5000);
    }

    @Bean
    Retryer feignRetryer() {
        return Retryer.NEVER_RETRY;
    }
}
