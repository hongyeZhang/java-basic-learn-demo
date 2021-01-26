package list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ZHQ
 * @date 2021/1/26
 */
public class CopyOnWriteList {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("hello");
        list1.add("world");

        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
