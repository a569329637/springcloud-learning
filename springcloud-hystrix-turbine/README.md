## turbine

### 测试
> * 依次启动 springcloud-eureka、springcloud-eureka-consumer-hystrix-dashboard、springcloud-hystrix-tuibine-node、springcloud-hystrix-turbine
> * 依次访问：`http://localhost:2223/hello/a569329637`、`http://localhost:2225/hello/a569329637`
> * 访问：`http://localhost:2224/hystrix`
> * 依次输入：`http://localhost:2224/turbine.stream`、`2000`、`TurbineMonitor`
> * 点击 `Monitor Stream` 按钮
