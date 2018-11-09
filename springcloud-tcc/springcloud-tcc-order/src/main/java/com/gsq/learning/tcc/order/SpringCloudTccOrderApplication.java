package com.gsq.learning.tcc.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;



/**
 * @author guishangquan
 * @date 2018/11/8
 */
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
@EnableTransactionManagement
@MapperScan("com.gsq.learning.tcc.order.mapper")
public class SpringCloudTccOrderApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SpringCloudTccOrderApplication.class, args);
    }
}
