package com.pratik.list.dynamicarray;

import com.pratik.list.List;

public class ArrayList<T> implements List<T> {
    private final static int INITIAL_CAPACITY=8;
    private int currentPointer=0;
    private int currentCapacity=INITIAL_CAPACITY;
    private Object[] array;
    public ArrayList() {
        array = new Object[INITIAL_CAPACITY];
    }
    public ArrayList(int initialCapacity){
        array = new Object[initialCapacity];
        currentCapacity=initialCapacity;
    }

    @Override
    public void add(T element) {
        checkAndIncreaseArraySize();
        array[currentPointer]=element;
        currentPointer++;
    }

    @Override
    public void add( int index, T element) {
        if(index>currentPointer){
            throw new RuntimeException("Index out of bound Exception");
        }
        checkAndIncreaseArraySize();
        array[index]=element;
        for(int i=index+1;i<array.length;i++){
            array[i]= array[i-1];
        }
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

    private void checkAndIncreaseArraySize(){
        if(array.length == currentCapacity){
            Object[] newArray=new Object[currentCapacity*2];
            System.arraycopy(array,0,newArray,0,array.length);
            array=newArray;
            currentCapacity=currentCapacity*2;
        }
    }
}
