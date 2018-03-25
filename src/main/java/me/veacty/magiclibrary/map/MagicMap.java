package me.veacty.magiclibrary.map;

import java.util.Collection;

public interface MagicMap<K, V> {

    V get(K k);

    void put(K k, V v);

    void remove(K k);

    Collection<V> values();

}