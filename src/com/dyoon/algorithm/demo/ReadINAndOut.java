package com.dyoon.algorithm.demo;


import com.dyoon.homework.test.Arges;

import edu.princeton.cs.algs4.StdIn;

/**
 * @author cr
 * һЩ���룬�����demo
 */
public class ReadINAndOut {
	public static void main(String[] args) {
		InFunction();
		System.out.println(args[0]);
	}
	
	
	//�������
	public static void InFunction(){
		String agString=StdIn.readAll();
		if(agString!=null){
			System.out.println(agString);
		}
	
	}
	
}
