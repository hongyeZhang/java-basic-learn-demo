package countDownLatch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ZHQ
 * @date 2021/2/7
 */
public class CyclicBarrierTest2 {


    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);


    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("thread-1 step 1");
                    cyclicBarrier.await();
                    System.out.println("thread-1 step 2");
                    cyclicBarrier.await();
                    System.out.println("thread-1 step 3");
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
                try {
                    System.out.println("thread-2 step 1");
                    cyclicBarrier.await();
                    System.out.println("thread-2 step 2");
                    cyclicBarrier.await();
                    System.out.println("thread-2 step 3");
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
