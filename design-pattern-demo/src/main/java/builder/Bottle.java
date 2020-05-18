package builder;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 21:04
 **/
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "bottle";
    }
}
