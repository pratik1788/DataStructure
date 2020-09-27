package com.pratik.map;

public interface Map<K,V> {
    public K put(K key, V value);
    public V get(K key);
    public void remove(K key);
    public int size();
}
