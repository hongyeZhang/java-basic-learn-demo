package countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ZHQ
 * @date 2021/2/6
 */
public class CountDownLatchTest {

    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(1000);
                    System.out.println("thread-1 sleep over");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            }
        });


        service.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                    System.out.println("thread-2 sleep over");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            }
        });

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
        System.out.println("main thread over");



    }
}
