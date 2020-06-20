package com.zhq.common.demo.reg;

public class Demo3 {
    /**
     * 为了省略每次写打印语句, 这里把输出语句封装起来
     * @param o
     */
    private static void p(Object o){
        System.out.println(o);
    }

    /**
     * .	Any character (may or may not match line terminators), 任意字符
     * X?	X, once or not at all       零个或一个
     * X*	X, zero or more times       零个或多个
     * X+	X, one or more times        一个或多个
     * X{n}	X, exactly n times          x出现n次
     * X{n,}	X, at least n times     x出现至少n次
     * X{n,m}	X, at least n but not more than m times 出现n~m次
     * @param args
     */
    public static void main(String[] args) {
        p("a".matches("."));
        p("aa".matches("aa"));
        p("aaaa".matches("a*"));
        p("aaaa".matches("a+"));
        p("".matches("a*"));
        p("a".matches("a?"));

        // \d	A digit: [0-9], 表示数字, 但是在java中对"\"这个符号需要使用\进行转义, 所以出现\\d
        p("2345".matches("\\d{2,5}"));
        // \\.用于匹配"."
        p("192.168.0.123".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
        // [0-2]指必须是0~2中的一个数字
        p("192".matches("[0-2][0-9][0-9]"));
    }
}
//输出结果
//全为true

