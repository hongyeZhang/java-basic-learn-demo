package com.zhq.common.demo.wait;

/**
 * @author ZHQ
 */
public class WaitNotifyTest2 {


    public static Object resource = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    synchronize (resource) {
                        System.out.println("threadA get resource and begin wait");
                        resource.wait();
                        System.out.println("threadA end wait");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    synchronize (resource) {
                        System.out.println("threadB get resource and begin wait");
                        resource.wait();
                        System.out.println("threadB end wait");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    synchronize (resource) {
                        System.out.println("threadC get resource and begin notify");
                        resource.notifyAll();
                        System.out.println("threadC end notify");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        threadA.start();
        threadB.start();

        Thread.sleep(2000);

        threadC.start();

        threadA.join();
        threadB.join();
        threadC.join();

        System.out.println("main over");
    }
}
