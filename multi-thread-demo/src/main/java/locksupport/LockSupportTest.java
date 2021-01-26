package locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @author ZHQ
 * @date 2021/1/26
 */
public class LockSupportTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("child thread begin park");
                LockSupport.park();
                System.out.println("child thread end park");
            }
        });

        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread begin unpark child thread");
        LockSupport.unpark(thread);

    }
}
