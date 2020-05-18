package builder;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 21:05
 **/
public abstract class Burger implements Item {

    @Override
    public abstract String name();

    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
