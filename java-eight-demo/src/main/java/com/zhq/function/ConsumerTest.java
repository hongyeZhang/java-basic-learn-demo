package com.zhq.function;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest {

    @Test
    public void test1() {
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Stream<String> aa = Stream.of("aa", "bb", "cc");
        aa.forEach(stringConsumer);
    }

    @Test
    public void test2() {
        Consumer<String> stringConsumer = (s) -> {
            System.out.println(s);
        };

        Stream<String> aa = Stream.of("aa", "bb", "cc");
        aa.forEach(stringConsumer);
    }

    @Test
    public void test3() {
        Consumer<String> stringConsumer = System.out::println;
        Stream<String> aa = Stream.of("aa", "bb", "cc");
        aa.forEach(stringConsumer);
    }
}
