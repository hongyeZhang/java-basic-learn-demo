package com.zhq.powermockdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: powermock-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-07-30 16:16
 **/
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
