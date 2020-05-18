package com.zhq.picture.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ZHQ
 * @date : 2019/12/2
 */
@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping(value = "/log/test1")
    public String test1() {
        String str1 = "hello";
        float str2 = 0.5f;
        logger.info("param1 = {}, param2 = {}", str1, str2);

        return "success";

    }
}
