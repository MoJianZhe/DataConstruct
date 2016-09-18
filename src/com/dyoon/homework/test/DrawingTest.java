package com.dyoon.homework.test;


import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author cr
 * 这是一个画图的demo
 */
public class DrawingTest {
	public static void main(String[] args) {
		int a=12;
		while(a>3){
			System.out.println("a的值是："+a);
			a--;
		}
		System.out.println("a的值最终的值是："+a);
		int[] b={1,23,3,53};
		System.out.println(b);
		
		
	}
	
	//画一条直线
	public static void drawingLine(){
		StdDraw.setXscale(0,100);//设置x的范围
		StdDraw.setYscale(0,100);//设置y的范围
		
		StdDraw.setPenRadius(0.01);
//		StdDraw.setPenColor(StdDraw.BLUE);//设置画笔的颜色
		StdDraw.line(10, 10, 40, 40);
	}
	
	//画一个函数值
	public static void drawingFunction(){
		StdDraw.setXscale(0,100);//设置x的范围
		StdDraw.setYscale(0,100*100);//设置y的范围
		
		for(int i=0;i<100;i++){
			StdDraw.point(i, i*i);
		}
	}

	//画一个随机数组，使用矩形填充
	public static void drawingArray(){
		Double[] a=new Double[50];
//		System.out.println(a);
		System.out.println(a.length);
		for(int i=0;i<a.length;i++){
			a[i]=StdRandom.random();
//			a[i]=Math.random()*100;
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			double x=1.0*i/50;double y=a[i]/2.0;//矩形的中心
			double rw=0.5/50;double rh=a[i]/2.0;//矩形的宽和高
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	
	}



}
