package com.zhq.threadlocal;

/**
 * @author ZHQ
 * @date 2021/1/22
 */
public class ThreadLocalTest2 {

    private static ThreadLocal<String> local = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        local.set("hello world");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread get " + local.get());
            }
        });

        thread.start();
        System.out.println("main get " + local.get());

    }
}
