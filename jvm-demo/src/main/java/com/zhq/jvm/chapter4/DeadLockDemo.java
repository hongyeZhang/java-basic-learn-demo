package com.zhq.jvm.chapter4;

/**
 * @author : ZHQ
 * @date : 2020/2/11
 */
public class DeadLockDemo {

    static class SynAddRunable implements Runnable {
        int a, b;

        public SynAddRunable(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronize (Integer.valueOf(a)) {
                synchronize (Integer.valueOf(b)) {
                    System.out.println(a + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            new Thread(new SynAddRunable(1, 2)).start();
            new Thread(new SynAddRunable(2, 1)).start();
        }
    }


}
