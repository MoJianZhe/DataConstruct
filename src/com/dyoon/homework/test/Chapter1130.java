package com.dyoon.homework.test;

import java.util.Arrays;

/**
 * @author cr
 * ��һ�£�1.1.30��ϰ��
 * ��һ��boolean�͵Ķ�ά���鸳ֵ����i��j���ʵ�ʱ��a[i][j]Ϊtrue
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
//	�������������Լ�����������ͳ��������Լ�����ڳ������̵����Լ��
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
