package com.dyoon.homework.test;


import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author cr
 * ����һ����ͼ��demo
 */
public class DrawingTest {
	public static void main(String[] args) {
		int a=12;
		while(a>3){
			System.out.println("a��ֵ�ǣ�"+a);
			a--;
		}
		System.out.println("a��ֵ���յ�ֵ�ǣ�"+a);
		int[] b={1,23,3,53};
		System.out.println(b);
		
		
	}
	
	//��һ��ֱ��
	public static void drawingLine(){
		StdDraw.setXscale(0,100);//����x�ķ�Χ
		StdDraw.setYscale(0,100);//����y�ķ�Χ
		
		StdDraw.setPenRadius(0.01);
//		StdDraw.setPenColor(StdDraw.BLUE);//���û��ʵ���ɫ
		StdDraw.line(10, 10, 40, 40);
	}
	
	//��һ������ֵ
	public static void drawingFunction(){
		StdDraw.setXscale(0,100);//����x�ķ�Χ
		StdDraw.setYscale(0,100*100);//����y�ķ�Χ
		
		for(int i=0;i<100;i++){
			StdDraw.point(i, i*i);
		}
	}

	//��һ��������飬ʹ�þ������
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
			double x=1.0*i/50;double y=a[i]/2.0;//���ε�����
			double rw=0.5/50;double rh=a[i]/2.0;//���εĿ�͸�
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	
	}



}
