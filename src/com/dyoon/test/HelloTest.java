package com.dyoon.test;

import junit.framework.TestCase;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * Created by Administrator on 2017/3/27.
 */
public class HelloTest extends TestCase {
    public void testHello() {
        System.out.println("hello world");
        List<String> list = new ArrayList<>();
        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("hello");
        linkList.get(1);
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(12, "22");
        hashMap.put(12, "21");
        System.out.println(hashMap.get(12));
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(30, "30");


    }
}
