package com.zhq.common.demo.stream;

import java.util.stream.Stream;

/**
 * @author : ZHQ
 * @date : 2019/12/3
 */
public class ReduceTest {
    public static void main(String[] args) {
        test1();

    }

    public static void test1() {
        Integer reduce = Stream.of(1, 2, 3, 4).reduce(10, (count, item) -> {
            System.out.println("count = " + count);
            System.out.println("item = " + item);
            return count + item;
        });
        System.out.println(reduce);
    }
}
