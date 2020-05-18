package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : ZHQ
 * @date : 2020/2/23
 */
public class ConcurrentIssueDemo1 {

    private static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws Exception {

        // 线程1 => t1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 9999; i++) {
                    map.put("thread1_key" + i, "thread1_value" + i);
                }
            }
        });
        // 线程2 => t2
        Thread t2 = new Thread(new Runnable() {
            @Override
                public void run() {
                for (int i = 0; i < 9999; i++) {
                    map.put("thread2_key" + i, "thread2_value" + i);
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map.size());

    }




}
