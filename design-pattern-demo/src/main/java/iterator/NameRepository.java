package iterator;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 16:50
 **/
public class NameRepository implements Container {
    private static final String[] nameArr = {"robert", "john", "juice", "amy"};

    @Override
    public Iterator getIteraor() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if (index + 1 < nameArr.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return nameArr[++index];
        }
    }

}
