package lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author : ZHQ
 * @date : 2020/2/18
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int CACHE_SIZE;

    public LRUCache(int size) {
        super((int) Math.ceil(size / 0.75f) + 1, 0.75f, true);
        CACHE_SIZE = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > CACHE_SIZE;
    }
}
