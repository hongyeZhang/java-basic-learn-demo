package com.zhq.common.demo.collection;

import java.util.*;

/**
 * @author : ZHQ
 * @date : 2020/1/7
 */
public class HashMapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>(4);
        map.put("a3", "aa");
        map.put("a2", "bb");
        map.put("b1", "cc");

        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("-----------");


    }
}
