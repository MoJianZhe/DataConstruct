package com.dyoon.algorithm.find;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;

public class BinaryFind {
	public static void main(String[] args) {
/*		System.out.println(Math.sqrt(4));//��ƽ����
		int a[]={3,2,4};
		a=sort(a);
		System.out.println(Arrays.toString(a));*/
		StdDraw.setXscale(0,100);StdDraw.setYscale(0,100);
		
		StdDraw.setPenRadius(0.01);//���û��ʵĴ�ϸ
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.point(30, 30);
		StdDraw.line(20, 20, 40, 40);
		StdDraw.circle(10, 50, 10);
	
	}
	
	//�����鰴��������
	public static int[] sort(int []a){
		Arrays.sort(a);
		return a;
	}
}
