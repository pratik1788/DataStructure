package com.pratik.List;

public interface List<T> {
    void add(T element);
    T get(int index);
    void remove(T element);
    int size();
}
