import bean.People;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author ZHQ
 * @Date 2020/6/18 13:14
 */
public class MultisetTest {

    @Test
    public void test1() {
        HashMultiset<String> stringHashMultiset = HashMultiset.create();
        ArrayList<String> stringArrayList = Lists.newArrayList("aa", "aa", "bb", "cc");
        stringHashMultiset.addAll(stringArrayList);

        for (String s : stringHashMultiset.elementSet()) {
            System.out.println(s + ":" + stringHashMultiset.count(s));
        }
    }

    /**
     * <key, list<value>>
     */
    @Test
    public void test2() {
        Multimap<Integer, People> multimap = ArrayListMultimap.create();
        ArrayList<People> peopleList = Lists.newArrayList(new People(22, "a"), new People(22, "b"), new People(25, "c"));
        for (People people : peopleList) {
            multimap.put(people.getAge(), people);
        }
        for (Integer integer : multimap.keySet()) {
            System.out.println(multimap.get(integer));
        }
    }





}
