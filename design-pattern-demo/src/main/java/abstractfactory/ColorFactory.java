package abstractfactory;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 19:22
 **/
public class ColorFactory extends AbstractFactory {
    public static final String BLUE = "blue";
    public static final String GREEN = "green";
    public static final String RED = "red";

    @Override
    public Color getColor(String color) {
        if (null == color) {
            return null;
        }
        if (BLUE.equalsIgnoreCase(color)) {
            return new Blue();
        } else if (GREEN.equalsIgnoreCase(color)) {
            return new Green();
        } else if (RED.equalsIgnoreCase(color)) {
            return new Red();
        } else {
            throw new RuntimeException("no supprt color type");
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
