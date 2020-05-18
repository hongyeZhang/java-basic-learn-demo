package com.zhq.httpdemo.controller;

import com.zhq.httpdemo.dto.LombokDto1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: http-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-09-11 21:12
 **/
@Slf4j
@RestController
public class HelloController {

    @RequestMapping(value = "/hello1")
    public ResponseEntity<String> hello1() {
        return ResponseEntity.ok("hello1");
    }

    @RequestMapping(value = "/hello2")
    public String hello2() {
        log.info("received hello2 request");
        LombokDto1 dto1 = new LombokDto1();
        dto1.setName("hello2");

        return dto1.getName();
    }


}
