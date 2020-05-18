package decorator;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 11:56
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw : circle");
    }
}
