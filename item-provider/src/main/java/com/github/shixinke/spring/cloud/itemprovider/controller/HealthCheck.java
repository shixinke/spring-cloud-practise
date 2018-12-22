package com.github.shixinke.spring.cloud.itemprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheck {

    @Value("${server.port}")
    private int serverPort;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/check")
    public String check() {
        return String.format("Server running on port:%d, application name is %s", serverPort, appName);
    }
}
