package countDownLatch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ZHQ
 * @date 2021/2/7
 */
public class CyclicBarrierTest {

    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
        @Override
        public void run() {
            System.out.println("task merge result");
        }
    });


    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread-1 enter await");
                try {
                    cyclicBarrier.await();
                    System.out.println("thread-1 exit await");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });


        service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread-2 enter await");
                try {
                    cyclicBarrier.await();
                    System.out.println("thread-2 exit await");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        service.shutdown();
    }
}
