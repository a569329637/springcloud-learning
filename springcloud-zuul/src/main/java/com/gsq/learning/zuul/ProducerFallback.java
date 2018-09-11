package com.gsq.learning.zuul;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Zuul 目前只支持服务级别的熔断，不支持具体到某个URL进行熔断
 *
 * @author guishangquan
 * @date 2018/9/11
 */
public class ProducerFallback implements ZuulFallbackProvider {

    // 告诉Zuul它是负责哪个route定义的熔断
    @Override
    public String getRoute() {
        return "spring-cloud-eureka-producer";
    }

    // fallbackResponse方法则是告诉 Zuul 断路出现时，它会提供一个什么返回值来处理请求。
    @Override
    public ClientHttpResponse fallbackResponse() {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 200;
            }

            @Override
            public String getStatusText() throws IOException {
                return "OK";
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("The service is unavailable.".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers;
            }
        };
    }
}
