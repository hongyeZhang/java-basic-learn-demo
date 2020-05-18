package abstractfactory;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 19:12
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red fill method");
    }
}
