import com.google.common.base.CharMatcher;

/**
 * @program: guava-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-08-09 16:02
 **/
public class CharMatcherTest {
    private static final CharMatcher charMatcherDigit = CharMatcher.DIGIT;
    private static final CharMatcher charMatcherAny = CharMatcher.ANY;

    public static void main(String[] args) {
        System.out.println(charMatcherDigit.removeFrom("abc234saddjsal--"));
        System.out.println(charMatcherDigit.retainFrom("abc234saddjsal--"));


    }
}
