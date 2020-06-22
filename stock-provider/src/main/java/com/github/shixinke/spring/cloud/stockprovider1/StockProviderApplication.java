package com.github.shixinke.spring.cloud.stockprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 库存服务提供者
 * @author shixinke
 */
@SpringBootApplication
@EnableEurekaClient
public class StockProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockProviderApplication.class, args);
    }

}

