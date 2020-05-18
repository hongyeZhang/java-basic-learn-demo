package abstractfactory;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 19:26
 **/
public class FactoryProducer {
    public static final String COLOR = "color";
    public static final String SHAPE = "shape";

    public static AbstractFactory getFactory(String choice) {
        if (COLOR.equalsIgnoreCase(choice)) {
            return new ColorFactory();
        } else if (SHAPE.equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else {
            throw new RuntimeException("no support factory type");
        }
    }
}
