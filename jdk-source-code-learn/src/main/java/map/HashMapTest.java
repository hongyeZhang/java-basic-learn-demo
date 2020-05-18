package map;

import java.util.HashMap;

/**
 * @author : ZHQ
 * @date : 2020/2/22
 */
public class HashMapTest {
    public static void main(String[] args) {
        testTraversal();

    }

    public static void testTraversal() {
        HashMap<Integer, String> map = new HashMap(16);
        map.put(7, "");
        map.put(11, "");
        map.put(43, "");
        map.put(59, "");
        map.put(19, "");
        map.put(3, "");
        map.put(35, "");

        System.out.println("遍历结果：");
        for (Integer key : map.keySet()) {
            System.out.print(key + " -> ");
        }
    }
}
