package com.dyoon.homework.test;

import java.io.IOException;
import java.util.Scanner;
public class Arges {
	public static void main(String[] args) throws IOException {
		int firstArg=testIn();
		System.out.println("����ĵ�һ�������ǣ�"+firstArg);
		int secondArg=testIn();
		int thirdArg=testIn();
		if(firstArg==secondArg&&secondArg==thirdArg){
			System.out.println("�������������");
		}else {
			System.out.println("���������������");
		}
		
	}

	public static int testIn() throws IOException{
		System.out.println("������һ������");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		return a;
	}
	
}
