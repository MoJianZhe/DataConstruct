package com.dyoon.algorithm.sort;

/**
 * Created by Administrator on 2017/1/16.
 */
public class Merge {


    //将两个有序的子数组归并为一个数组
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
                a[k] = a[i++];
            } else {
                a[k] = a[j++];
            }

        }
    }

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
        sort(b, 0, b.length -1);
        System.out.println("排序后");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }
    }



}
