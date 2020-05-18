package com.zhq.picture.demo.test;

import java.lang.reflect.Field;

/**
 * @author : ZHQ
 * @date : 2019/11/28
 */
public class TempTest {
    public static void main(String[] args) {
        String str = "orders[0].items[0].name";

        Field[] declaredFields = Person.class.getDeclaredFields();
        System.out.println(declaredFields.length);


    }

}
