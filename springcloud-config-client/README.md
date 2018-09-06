## config client

### 启动
> * 依次启动 springcloud-config-server、springcloud-config-client
> * 访问 http://localhost:3334/hello

### 开启更新机制
> * 当配置文件修改后，执行 curl -X POST localhost:3334/refresh
> * 访问 http://localhost:3334/hello
> * 发现配置已经修改
