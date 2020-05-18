package multiThread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: interview-test-demo
 * @description: 三个线程顺序打印ABC10次，通过 AtomicInteger 做线程之间的通信
 * @author: ZHQ
 * @create: 2019-08-08 23:12
 **/
public class CyclicPrintTest2 extends Thread {
    private AtomicInteger syn;
    private String name;
    private int flag;

    private int count;

    public CyclicPrintTest2(AtomicInteger syn, String name, int flag) {
        this.syn = syn;
        this.name = name;
        this.flag = flag;
    }

    @Override
    public void run() {
        count = 0;
        while (true) {
            synchronized (syn) {
                if (syn.get() % 3 == flag) {
                    syn.set(syn.get() + 1);
                    System.out.println(name);
                    count++;
                    syn.notifyAll();
                    if (count == 10) {
                        break;
                    } else {
                        try {
                            syn.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(0);
        CyclicPrintTest2 thread1 = new CyclicPrintTest2(integer, "A", 0);
        CyclicPrintTest2 thread2 = new CyclicPrintTest2(integer, "B", 1);
        CyclicPrintTest2 thread3 = new CyclicPrintTest2(integer, "c", 2);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
