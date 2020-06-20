import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZHQ
 * @Date 2020/6/18 13:01
 */
public class ListsTest {

    @Test
    public void test1() {
        ArrayList<Integer> objects = Lists.newArrayList();
        ArrayList<String> stringArrayList = Lists.newArrayListWithCapacity(3);
        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("c");
        stringArrayList.add("d");
        System.out.println(stringArrayList);
    }

    @Test
    public void test2() {
        List<String> stringArrayList = Lists.newArrayList("a", "b", "c", "d", "e", "f");
        List<List<String>> partition = Lists.partition(stringArrayList, 2);
        for (List<String> strings : partition) {
            System.out.println(strings);
        }
    }

    @Test
    public void test3() {
        List<String> stringArrayList = Lists.newArrayList("a", "b", "c", "d", "e");
        List<List<String>> partition = Lists.partition(stringArrayList, 2);
        for (List<String> strings : partition) {
            System.out.println(strings);
        }
    }

    @Test
    public void test4() {
        List<String> stringArrayList = Lists.newArrayList("a", "b", "c", "d", "e");
        List<Integer> transform = Lists.transform(stringArrayList, new Function<String, Integer>() {
            @Nullable
            public Integer apply(@Nullable String input) {
                return input.length();
            }
        });

        System.out.println(transform);

    }

}
