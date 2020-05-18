package com.zhq.common.demo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : ZHQ
 * @date : 2020/1/7
 */
public class CollectionsTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            list.add(i);
        }

//        Collections.reverse(list);

//        test1();
//        test2();
        test3();



    }

    public static void test1() {
        List list1 = Arrays.asList("one two three four five".split(" "));
        List list2 = Arrays.asList("一 二 三 四 五".split(" "));
        Collections.copy(list1, list2);
        System.out.println(list1);
    }

    public static void test2() {
        List list1 = Arrays.asList("one two three four five".split(" "));
        Collections.rotate(list1, 2);
        System.out.println(list1);
    }

    public static void test3() {
        List list = Arrays.asList("one two three four five".split(" "));
        List subList=Arrays.asList("three four five".split(" "));
        System.out.println(Collections.indexOfSubList(list,subList));
    }

}
