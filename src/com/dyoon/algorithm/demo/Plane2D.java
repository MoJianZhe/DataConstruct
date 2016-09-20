package com.dyoon.algorithm.demo;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;

/**
 * @author cr
 * 这个类实现了一些，点(point2d)，线(interval1d)，面(interval2d)的实例
 */
public class Plane2D {
		
	public static void main(String[] args) {
		Interval1D xInterval1d=new Interval1D(0.3, 0.4);
		Interval1D yInterval1d=new Interval1D(0.3, 0.5);
		Interval2D interval2d=new Interval2D(xInterval1d, yInterval1d);
		interval2d.draw();
		System.out.println("面积是"+interval2d.area());
		Counter counter=new Counter("counter");
		for(int i=0;i<100;i++){
			Double xDouble=Math.random();Double yDouble=Math.random();
			Point2D p=new Point2D(xDouble, yDouble);
			if(interval2d.contains(p)){
				counter.increment();
			}else{
				p.draw();
			}
		}
		System.out.println(counter.tally());//输出总共有多少个点在画出的面积里面
	}
	
}
