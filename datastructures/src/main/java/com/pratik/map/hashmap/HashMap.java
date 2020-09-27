package com.pratik.map.hashmap;

import com.pratik.list.dynamicarray.ArrayList;
import com.pratik.list.linklist.SinglyLinkList;
import com.pratik.map.Map;

public class HashMap  <K,V>implements Map <K,V> {

    public static final int INITIAL_CAPACITY=16;
    private int currentCapacity=INITIAL_CAPACITY;
    private int size=0;

    private Entry[] map;
    private class Entry<K,V>{
        private K key;
        private V value;
        private int hash;
        private Entry next;
    }

    public HashMap(){
        map= new Entry[INITIAL_CAPACITY];
    }
    public  HashMap(int capacity){
        map= new Entry[capacity];
        currentCapacity=capacity;
    }


    @Override
    public K put(K key, V value) {
       int hashValue= calculateHash(key,currentCapacity);
       if(map[hashValue] == null){
           Entry<K,V> bucketEntry = new Entry<>();
           bucketEntry.key=key;
           bucketEntry.value=value;
           bucketEntry.hash=hashValue;
           bucketEntry.next =null;
           map[hashValue]= bucketEntry;
           size++;
       }else{
           Entry<K,V> bucketEntry = map[hashValue];
           Entry<K,V> traverseEntry= bucketEntry;
           while(traverseEntry !=null){
               if(!traverseEntry.key.equals(key)){
                   if(traverseEntry.next == null){
                       Entry<K, V> entry = new Entry<>();;
                       entry.key = key;
                       entry.value = value;
                       entry.hash = hashValue;
                       entry.next = null;
                       traverseEntry.next = entry;
                       traverseEntry=entry;
                       size++;
                   }
                   traverseEntry=traverseEntry.next;
               }
               else{
                   break;
               }
           }
       }
        return key;
    }

    private int calculateHash(K key, int length){
        return key.hashCode() & (length-1);
    }


    @Override
    public V get(K key) {
        V value=null;
        int hashValue= calculateHash(key,currentCapacity);
        if(map[hashValue] != null){
            Entry<K,V> bucketEntry = map[hashValue];
            Entry<K,V> traverseEntry= bucketEntry;
            while(traverseEntry !=null){
                if(traverseEntry.key.equals(key)){
                    value= traverseEntry.value;
                }
                traverseEntry=traverseEntry.next;
            }
        }
        return value;
    }

    @Override
    public void remove(K key) {

    }

    @Override
    public int size() {
        return size;
    }
}
