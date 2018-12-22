# spring-cloud-practise

spring cloud　新手实战指南

#### 一、目录说明

#### 二、运行

##### 1.下载源码

```bash
git clone https://github.com/shixinke/spring-cloud-practise.git
cd spring-cloud-practise
```

##### 2.运行注册中心 item-eureka

###### (1)运行 Eureka Server 

```bash
cd item-eureka
mvn package
cd target
java -jar item-eureka-0.0.1-SNAPSHOT.jar 
```

或者通过idea导入项目，在idea中运行

###### (2)在浏览器中查看注册中心信息

在浏览器中输入：http://localhost:8001


