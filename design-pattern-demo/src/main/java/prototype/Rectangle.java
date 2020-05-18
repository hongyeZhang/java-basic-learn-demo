package prototype;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 21:59
 **/
public class Rectangle extends Shape {

    public Rectangle() {
        this.setType("rectangle");
    }

    @Override
    void draw() {
        System.out.println("rectangle draw method");
    }
}
