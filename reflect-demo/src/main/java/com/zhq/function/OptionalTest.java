package com.zhq.function;

import java.util.Optional;

/**
 * @program: reflect-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-22 23:15
 **/
public class OptionalTest {

    public static void main(String[] args) {
        test1();

    }


    public static void test1() {
        Optional<User> user = Optional.empty();
        System.out.println(user.get());

    }

}
