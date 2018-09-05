## eureka 集群

### Hosts 配置
```
127.0.0.1 peer1
127.0.0.1 peer2
127.0.0.1 peer3
```

### 打包
```
mvn clean package
```

### 启动
```
java -jar springcloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar springcloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
java -jar springcloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer3
```

### 访问
```
localhost:1111
localhost:1112
localhost:1113
```
