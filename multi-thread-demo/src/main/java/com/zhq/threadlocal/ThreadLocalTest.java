package com.zhq.threadlocal;

/**
 * @author ZHQ
 * @date 2021/1/22
 */
public class ThreadLocalTest {

    private static ThreadLocal<String> local = new ThreadLocal<>();

    public static void print(String str) {
        System.out.println(str + " : " + local.get());
        local.remove();
    }


    public static void main(String[] args) {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                local.set("threadA value");
                print("threadA");
                System.out.println("threadA " + local.get());
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                local.set("threadB value");
                print("threadB");
                System.out.println("threadB " + local.get());
            }
        });

        threadA.start();
        threadB.start();
    }
}
