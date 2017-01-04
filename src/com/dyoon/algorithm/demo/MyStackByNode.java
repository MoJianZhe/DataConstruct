package com.dyoon.algorithm.demo;

import java.util.Iterator;

/**
 * @author Administrator
 * 链表实现的栈
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class MyStackByNode <Item> {
	private Node first;//栈顶
	private int size;
	
	private class Node{
		public  Item item;
		public 	Node next;
	}
	public Item pop(){
		if(size>0){
			size--;
			Item it=first.item;
			first=first.next;
			return first.item;
		}else {
			System.err.println("没有数据");
			return null;
		}
	}
	public void push(Item newItem){
		Node oldFirst=first;
		first=new Node();
		first.item=newItem;
		first.next=oldFirst; 
		size++;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public int getSize(){
		return size;
	}

/*	public Iterator<Item> iterator() {
		Iterator iterator=new Iterator<Item>() {
			int i=size;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return i>0;
			}

			@Override
			public Item next() {
				
				return first.next.item;
			}

			@Override
			public void remove() {
				
			}
		};
		return iterator;
	}
	
*/
}
