package com.github.shixinke.spring.cloud.stockprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(StockProvider2Application.class, args);
    }

}

