package synchronize;

/**
 * @author ZHQ
 * @date 2021/1/23
 */
public class ThreadSafeCount {

    private Long value;

    public synchronized Long getCount() {
        return value;
    }

    public synchronized void inc() {
        value++;
    }
}
