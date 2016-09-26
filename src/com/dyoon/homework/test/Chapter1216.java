package com.dyoon.homework.test;

/**
 * @author Administrator
 * ʵ��һ���������ĳ����������ͣ�ʵ�ּӼ��˳��Ĳ�����ʵ�ֱȽϵĲ���
 */
public class Chapter1216 {
	private long numerat;//����
	private long deno;//��ĸ
	
	public Chapter1216(long numerator,long denominator){
		if(denominator==0){
			throw new RuntimeException("��ĸ����Ϊ0");
		}
		this.numerat=numerator;
		this.deno=denominator;
	}

	public long getNumerat() {
		return numerat;
	}

	public void setNumerat(long numerat) {
		this.numerat = numerat;
	}

	public long getDeno() {
		return deno;
	}

	public void setDeno(long deno) {
		this.deno = deno;
	}
	public Chapter1216 add(Chapter1216 x){
		if(x.getNumerat()==0){
			return this;//���x�ķ���Ϊ0������y
		}
		if(this.numerat==0){
			return x;
		}
		
		long deno=lowerstCommonMultip(this.deno, x.getDeno());
		long num=this.numerat*(deno/this.deno)+x.getNumerat()*(deno/x.getDeno());
		return new Chapter1216(num,deno);
	}
	//������������С������
	public long lowerstCommonMultip(long x,long y){
		long bestCommonDivisor=greatCommonDivisor(x, y);
		return bestCommonDivisor*(x/bestCommonDivisor)*(y/bestCommonDivisor);

	}
	//�������������Լ��
	public long greatCommonDivisor(long x,long y){
		if(x<y){
			long temp=0;
			temp=x;x=y;y=temp;
		}
		while(x%y!=0){
			long c=x%y;
			x=y;y=c;
		}
		return y;
	}

	@Override
	public String toString() {
		return this.numerat+"/"+this.deno;
	}
	
}
