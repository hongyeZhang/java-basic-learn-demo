package com.zhq.common.demo.wait;

/**
 * @author ZHQ
 * @date 2021/1/22
 */
public class InterruptTest2 {

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {

                }
            }
        });

        threadOne.start();
        threadOne.interrupt();

        System.out.println("is interrupted : " + threadOne.isInterrupted());
        System.out.println("is interrupted : " + Thread.interrupted());
        System.out.println("is interrupted : " + threadOne.isInterrupted());
    }
}
