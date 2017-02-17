package com.dyoon.algorithm.demo;



/**
 * 约瑟夫问题：N个人排成一个环，第M个人会被杀死，打印出人们被杀死的顺序
 * 一开始自己是想用线型的数组来解决的，但是发现模型根本不对，解决起来很困难了（还想着求余数，但就没法打印顺序了)
 * Created by jun on 2017/1/4.
 */
public class JosePhus {
    public Node first;
    private class Node{
        public int serialNumber;//人们的编号
        public Node prev;
        public Node next;
    }

    public JosePhus(int personNumber) {
        first=new Node();
        first.serialNumber=0;
        Node flue=first;//流动节点
        for (int i = 1; i < personNumber; i++) {
       /*   这样每次都是新建了两个Node,和原来的连接不上
            Node node=new Node();
            node.serialNumber=i;
            Node next = new Node();
            next.serialNumber=i+1;
            node.next=next;
            next.prev=node;*/
            Node node=new Node();
            node.serialNumber=i;
            flue.next=node;
            node.prev=flue;
            flue=node;
        }
        flue.next=first;//流动节点已流到最后，指向首节点
        first.prev = flue;

    }


    /**
     * 链表定位没有数组方便
     * @param number 出局者的编号
     * @return
     */
    public Node getNodeByNumber(int number) {
        Node node=first;
        if (number == 0) {
            return node;
        }
        for (int i = 0; i < number-1; i++) {
            node=node.next;
        }
        return node;
    }

    /**
     *
     * @param node
     */
    public  void delete(Node node) {
        Node prev=node.prev;
        prev.next=node.next;
        node.next.prev=prev;

    }

    public static void main(String[] args) {
        int personNumber=10;
        int M=2;
        JosePhus josePhus = new JosePhus(10);
        /*
        while (josePhus.first.next.serialNumber!=josePhus.first.serialNumber) {//这样判断的话，first很可能为null
            Node node=josePhus.getNodeByNumber(M);
            System.out.println(node.serialNumber);
            josePhus.delete(node);
        }*/

        Node node=josePhus.first;
        //也可以用node.next!=node来判断，因为=是赋予的地址
        while (node.next.serialNumber != node.serialNumber) {
            //找到出局者，跨越m-1个人
            for (int i = 0; i < M-1; i++) {
                node=node.next;
            }
            System.out.println(node.serialNumber);
            josePhus.delete(node);
            node=node.next;
        }
        System.out.println("存活的人是"+node.serialNumber);

    }
}
