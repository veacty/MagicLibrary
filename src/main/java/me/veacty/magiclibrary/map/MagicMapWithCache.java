package me.veacty.magiclibrary.map;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MagicMapWithCache<K, V> implements MagicMap<K, V> {

    private final Map<K, V> map;
    private final Cache<K, V> cache;

    public MagicMapWithCache(int duration, TimeUnit timeUnit) {
        this.map = new HashMap<>();
        this.cache = CacheBuilder.newBuilder().expireAfterAccess(duration, timeUnit).build();
    }

    @Override
    public V get(K k) {
        V v = this.map.get(k);
        if (v == null) {
            v = this.cache.getIfPresent(k);
        }
        return v;
    }

    @Override
    public void put(K k, V v) {
        this.map.put(k, v);
        this.cache.put(k, v);
    }

    @Override
    public void remove(K k) {
        this.map.remove(k);
        this.cache.invalidate(k);
    }

    @Override
    public Collection<V> values() {
        return this.map.values();
    }


}