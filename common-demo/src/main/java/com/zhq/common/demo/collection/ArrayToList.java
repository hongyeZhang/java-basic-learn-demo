package com.zhq.common.demo.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : ZHQ
 * @date : 2020/1/7
 */
public class ArrayToList {
    public static void main(String[] args) {

        String[] str = new String[]{"hello", "world"};
        List<String> collect = Stream.of(str).collect(Collectors.toList());
        System.out.println(collect);


    }
}
