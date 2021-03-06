package com.pratik.list.linklist;

import com.pratik.list.List;
import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkListTest {

    @Test
    public void add() {
        List<String> singlyList=new SinglyLinkList<>();
        singlyList.add("1");
        singlyList.add("2");
        singlyList.add("3");

        Assert.assertEquals(3,singlyList.size());
        Assert.assertEquals("1",singlyList.get(0));
        Assert.assertEquals("2",singlyList.get(1));
        Assert.assertEquals("3",singlyList.get(2));

    }

    @Test
    public void remove() {
        List<String> singlyList=new SinglyLinkList<>();
        singlyList.add("1");
        singlyList.add("2");
        singlyList.add("3");
        singlyList.add("5");

        singlyList.remove("3");

        Assert.assertEquals(3,singlyList.size());
        Assert.assertEquals("1",singlyList.get(0));
        Assert.assertEquals("2",singlyList.get(1));
        Assert.assertEquals("5",singlyList.get(2));

    }
}