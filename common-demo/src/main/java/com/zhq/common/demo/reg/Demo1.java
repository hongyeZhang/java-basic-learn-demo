package com.zhq.common.demo.reg;

public class Demo1 {
    public static void main(String[] args) {
        boolean matches = "abc".matches("...");
        System.out.println(matches);

        boolean matches1 = "abcd".matches("...");
        System.out.println(matches1);


    }
}
