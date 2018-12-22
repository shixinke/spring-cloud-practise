package com.github.shixinke.spring.cloud.itemeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ItemEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemEurekaApplication.class, args);
    }

}

