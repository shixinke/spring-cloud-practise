package com.github.shixinke.spring.cloud.itemeurekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ItemEurekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(ItemEurekaServer2Application.class, args);
    }

}

