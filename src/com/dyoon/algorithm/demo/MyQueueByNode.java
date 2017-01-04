package com.dyoon.algorithm.demo;

import java.util.Stack;

/**
 * Created by Administrator on 2016/10/21.
 * 用链表实现的队列，因为它的进和出，是在不同的口，所以需要两个Node,
 * 而Stack进和出都只在一个门口，所以只需要一个Node
 */
public class MyQueueByNode <Item>{
    private Node first=new Node();
    private Node last=new Node();
    private int size;
    public void push( Item it) {//判断是否为空
/*        if (size == 0) {
            first.item=it;
            first.next=null;
            size++;
        } else if (size == 1) {
            last.item = it;
            first.next = last;
            last.next = null;
            size++;
        } else {
            Node oldLast=last;
            last = new Node();
            last.item=it;
            oldLast.next=last;
            last.next=null;
            size++;
        }*/
     //更好的实现
        last=new Node();
        Node oldNode=last;
        last.item=it;
        last.next=null;
        if (isEmpty()) {
            first = last;
        } else {
            oldNode.next=last;
        }
        size++;
    }


    public Item pop() {
        if (size > 0) {
            Node oldFirst = first;
            first = first.next;
            size--;
            return oldFirst.item;
        } else {
            System.err.println("队列中没有值");
            last=null;
            return  null;
        }

    }

    public boolean isEmpty() {
        return size==0;
    }
    private class Node{
        Item item;
        Node next;
    }

    //删除节点后的节点
    public void removeAfter(Node node) {
        if (node.next == null) {
            return ;
        }
        node.next=node.next.next;
    }
}
