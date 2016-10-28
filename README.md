# dubbo-demo

#### 运行zookeeper集群和dubbo-admin
    docker-compose up -d

    # 默认zookeeper集群映射至宿主机端口:
        2181, 2182, 2183

    # 默认dubbo-admin映射至宿主机端口:
        8080

#### 导入Maven项目
    # 编译
    mvn clean install -Dmaven.test.skip
    
    # eclipse IDE
    mvn eclipse:eclipse
    
    # IntelliJ IDE
    mvn idea:idea
    
#### 运行 Provider 和 Consumer
    Provider Main Class: 
        dubbo-demo-provider/src/test/java/org/dubbo/demo/service/impl/ProviderBootstrap.java
        
    Consumer Main Class:
        dubbo-demo-consumer/src/test/java/org/dubbo/demo/service/ConsumerBootstrap.java
    
