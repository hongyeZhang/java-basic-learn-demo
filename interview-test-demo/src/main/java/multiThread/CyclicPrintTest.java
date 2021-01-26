package multiThread;

/**
 * @program: interview-test-demo
 * @description: 三个线程顺序打印ABC10次
 * 解决方案一：适用三个标志来标识哪个线程应该等待，分别在三个线程中使用同步代码块。
 * @author: ZHQ
 * @create: 2019-08-08 22:18
 **/
public class CyclicPrintTest {
    private static boolean flag1 = true;
    private static boolean flag2 = false;
    private static boolean flag3 = false;

    public static void main(String[] args) {
        final CyclicPrintTest test = new CyclicPrintTest();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; ++i) {
                    while (true) {
                        synchronize (test) {
                            if (!flag1) {
                                try {
                                    test.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            } else {
                                System.out.println("A");
                                flag1 = false;
                                flag2 = true;
                                flag3 = false;
                                test.notifyAll();
                                break;
                            }
                        }
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; ++i) {
                    while (true) {
                        synchronize (test) {
                            if (!flag2) {
                                try {
                                    test.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            } else {
                                System.out.println("B");
                                flag1 = false;
                                flag2 = false;
                                flag3 = true;
                                test.notifyAll();
                                break;
                            }
                        }
                    }
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; ++i) {
                    while (true) {
                        synchronize (test) {
                            if (!flag3) {
                                try {
                                    test.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            } else {
                                System.out.println("C");
                                flag1 = true;
                                flag2 = false;
                                flag3 = false;
                                test.notifyAll();
                                break;
                            }
                        }
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }


}
