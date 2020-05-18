package abstractfactory;

/**
 * @program: design-pattern-demo
 * @description: 抽象工厂模式
 * @author: ZHQ
 * @create: 2019-06-29 19:29
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color blue = colorFactory.getColor("blue");
        blue.fill();
    }
}
