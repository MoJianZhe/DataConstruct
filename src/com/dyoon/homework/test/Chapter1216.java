package com.dyoon.homework.test;

/**
 * @author Administrator
*  为1.2.16的练习题
 * 实现一个有理数的抽象数据类型，实现加减乘除的操作，实现比较的操作
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
	//����ļӷ�
	public Chapter1216 add(Chapter1216 x){
		if(x.getNumerat()==0){
			return this;//���x�ķ���Ϊ0������y
		}
		if(this.numerat==0){
			return x;
		}
		
		long deno=lowerstCommonMultip(this.deno, x.getDeno());
		long num=this.numerat*(deno/this.deno)+x.getNumerat()*(deno/x.getDeno());
		if(!isRelativelyPrime(deno, num)){//������ӣ���ĸ�����ʣ���Լ��(�������Լ��)
			long temporary=greatCommonDivisor(deno, num);//������ʱ����deno/numera�Ͳ��ȶ�
			deno=deno/temporary;
			num=num/temporary;
		}
		return new Chapter1216(num,deno);
	}
	//�������ļ���
	public Chapter1216 subtraction (Chapter1216 x){
		long deno=lowerstCommonMultip(x.getDeno(), this.deno);
		long numera=this.numerat*(deno/this.deno)-x.getNumerat()*(deno/x.getDeno());
		if(!isRelativelyPrime(deno, numera)){//������ӣ���ĸ�����ʣ���Լ��(�������Լ��)
			long temporary=greatCommonDivisor(deno, numera);//������ʱ����deno/numera�Ͳ��ȶ�
			deno=deno/temporary;
			numera=numera/temporary;
		}
		return new Chapter1216(numera,deno);
	}
	
	//�������ĳ˷�
	public Chapter1216 multip(Chapter1216 x){
		long numera=this.numerat*x.getNumerat();
		long deno=this.deno*x.getDeno();
		if(!isRelativelyPrime(deno, numera)){//������ӣ���ĸ�����ʣ���Լ��(�������Լ��)
			long temporary=greatCommonDivisor(deno, numera);//������ʱ����deno/numera�Ͳ��ȶ�
			deno=deno/temporary;
			numera=numera/temporary;
		}
		return new Chapter1216(numera,deno);
	}
	public Chapter1216 divice(Chapter1216 x){
		long numera=this.numerat*x.getDeno();
		long deno=this.deno*x.getNumerat();
		if(!isRelativelyPrime(numera, deno)){
			long temporary=greatCommonDivisor(deno, numera);
			deno=deno/temporary;
			numera=numera/temporary;
		}
		return new Chapter1216(numera,deno);
	}
	
	//������������С������
	public long lowerstCommonMultip(long x,long y){
		long bestCommonDivisor=greatCommonDivisor(x, y);
		return bestCommonDivisor*(x/bestCommonDivisor)*(y/bestCommonDivisor);

	}
	//获取最大公约数
	public long greatCommonDivisor(long x,long y){
		if(x==y){
			return y;
		}
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
	//是否互质
	public boolean isRelativelyPrime(long x,long y){
		if(x==y){
			return false;
		}
		if(greatCommonDivisor(x,y)==1){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public String toString() {
		return this.numerat+"/"+this.deno;
	}
	
}
