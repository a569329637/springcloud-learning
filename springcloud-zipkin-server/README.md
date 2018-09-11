## zipkin

### 测试
> * 依次启动 springcloud-eureka、springcloud-eureka-producer、springcloud-zuul、springcloud-zipkin-server
> * 依次：`http://localhost:4444/spring-cloud-eureka-producer/hello?name=xxx&token=yy`
> * 依次：`http://localhost:2222/hello?name=xxx`
> * 访问：`http://localhost:4445`
