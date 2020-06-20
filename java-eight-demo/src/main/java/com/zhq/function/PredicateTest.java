package com.zhq.function;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest {

    @Test
    public void test1() {
        Predicate<Integer> objectPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer input) {
                return input > 5;
            }
        };
        Stream<Integer> integerStream = Stream.of(3, 6, 9);
        List<Integer> collect = integerStream.filter(objectPredicate).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void test2() {
        Stream<Integer> integerStream = Stream.of(3, 6, 9);
        List<Integer> collect = integerStream.filter(new NumPredicate()).collect(Collectors.toList());
        System.out.println(collect);
        collect.forEach(System.out::println);
    }







}
