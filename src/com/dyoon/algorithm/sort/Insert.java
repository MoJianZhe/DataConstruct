package com.dyoon.algorithm.sort;

/**
 * 最好的情况需要n-1次比较，0次交换，即它们的顺序已经ok
 * Created by Administrator on 2017/1/11.
 */
public class Insert {
    public static void sort(int[] a) {
        for (int i = 1; i <a.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if (a[j] < a[j-1]) {
                    swap(j,j-1,a);
                }
            }
        }
    }

    public boolean isLess(int a, int b) {
        return a<b;
    }

    //交换a数组中的x和y；
    public static void swap(int x, int y,int[]a) {
        /*
        这样数组里的元素的值并没有发生改变
        System.out.println("invoke swap");
        int temp=x;
        x=y;
        y=temp;*/
        int temp=a[x];
        a[x] = a[y];
        a[y]=temp;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 1, 2, 4, 5,};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        sort(a);
        System.out.println("排序后");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
