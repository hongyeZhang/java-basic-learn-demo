import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

/**
 * @program: guava-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-08-09 15:46
 **/
public class StringTest {
    private static final Joiner JOINER = Joiner.on(",").skipNulls();
    private static final Splitter SPLITTER = Splitter.on(",").trimResults().omitEmptyStrings();

    public static void main(String[] args) {
        String join = JOINER.join(Lists.newArrayList("a", null, "b"));
        System.out.println(join);

        for (String tmp : SPLITTER.split(" a,  ,b,,")) {
            System.out.println("|" + tmp + "|");
        }
    }

}
