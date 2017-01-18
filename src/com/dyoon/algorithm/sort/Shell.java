package com.dyoon.algorithm.sort;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Shell {
    public static void sort(int[] a) {
        int n=a.length;
        int h=1;
        while (h < n / 3) {//获取它的步长
            h=3*h+1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j-h>=0 ; j=j-h) {
                    if (a[j] < a[j - h]) {
                        swap(j,j-h,a);
                    }
                }

            }
            h=h/3;//把默认的有序组的长度缩小
        }
    }

    //交换数组中x和y的值
    public static void swap(int x, int y, int[] a) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) {
        int[] b = {3, 2, 5, 1, 5, 2, 2, 4, 15, 5};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("排序后");
        sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }
    }
}
