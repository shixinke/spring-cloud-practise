package com.github.shixinke.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka注册中心server
 * @author shixinke
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAppMain {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerAppMain.class, args);
	}

}

