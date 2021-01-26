package com.zhq.common.demo.wait;

/**
 * @author ZHQ
 */
public class InterruptTest {


    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200_000);
                } catch (InterruptedException e) {
                    System.out.println("sleeping is interrupted, sleep over");
                }
            }
        });

        threadA.start();
        Thread.sleep(1000);

        threadA.interrupt();
        threadA.join();

        System.out.println("main over");
    }
}
