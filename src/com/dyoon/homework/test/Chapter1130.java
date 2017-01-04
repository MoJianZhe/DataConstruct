package com.dyoon.homework.test;

import java.util.Arrays;

/**
 * @author cr
 * 第一章，1.1.30练习题
 * 给一个boolean型的二维数组赋值，当i与j互质的时候，a[i][j]为true
 */
public class Chapter1130 {
	//�ж����������ǲ��ǻ���
	public static  boolean isRelativeLyPrime(int x,int y){
		if(greateCommonDivisor(x, y)==1){//��������������Լ��Ϊ1���������ǻ��ʵ�
			return true;
		}else{
			return false;
		}
		
	}
//	求两个数的最大公约数，被除数和除数的最大公约数等于除数和商的最大公约数
	public static int greateCommonDivisor(int x,int y){
		if(x<y){
			int temp=0;;
			temp=x;x=y;y=temp;
		}
		while((x%y)!=0){
			int c=x%y;//如果余数能被除数所除，那么他一定可以被被除数所除
			x=y;y=c;
		}
		return y;
	}
	public static void main(String[] args) {
		int x=10;int y=10;
		boolean[][] array=new boolean[x][y];
		for(int i=0;i<y;i++){
			array[0][i]=false;//��һ��ȫΪfalse
		}
		for(int j=0;j<x;j++){
			array[j][0]=false;//��һ��Ϊfalse
		}
		for(int i=1;i<x;i++){
			for(int j=1;j<y;j++){
				if(isRelativeLyPrime(i, i)){
					array[i][j]=true;
				}else{
					array[i][j]=false;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				System.out.println("a["+i+"]["+j+"]Ϊ:"+array[i][j]);
			}
		}
	
	}
}
