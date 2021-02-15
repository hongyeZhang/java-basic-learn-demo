package countDownLatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author ZHQ
 * @date 2021/2/7
 */
public class SemohoreTest {

    private static Semaphore semaphore = new Semaphore(0);

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread-1 over");
                semaphore.release();
                System.out.println("thread-1 release over");
            }
        });

        service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread-2 over");
                semaphore.release();
                System.out.println("thread-2 release over");
            }
        });

        try {
            semaphore.acquire(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("all thread over");
        service.shutdown();

    }
}
