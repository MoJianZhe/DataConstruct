package com.dyoon.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by Administrator on 2017/2/17.
 */
public class TestOne  {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.remove("hello");
        Vector<String> vector = new Vector<>();//方法都加上了synchornize
        vector.add("hello");
        vector.add("world");
        vector.remove("world");
        vector.set(1, "hell0");

        Stack<String >stack=new Stack<>();//stack继承了Vector,只不过是filo
        stack.add("hello");
        stack.add("world");
        stack.remove("hello");
    }
}
