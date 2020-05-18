package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 21:13
 **/
public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public float getPrice() {
        float totalPrice = 0.0f;
        for (Item item : itemList) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void showItems() {
        for (Item item : itemList) {
            System.out.print("item : " + item.name() + "\t");
            System.out.print("packing : " + item.packing().pack() + "\t");
            System.out.print("price : " + item.price() + "\t");
            System.out.println();
        }
    }
}
