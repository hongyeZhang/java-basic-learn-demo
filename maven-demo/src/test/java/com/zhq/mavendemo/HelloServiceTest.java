package com.zhq.mavendemo;

import org.junit.Assert;
import org.junit.Test;

public class HelloServiceTest {
    HelloService helloService = new HelloService();

    @Test
    public void testService1() throws Exception {
        String result = helloService.service1();
        Assert.assertEquals("service1", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme