package com.dyoon.algorithm.demo;


import java.util.Iterator;

/**
 * @author Administrator
 * 用数组实现的栈，动态数组，push,pop时，若数组过小或过大，改变数组
 * @param <Item>

 */

public class MyStack <Item> implements Iterable<Item>{
	private Item[]items;
	private int size=0;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	@SuppressWarnings("unchecked")
	public MyStack(int length){
		items=(Item[]) new Object[length];
	}
	public void push(Item str){
		//如果数组太小，就扩大一倍
		if(size==items.length){
			reSize(2*items.length);
		}
		items[size]=str;
		size++;
	}
	public Item  pop(){
		//如果数组太大，就减半
		if(size<=(1/4)*items.length){
			reSize(items.length/2);
		}
		if(items!=null){
			Item temp=items[size-1];//size��push()��ͻ��1��ʵ����string[size]��û��ֵ
			items[size]=null;
			size=size-1;
			return temp;
		}else {
			System.out.println("调整数组的大小");
			return null;
		}
	}
	public boolean isEmpty(){
		return size==0;
	}
	//栈中没有值
	public void reSize(int newLenth){
		Item[]temp=(Item[]) new Object[newLenth];
		for(int i=0;i<items.length;i++){
			temp[i]=items[i];
		}
		items=temp;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ReverseIterator(); 
	}
	private class ReverseIterator implements Iterator<Item>{
		private int i=size;
		@Override
		public boolean hasNext() {
			return i>0;
		}
		@Override
		public Item next() {
			return  items[--i]; //受push后加1的影响
		}
		@Override
		public void remove() {
			
		}
		
	}
	
}

