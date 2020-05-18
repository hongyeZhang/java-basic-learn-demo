package decorator;

/**
 * @program: design-pattern-demo
 * @description: 装饰者模式
 * @author: ZHQ
 * @create: 2019-06-30 12:03
 **/
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();

    }
}
