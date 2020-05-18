package single;

/**
 * @program: design-pattern-demo
 * @description: 双重检查锁，线程安全，效率高 lazy init【特殊情况下建议使用】
 * @author: ZHQ
 * @create: 2019-06-29 20:06
 **/
public class Singleton4 {
    public static volatile Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("singleton pattern 4 message");
    }
}
