package lock;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.Condition;

/**
 * @author ZHQ
 * @date 2021/1/27
 */
public class ProducerConsumerExample {

    private static final NoReentrantLock LOCK = new NoReentrantLock();
    private static final Condition NOT_FULL = LOCK.newCondition();
    private static final Condition NOT_EMPTY = LOCK.newCondition();
    private static final Queue<String> QUEUE = new LinkedBlockingDeque<>();
    private static final int SIZE = 10;
    private static volatile boolean runFlag = true;

    public static void main(String[] args) {
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    LOCK.lock();
                    try {
                        while (QUEUE.size() == SIZE) {
                            NOT_FULL.await();
                        }
                        QUEUE.add("hello");
                        System.out.println("producer add element to queue : hello");
                        NOT_EMPTY.signalAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        LOCK.unlock();
                    }
                }
            }
        });


        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (runFlag) {
                    LOCK.lock();
                    try {
                        while (QUEUE.size() == 0) {
                            NOT_EMPTY.await();
                        }
                        String poll = QUEUE.poll();
                        System.out.println("consumer poll element from queue : " + poll);
                        NOT_FULL.signalAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        LOCK.unlock();
                    }
                }
            }
        });

        producer.start();
        consumer.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        runFlag = false;
        try {
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("demo over");
    }
}
