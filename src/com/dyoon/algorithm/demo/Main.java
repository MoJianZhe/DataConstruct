package com.dyoon.algorithm.demo;
/*
* 这是实现的一个计算器，用两个stack来实现，一个存放运算字符，一个存放数字。
 */

public class Main {
	public static void main(String[] args) {
		MyStackByNode<String> myStack=new MyStackByNode<>();
		System.out.println(myStack.isEmpty());
		myStack.push("afsda");
		myStack.push("asdfsd");  
		myStack.push("23");
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.pop());
	/*	for(int i=0;i<=myStack.getSize()-1;i++){
			System.out.println("弹出后的结果数组第"+(i+1)+"����"+myStack.getItems()[i]);
		}*/
		MyQueueByNode<String>myQueueByNode=new MyQueueByNode<>();
		myQueueByNode.push("hello");
		myQueueByNode.push("2334");
		System.out.println(myQueueByNode.pop());

	}
}
