## hystrix 熔断器

### 测试
> * 依次启动 springcloud-eureka、springcloud-producer、springcloud-consumer-hystrix
> * 浏览器访问：`http://localhost:2223/hello/a569329637`
> * 浏览器返回：`hello a569329637，this is first messge`
> * 手动停止掉 springcloud-producer 工程
> * 浏览器访问：`http://localhost:2223/hello/a569329637`
> * 浏览器返回：`hello a569329637, this message send failed`
