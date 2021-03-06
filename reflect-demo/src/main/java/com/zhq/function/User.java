package com.zhq.function;

import java.lang.reflect.Method;

/**
 * @program: reflect-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-22 23:19
 **/
public class User {

    private int age;
    private String name;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Method[] declaredMethods = User.class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
}
