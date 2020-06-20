package com.zhq.common.demo.reg;

public class Demo5 {
    private static void p(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        /**
         * \d	A digit: [0-9]          数字
         * \D	A non-digit: [^0-9]     非数字
         * \s	A whitespace character: [ \t\n\x0B\f\r] 空格
         * \S	A non-whitespace character: [^\s]       非空格
         * \w	A word character: [a-zA-Z_0-9]          数字字母和下划线
         * \W	A non-word character: [^\w]             非数字字母和下划线
         */
        // \\s{4}表示4个空白符
        p(" \n\r\t".matches("\\s{4}"));
        // \\S表示非空白符
        p("a".matches("\\S"));
        // \\w{3}表示数字字母和下划线
        p("a_8".matches("\\w{3}"));
        p("abc888&^%".matches("[a-z]{1,3}\\d+[%^&*]+"));
        // 匹配 \
        p("\\".matches("\\\\"));
    }
}

