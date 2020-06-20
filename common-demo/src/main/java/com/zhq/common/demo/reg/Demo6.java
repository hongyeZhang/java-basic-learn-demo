package com.zhq.common.demo.reg;

public class Demo6 {
    private static void p(Object o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        /**
         * ^	The beginning of a line 一个字符串的开始
         * $	The end of a line       字符串的结束
         * \b	A word boundary         一个单词的边界, 可以是空格, 换行符等
         */
        p("hello sir".matches("^h.*"));
        p("hello sir".matches(".*r$"));
        p("hello sir".matches("^h[a-z]{1,3}o\\b.*"));
        p("hellosir".matches("^h[a-z]{1,3}o\\b.*"));
    }
}

