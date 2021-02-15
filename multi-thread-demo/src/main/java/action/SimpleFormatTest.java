package action;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author ZHQ
 * @date 2021/2/8
 */
public class SimpleFormatTest {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(dateFormat.parse("2021-02-08 02:20:20"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }
    }
}
