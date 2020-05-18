package com.zhq.powermockdemo.test;

/**
 * @program: powermock-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-07-30 17:14
 **/
public class PrivateObject {
    private String name() {
        System.out.println("enter private method");
        return "test";
    }

    public String name2() {
        System.out.println("enter public method");
        return name();
    }
}
