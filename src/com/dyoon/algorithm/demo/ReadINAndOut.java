package com.dyoon.algorithm.demo;


import com.dyoon.homework.test.Arges;

import edu.princeton.cs.algs4.StdIn;

/**
 * @author cr
 * 一些输入，输出的demo
 * 第一章，1.1.30练习题
 * 给一个boolean型的二维数组赋值，当i与j互质的时候，a[i][j]为true
 * 求两个数的最大公约数，被除数和除数的最大公约数等于除数和商的最大公约数
*如果余数能被除数所除，那么他一定可以被被除数所除
 */

public class ReadINAndOut {
	public static void main(String[] args) {
		InFunction();
		System.out.println(args[0]);
	}
	
	
	//输入测试
	public static void InFunction(){
		String agString=StdIn.readAll();
		if(agString!=null){
			System.out.println(agString);
		}
	
	}
	
}
