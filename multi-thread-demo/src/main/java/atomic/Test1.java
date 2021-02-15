package atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ZHQ
 * @date 2021/1/31
 */
public class Test1 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println(atomicInteger.getAndDecrement());
        System.out.println(atomicInteger.get());

    }
}
