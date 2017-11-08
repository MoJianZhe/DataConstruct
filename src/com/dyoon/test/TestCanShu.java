package com.dyoon.test;

/**
 * Created by Administrator on 2017/5/17.
 */
public class TestCanShu {
    public String name;

    public TestCanShu(String name) {
        this.name=name;
    }

    public void changeName(String name) {
        name = "hh";
    }

    public static void main(String[] args) {
        TestCanShu testCanShu=new TestCanShu("LaoLi");
        testCanShu.changeName(testCanShu.name);
        System.out.println(testCanShu.name);
    }
}
