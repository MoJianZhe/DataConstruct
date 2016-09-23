package com.dyoon.homework.test;



/**
 * @author cr
 * 第一章，1.1.30练习题
 */
public class Chapter1130 {
	//判断这两个数是不是互质
	public boolean isRelativeLyPrime(int x,int y){
		if(greateCommonDivisor(x, y)==1){//如果两个数的最大公约数为1，则他们是互质的
			return true;
		}else{
			return true;
		}
		
	}
//	求两个数的最大公约数
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
		System.out.println(greateCommonDivisor(3,11));
	}
}
