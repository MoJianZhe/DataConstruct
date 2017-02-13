package com.dyoon.algorithm.sort;

/**
 * Created by Administrator on 2017/2/13.
 */
public class QuikSort {

    public static void sort(int[] a,int low,int hight) {
        if(low>=hight) {return;}
        int p = partittion(a, low, hight);
        sort(a,low,p-1);
        sort(a,p+1,hight);
        System.out.println("hello sort");
    }


    /**
     * 将一个数组切分，左边比k小，右边比k大
     * @param a
     * @param low
     * @param hight a数组的最大下标，a.length-1
     * @return
     */
    public static int partittion(int[] a, int low, int hight) {
        int i=low;int j=hight;
        int k = a[low];
        i=i+1;
        while (true) {
            while (a[i] < k) {
                i++;
                System.out.println("hello left");
            }
            while (k < a[j]) {
                j--;

                System.out.println("hllo right");
            }
            //这个判断要在swap的前面，不然，k是最大值得时候，会出现i>j的情况
            if (i >= j) {
                break;
            }
            swap(a,i,j);

        }
        swap(a,low,j);
        return j;

    }

    public static boolean less(int x, int y) {
        return x<y?true:false;
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y]=temp;
    }

    public static void main(String[] args) {
        int[] a = {3, 35, 23, 3, 4, 5};
        System.out.println("hello world");

        sort(a,0,a.length-1);
        System.out.println("排序后");
        for (int i : a) {
            System.out.println(i);

        }
    }

}
