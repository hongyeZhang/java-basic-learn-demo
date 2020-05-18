package decorator;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 11:57
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw : rectangle");
    }
}
