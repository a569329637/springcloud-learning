## config server

### 测试
> * 启动 springcloud-config-server
> * 访问 http://localhost:3333/config-dev.properties
> * 访问 http://localhost:3333/config-dev.yml
> * 访问 http://localhost:3333/config/dev

### 规则
仓库中的配置文件会被转换成web接口，访问可以参照以下的规则：

 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 
以config-dev.properties为例子，它的application是config，profile是dev。client会根据填写的参数来选择读取对应的配置。