package com.dyoon.homework.test;



/**
 * @author cr
 * ��һ�£�1.1.30��ϰ��
 */
public class Chapter1130 {
	//�ж����������ǲ��ǻ���
	public boolean isRelativeLyPrime(int x,int y){
		if(greateCommonDivisor(x, y)==1){//��������������Լ��Ϊ1���������ǻ��ʵ�
			return true;
		}else{
			return true;
		}
		
	}
//	�������������Լ��
	public static int greateCommonDivisor(int x,int y){
		if(x<y){
			int temp=0;;
			temp=x;x=y;y=temp;
		}
		while((x%y)!=0){
			int c=x%y;//��������ܱ�������������ô��һ�����Ա�����������
			x=y;y=c;
		}
		return y;
	}
	public static void main(String[] args) {
		System.out.println(greateCommonDivisor(3,11));
	}
}
