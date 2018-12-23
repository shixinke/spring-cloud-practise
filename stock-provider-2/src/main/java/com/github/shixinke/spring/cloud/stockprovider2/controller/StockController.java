package com.github.shixinke.spring.cloud.stockprovider2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/query")
    public int queryStock() {
        return 100;
    }
}
