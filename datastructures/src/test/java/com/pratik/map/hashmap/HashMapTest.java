package com.pratik.map.hashmap;


import org.junit.Assert;
import org.junit.Test;

public class HashMapTest {

    @Test
    public void put() {
        HashMap<String,String> map=new HashMap<>();
        map.put("1","One");
        map.put("2","Two");
        map.put("3","Three");

        Assert.assertEquals("Two",map.get("2"));
        Assert.assertEquals("One",map.get("1"));
        Assert.assertEquals("Three",map.get("3"));
        Assert.assertEquals(3, map.size());
    }

    @Test
    public void put_sameElement() {
        HashMap<String,String> map=new HashMap<>();
        map.put("1","One");
        map.put("2","Two");
        map.put("3","Three");
        map.put("3","Three");

        Assert.assertEquals("Two",map.get("2"));
        Assert.assertEquals("One",map.get("1"));
        Assert.assertEquals("Three",map.get("3"));
        Assert.assertEquals(3, map.size());
    }

    @Test
    public void put_limitedSize() {
        HashMap<String,String> map=new HashMap<>(1);
        map.put("1","One");
        map.put("2","Two");
        map.put("3","Three");

        Assert.assertEquals("Two",map.get("2"));
        Assert.assertEquals("One",map.get("1"));
        Assert.assertEquals("Three",map.get("3"));
        Assert.assertEquals(3, map.size());
    }

    @Test
    public void put_limitedSize_sameElement() {
        HashMap<String,String> map=new HashMap<>(1);
        map.put("1","One");
        map.put("2","Two");
        map.put("3","Three");
        map.put("3","Three");

        Assert.assertEquals("Two",map.get("2"));
        Assert.assertEquals("One",map.get("1"));
        Assert.assertEquals("Three",map.get("3"));
        Assert.assertEquals(3, map.size());
    }
}