package com.dyoon.homework.test;

import java.io.IOException;
import java.util.Scanner;
public class Arges {
	public static void main(String[] args) throws IOException {
		int firstArg=testIn();
		System.out.println("输入的第一个参数是："+firstArg);
		int secondArg=testIn();
		int thirdArg=testIn();
		if(firstArg==secondArg&&secondArg==thirdArg){
			System.out.println("这三个参数相等");
		}else {
			System.out.println("这三个参数不相等");
		}
		
	}

	public static int testIn() throws IOException{
		System.out.println("请输入一个整数");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		return a;
	}
	
}
