package com.zhq.common.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

    public static void main(String[] args) {
        test1();


    }

    public static void test1() {
        //[a-z]表示a~z之间的任何一个字符, {3}表示3个字符, 意思是匹配一个长度为3, 并且每个字符属于a~z的字符串
//        Pattern p = Pattern.compile("[a-z]{3}");
        Pattern p = Pattern.compile("[a-z]+");
        Matcher m = p.matcher("abc");
        System.out.println(m.matches());

    }

}
