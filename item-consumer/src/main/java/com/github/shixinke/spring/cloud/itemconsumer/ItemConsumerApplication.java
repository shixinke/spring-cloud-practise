package com.github.shixinke.spring.cloud.itemconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ItemConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemConsumerApplication.class, args);
    }

}

