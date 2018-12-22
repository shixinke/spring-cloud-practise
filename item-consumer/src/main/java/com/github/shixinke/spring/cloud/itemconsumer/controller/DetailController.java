package com.github.shixinke.spring.cloud.itemconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class DetailController {

    @RequestMapping("/detail")
    public String detail() {
        return "detail";
    }
}
