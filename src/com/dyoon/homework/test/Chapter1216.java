package com.dyoon.homework.test;

/**
 * @author Administrator
 * 实现一个有理数的抽象数据类型，实现加减乘除的操作，实现比较的操作
 */
public class Chapter1216 {
	private long numerat;//分子
	private long deno;//分母
	
	public Chapter1216(long numerator,long denominator){
		if(denominator==0){
			throw new RuntimeException("分母不能为0");
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
			return this;//如果x的分子为0；返回y
		}
		if(this.numerat==0){
			return x;
		}
		
		long deno=lowerstCommonMultip(this.deno, x.getDeno());
		long num=this.numerat*(deno/this.deno)+x.getNumerat()*(deno/x.getDeno());
		return new Chapter1216(num,deno);
	}
	//求两个数的最小公倍数
	public long lowerstCommonMultip(long x,long y){
		long bestCommonDivisor=greatCommonDivisor(x, y);
		return bestCommonDivisor*(x/bestCommonDivisor)*(y/bestCommonDivisor);

	}
	//求两个数的最大公约数
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
