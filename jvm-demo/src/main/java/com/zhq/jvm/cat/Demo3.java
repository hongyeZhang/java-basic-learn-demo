package com.zhq.jvm.cat;

/**
 * @author : ZHQ
 * @date : 2020/3/9
 */
public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(3000);
        while (true) {
            loadData();
        }

    }


    private static void loadData() throws InterruptedException {
        byte[] data = null;
        for (int i = 0; i < 50; ++i) {
            data = new byte[100 * 1024];
        }
        data = null;

        Thread.sleep(1000);
    }

}
