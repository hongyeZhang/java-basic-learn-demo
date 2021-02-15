package lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ZHQ
 * @date 2021/1/26
 */
public class ReentrantLockTest1 {

    private static final ReentrantLock LOCK = new ReentrantLock();
    private static final Condition CONDITION = LOCK.newCondition();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                LOCK.lock();
                try {
                    System.out.println("begin wait");
                    CONDITION.await();
                    System.out.println("end wait");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    LOCK.unlock();
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                LOCK.lock();
                try {
                    System.out.println("begin signal");
                    CONDITION.signal();
                    System.out.println("end signal");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    LOCK.unlock();
                }
            }
        });

        threadA.start();
        Thread.sleep(1000);
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("main over");
    }
}
