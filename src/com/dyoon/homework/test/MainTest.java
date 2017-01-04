package com.dyoon.homework.test;

public class MainTest {
	public static void main(String[] args) {
		Chapter1216 test=new Chapter1216(1,2);
		Chapter1216 test2=new Chapter1216(1,3);
		System.out.println(test.add(test2).toString());
		System.out.println(test.subtraction(test2).toString());
		System.out.println(test.multip(test2));
		System.out.println(test.divice(test2));
	}
}
