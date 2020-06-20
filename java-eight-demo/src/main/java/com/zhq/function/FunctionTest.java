package com.zhq.function;

import org.junit.Test;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionTest {

    @Test
    public void test1() {
        Function<String, Integer> stringIntegerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Stream<String> aaa = Stream.of("aaa", "bb", "cdef");
        List<Integer> collect = aaa.map(stringIntegerFunction).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

}
