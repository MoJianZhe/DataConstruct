package com.dyoon.homework.test;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author cr
 * ������һ�������࣬дһЩ����Ľ��
 */
public class HomeWorkTest {
	public static void main(String[] args) {
		System.out.println((2.0e-6*100000000.1));
		System.out.println(true&&false||true&&false);
		sysoutf();
			int a=StdRandom.uniform(1, 7);//����[1,7)֮���������һ����
	}
	
	public static void sysoutf(){
		int f=0;int g=1;
		for(int i=0;i<=15;i++){
			System.out.println(f);
			f=f+g;g=f-g;
		}
	
	}
}
