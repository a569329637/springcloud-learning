## hystrix dashboard

### 测试
> * 依次启动 springcloud-eureka、springcloud-eureka-consumer-hystrix-dashboard
> * 访问：`http://localhost:2223/hello/a569329637`
> * 访问：`http://localhost:2223/hystrix`
> * 依次输入：`http://localhost:2223/hystrix.stream`、`2000`、`HystrixMonitor`
> * 点击 `Monitor Stream` 按钮

### 参数
在监控的界面有两个重要的图形信息：一个实心圆和一条曲线。
> * 实心圆：
	1、通过颜色的变化代表了实例的健康程度，健康程度从绿色、黄色、橙色、红色递减。
	2、通过大小表示请求流量发生变化，流量越大该实心圆就越大。所以可以在大量的实例中快速发现故障实例和高压实例。
> * 曲线：用来记录2分钟内流量的相对变化，可以通过它来观察流量的上升和下降趋势。
> * 具体指标参考 
	https://www.cnblogs.com/happyflyingpig/p/8372485.html
	https://www.cnblogs.com/ityouknow/p/6889059.html
