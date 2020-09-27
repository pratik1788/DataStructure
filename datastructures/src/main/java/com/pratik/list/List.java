package com.pratik.list;

public interface List<T> {
    void add(T element);
    void add(int index, T element);
    T get(int index);
    void remove(T element);
    int size();
}
