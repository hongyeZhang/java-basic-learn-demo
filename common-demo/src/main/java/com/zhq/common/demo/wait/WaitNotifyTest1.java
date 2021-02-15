package com.zhq.common.demo.wait;

/**
 * @author ZHQ
 */
public class WaitNotifyTest1 {


    public static Object obj = new Object();

    public static void main(String[] args) throws Exception {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println("begin wait");
                    synchronized (obj) {
                        obj.wait();
                        System.out.println("end wait");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        Thread.sleep(2000);

        System.out.println("begin interrupt");
        thread1.interrupt();
        System.out.println("end interrupt");
    }

}
