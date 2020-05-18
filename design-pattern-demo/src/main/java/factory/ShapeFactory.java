package factory;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 18:29
 **/
public class ShapeFactory {
    public static final String CIRCLE = "circle";
    public static final String SQUARE = "square";
    public static final String RECTANGLE = "rectangle";

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (CIRCLE.equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if (SQUARE.equalsIgnoreCase(shapeType)) {
            return new Square();
        } else if (RECTANGLE.equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else {
            throw new RuntimeException("no support type");
        }
    }
}
