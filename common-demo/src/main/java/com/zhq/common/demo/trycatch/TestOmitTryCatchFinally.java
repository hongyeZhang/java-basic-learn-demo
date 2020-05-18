package com.zhq.common.demo.trycatch;

/**
 * @author : ZHQ
 * @date : 2020/1/12
 */
public class TestOmitTryCatchFinally {

    public static void main(String[] args) {
//        omitFinally();
//        omitCatch();

        System.out.println(testReturn());
    }

    /**
     * 省略finally 语句块
     */
    public static void omitFinally() {
        try {
            int i = 0;
            i += 1;
            System.out.println(i);
        } catch (Exception e) {
        }
    }

    /**
     * 省略 catch 语句块
     */
    public static void omitCatch() {
        int i = 0;
        try {
            i += 1;
        } finally {
            i = 10;
        }
        System.out.println(i);
    }

    public static int testReturn() {

        int i = 0;

        try {
            i = 5;
            throw new RuntimeException("error");
        } catch (Exception e) {
            System.out.println("enter catch ...");
            System.out.println("catch i = " + i);
            return i;
        } finally {
            System.out.println("enter finally ...");
            i = 10;
            System.out.println("finally i = " + i);
        }
    }

}
