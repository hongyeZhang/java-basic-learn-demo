package com.zhq.mavendemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: maven-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-09-05 15:52
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/maven/hello1")
    public String hello1() {
        String str = helloService.service1();
        System.out.println(str);
        return "success";
    }
}
