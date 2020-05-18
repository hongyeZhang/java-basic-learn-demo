package flyweight;

/**
 * @program: design-pattern-demo
 * @description: 享元模式
 * @author: ZHQ
 * @create: 2019-06-30 14:50
 **/
public class FlyweightPatternDemo {
    private static final String[] colorArr = {"red", "green", "blue", "white", "black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }



    }

    public static String getRandomColor() {
        return colorArr[(int) (Math.random() * colorArr.length)];
    }

    public static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    public static int getRandomY() {
        return (int) (Math.random() * 100);
    }

}
