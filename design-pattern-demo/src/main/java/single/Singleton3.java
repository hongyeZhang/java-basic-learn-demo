package single;

/**
 * @program: design-pattern-demo
 * @description: not lazy init, 线程安全，但是浪费内存，容易产生垃圾对象【建议使用的方式】
 * @author: ZHQ
 * @create: 2019-06-29 20:00
 **/
public class Singleton3 {
    public static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("singleton pattern 3 message");
    }


}
