package com.dyoon.algorithm.sort;

public class ChooseSort {
	public static void main(String[] args) {
		int[] data={1,3,6,2,7,32,643,4,2};
		data=sort(data);
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}
	public static int[] sort(int[] disorder){
		int[]order=new int[disorder.length];
		for(int j=0;j<disorder.length;j++){
			int max=disorder[j];
			int temp;
			for(int i=j;i<disorder.length;i++){
				if(disorder[i]>max){
					max=disorder[i];
					temp=disorder[i];
					disorder[i]=disorder[j];
					disorder[j]=temp;
				}
			}
			 
			order[j]=max;
		}
	
		
		return order;
	}
}
