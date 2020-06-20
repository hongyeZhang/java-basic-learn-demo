package com.zhq.common.demo.reg;

public class Demo4 {
    private static void p(Object o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        //[abc]指abc中的其中一个字母
        p("a".matches("[abc]"));
        //[^abc]指除了abc之外的字符
        p("1".matches("[^abc]"));
        //a~z或A~Z的字符, 以下三个均是或的写法
        p("A".matches("[a-zA-Z]"));
        p("A".matches("[a-z|A-Z]"));
        p("A".matches("[a-z[A-Z]]"));
        //[A-Z&&[REQ]]指A~Z中并且属于REQ其中之一的字符
//        p("R".matches("[A-Z&&[REQ]]"));
        p("R".matches("[REQ]"));
    }
}

