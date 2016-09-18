package com.dyoon.homework.test;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author cr
 * 该类是一个试题类，写一些试题的解答
 */
public class HomeWorkTest {
	public static void main(String[] args) {
//		System.out.println((2.0e-6*100000000.1));
//		System.out.println(true&&false||true&&false);
		sysoutf();
	}
	
	public static void sysoutf(){
		int f=0;int g=1;
		for(int i=0;i<=15;i++){
			System.out.println(f);
			f=f+g;g=f-g;
		}
	}
}
