package com.dyoon.algorithm.sort;

/**
 * 默认两个数组有序，然后将它们归并
 * Created by Administrator on 2017/1/16.
 */
public class Merge {


    //将两个有序的子数组归并为一个数组

    /**
     *
     * @param a 排序的数组
     * @param low 第一个数组的起始下标
     * @param mid 中间位置
     * @param hight 第二个数组的结束下标
     */
    public static void merge(int[] a, int low, int mid, int hight) {
        int i=low;int j=mid+1;
        int[] aum = new int[hight+1];
        for (int k = low; k <=hight; k++) {//注意，不能是k=0;k<hight;
            aum[k] = a[k];
        }
        for (int k = low; k <=hight; k++) {
            if(i>mid) a[k] = aum[j++];
            else if(j>hight) a[k] = aum[i++];
            else if (aum[i] < aum[j]) {
                a[k] = aum[i++];
            } else {
                a[k] = aum[j++];
            }

        }
    }

    //自顶向下
    public static void sort(int[] a, int low, int high) {
        if(low>=high) return;
        int mid=low+(high-low)/2;
        sort(a,low,mid);
        sort(a,mid+1,high);
        merge(a,low,mid,high);


    }

    public static void main(String[] args) {
        int[] b = {3, 5, 6, 1, 3, 4, 7};
        System.out.println("排序前");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }
//        sort(b, 0, b.length -1);
        sortFromBottom(b);
        System.out.println("排序后");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }
    }

    //自底向上
    public static void sortFromBottom(int[] a) {
        int N=a.length;
        for (int size = 1; size <N ; size=size+size) {//size:排序数组的长度,size从1开始
            //数组的长度依次为：1,2,4......
            for (int low = 0; low < N-size; low=low+size+size) {
                merge(a,low,low+size-1,Math.min(low+size+size-1,N-1));//low+size+size下标可能比a的最大下标要大
            }

        }

    }

}
