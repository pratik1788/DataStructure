package com.pratik.list.dynamicarray;

import com.pratik.list.List;
import org.junit.Assert;
import org.junit.Test;

public class ArrayListTest {

    @Test
    public void testAddMethod(){
        List<String> arrayList=new ArrayList<>(4);
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        Assert.assertEquals("1",arrayList.get(0));
        Assert.assertEquals("2",arrayList.get(1));
        Assert.assertEquals("3",arrayList.get(2));
        Assert.assertEquals("4",arrayList.get(3));
        Assert.assertEquals("5",arrayList.get(4));
        Assert.assertEquals("6",arrayList.get(5));
        Assert.assertEquals("7",arrayList.get(6));
        Assert.assertEquals(7,arrayList.size());
    }
    @Test
    public void testRemoveMethod(){
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(11);
        Assert.assertEquals(3,arrayList.size());
        arrayList.remove(7);
        Assert.assertEquals(2,arrayList.size());
        Assert.assertTrue(5==arrayList.get(0));
        Assert.assertTrue(11==arrayList.get(1));

    }
}