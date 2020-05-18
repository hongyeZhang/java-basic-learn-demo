package abstractfactory;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 19:13
 **/
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("green fill method");
    }
}
