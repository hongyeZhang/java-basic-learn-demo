import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author ZHQ
 * @Date 2020/6/18 19:17
 */
public class JoinerTest {

    @Test
    public void test1() {
        Joiner joiner = Joiner.on(";").skipNulls();
        ArrayList<String> stringArrayList = Lists.newArrayList("Harry", null, "Ron", "Hermione");
        String join = joiner.join(stringArrayList);
        System.out.println(join);
    }
}
