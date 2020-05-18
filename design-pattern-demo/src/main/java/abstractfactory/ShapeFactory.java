package abstractfactory;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 19:19
 **/
public class ShapeFactory extends AbstractFactory {
    public static final String CIRCLE = "circle";
    public static final String SQUARE = "square";
    public static final String RECTANGLE = "rectangle";

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (null == shape) {
            return null;
        }
        if (CIRCLE.equalsIgnoreCase(shape)) {
            return new Circle();
        } else if (SQUARE.equalsIgnoreCase(shape)) {
            return new Square();
        } else if (RECTANGLE.equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else {
            throw new RuntimeException("no support shape type");
        }
    }
}
