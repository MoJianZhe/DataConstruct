package com.dyoon.algorithm.find;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;

public class BinaryFind {
	public static void main(String[] args) {
		System.out.println(Math.sqrt(4));//求平方根
		int a[]={3,2,4};
		a=sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(rank(2,a));
		
		
	
	}
	
	//将数组按升序排列
	public static int[] sort(int []a){
		Arrays.sort(a);
		return a;
	}
	//二分查找，前提数组必须是已经排好序的
	public static int rank(int key,int a[]){
		int lo=0;int hi=a.length+1;
		while((hi-lo)>0){
			
			int mid=(hi-lo)/2;
			if(key>a[mid]){
				lo=mid+1;
			}else if(key<a[mid]){
				hi=mid-1;
			}else{
				return mid;
			}
		
		}
		return -1;
}	
	
	
	
}
