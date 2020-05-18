package command;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 16:28
 **/
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("bought : [name=" + name + ", quantity=" + quantity + "]");
    }

    public void sale() {
        System.out.println("sold : [name=" + name + ", quantity=" + quantity + "]");
    }
}
