package com.dyoon.algorithm.demo;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author Administrator
 * 这是实现的一个计算器，用两个stack来实现，一个存放运算字符，一个存放数字。
 */
//((3-1)+3+(3*1)) ( ( 3 - 1 ) + 3 ) + ( 3 * 1 ) )
public class Evaluate {
	private static Stack<String>charactor=new Stack<>();
	private static Stack<Double>number=new Stack<>();
	public static void main(String[] args) {
		run();
		
	}
	//依次读取表达式，如果遇到)，则开始计算
	public static void run(){
		while(!StdIn.isEmpty()){
		/*	int a=StdIn.readInt();
			System.out.println(a+1)*/;
			String s=StdIn.readString();//读取下一个字符串，两个字符串用空格隔开
			System.out.println(s);
			if(s.equals("("))  {
			}
			else if(s.equals("+")){
				charactor.push(s);
			}else if(s.equals("-")){
				charactor.push(s);
			}else if(s.equals("*")){
				charactor.push(s);
			}
			else if(s.equals("/")){
				charactor.push(s);
			}else if(s.equals("sqrt")){
				charactor.push(s);
			}else if(s.equals(")")){//若匹配反括号，则
				String string=charactor.pop();
				Double v=number.pop();
				if(string.equals("+")){
					v=v+number.pop();
				}else if(string.equals("-")){
					v=number.pop()-v;
				}else if(string.equals("*")){
					v=number.pop()*v;
				}else if(string.equals("/")){
					v=number.pop()/v;
				}else if(string.equals("sqrt")){
					v=Math.sqrt(v);//求其正平方根
				}
				number.push(v);//将计算的结果放入栈
			}else{
				number.push(Double.parseDouble(s));
			}
		}
		System.out.println(number.pop());
		
	}
}
