import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.*;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.*;

import javax.annotation.Nullable;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: guava-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-08-09 16:10
 **/
public class CollecitonTest {
    public static void main(String[] args) {
//        intTest();
//        testMultiSet();
//        testUnmodifiable();
//        testMap();
//        testTable();
//        testFunction();
        testCallBack();

    }


    public static void intTest() {
        List<Integer> list = Ints.asList(1, 3, 5, 7, 9);
        System.out.println(list);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list2);

        System.out.println(Ints.join("&", 1, 2, 3));

        int[] intArr = Ints.concat(new int[]{1, 2}, new int[]{2, 3, 4});
        for (int i : intArr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println(Ints.max(intArr));
        System.out.println(Ints.min(intArr));

        System.out.println(Ints.contains(intArr, 6));
        int[] arr2 = Ints.toArray(list);
        System.out.println(arr2.length);
    }


    public static void testMultiSet() {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("b");

        System.out.println(multiset.size());
        System.out.println(multiset.count("a"));
    }



    public static void testUnmodifiable() {
/*        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        List<String> readOnlyList = Collections.unmodifiableList(list);
        System.out.println(list);

        list.add("c");
        System.out.println(list);*/

//        List<String> list = ImmutableList.of("a", "b", "c");
//        List<String> list2 = ImmutableList.copyOf(list);

//        ImmutableMap<String, String> immutableMap = ImmutableMap.of("name", "zhq", "sex", "man");
//        System.out.println(immutableMap);

        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("zhq", "zhq");
        System.out.println(multimap.get("zhq"));



    }


    public static void testMap() {
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("name", "zhq");
        biMap.forcePut("hhh", "zhq");
        System.out.println(biMap);
        System.out.println(biMap.inverse().get("zhq"));
    }

    public static void testTable() {
        Table<String, String, Integer> table = HashBasedTable.create();
        table.put("张三", "计算机", 80);
        table.put("张三", "数学", 90);
        table.put("张三", "语文", 70);

        table.put("李四", "计算机", 80);
        table.put("李四", "数学", 90);
        table.put("李四", "语文", 70);

        Set<Table.Cell<String, String, Integer>> set = table.cellSet();
        for (Table.Cell cell : set) {
            System.out.println(cell.getRowKey() + "," + cell.getColumnKey() + "," + cell.getValue());
        }

        Set<String> rowSet = table.rowKeySet();
        System.out.println(rowSet);

        Set<String> columnSet = table.columnKeySet();
        System.out.println(columnSet);

    }

    public static void testFunction() {
        List<String> list = Lists.newArrayList("helloworld", "yes", "zhanghuanqiang");

        Function<String, String> f1 = new Function<String, String>() {
            @Nullable
            public String apply(@Nullable String input) {
                return input.length() < 5 ? input : input.substring(0, 5);
            }
        };

        Function<String, String> f2 = new Function<String, String>() {
            @Nullable
            public String apply(@Nullable String input) {
                return input.toUpperCase();
            }
        };

        Function<String, String> f3 = Functions.compose(f1, f2);
        Collection<String> out = Collections2.transform(list, f3);
        for (String s : out) {
            System.out.println(s);
        }
    }

    public static void testCallBack() {
        ExecutorService es = Executors.newFixedThreadPool(3);
        ListeningExecutorService listeningExecutorService = MoreExecutors.listeningDecorator(es);

        ListenableFuture listenableFuture = listeningExecutorService.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                if (new Random().nextInt(3) == 2) {
                    throw new NullPointerException();
                }
                return 1;
            }
        });

        FutureCallback futureCallback = new FutureCallback<Integer>() {
            public void onSuccess(@Nullable Integer result) {
                System.out.println("==============" + result);
            }

            public void onFailure(Throwable t) {
                System.out.println("==============" + t.getMessage());
            }
        };

        Futures.addCallback(listenableFuture, futureCallback);


    }


}
