package com.pratik.List.DynamicArray;

import com.pratik.List.List;

public class MyArrayList<T> implements List<T> {
    private final static int INITIAL_CAPACITY=8;
    private int currentPointer=0;
    private int currentCapacity=INITIAL_CAPACITY;
    private Object[] array;
    public MyArrayList() {
        array = new Object[INITIAL_CAPACITY];
    }
    public MyArrayList(int initialCapacity){
        array = new Object[initialCapacity];
        currentCapacity=initialCapacity;
    }

    @Override
    public void add(T element) {

        if(array.length == currentCapacity){

            Object[] newArray=new Object[currentCapacity*2];
            System.arraycopy(array,0,newArray,0,array.length);
            array=newArray;
            currentCapacity=currentCapacity*2;
        }
        array[currentPointer]=element;
        currentPointer++;
    }

    @Override
    public T get(int index) {
        return (T)array[index];
    }

    @Override
    public void remove(T element) {
        for(int count=0;count<INITIAL_CAPACITY-1;count++){
            if(array[count] == element){
                array[count] = array[count+1];
            }
         }
        currentPointer--;
    }

    @Override
    public int size() {
        return currentPointer;
    }
}
