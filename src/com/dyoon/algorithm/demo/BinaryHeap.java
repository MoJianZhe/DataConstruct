package com.dyoon.algorithm.demo;

import java.util.Arrays;

/**
 *
 * Created by jun on 2017/2/17.
 */
public class BinaryHeap {

    public BinaryHeap() {
        this(DEFAULT_SIZE);
    }

    public BinaryHeap(int count) {
        array = new Comparable[count+1];//将array[0]空着
    }
    private static final int DEFAULT_SIZE=50;
    private  int size;
    Comparable[]array;

    private void insert(Comparable x) {
        array[++size]=x;
        swim(size);

    }

    private void swap(Comparable[] array, int i, int hole) {
        Comparable temp = array[i];
        array[i] = array[hole];
        array[hole] = temp;
    }

    private void swim(int hole) {
        while (hole > 1) {
            if (less(array[hole/2],array[hole])) {
                swap(array, hole / 2, hole);
            }
            hole=hole/2;
        }

    }

    private boolean isFull() {
        return size>=array.length-2;
    }

    private boolean less(Comparable x, Comparable y) {
        return x.compareTo(y)<0;
    }

    private Comparable deleteMax() {
        Comparable max=array[1];
        array[1] = array[size--];//这样只是访问不到，并没有从内存中消除考虑使用array[size]=null;
        array[size+1]=null;
        sink(1);
        return max;

    }

    /**
     * 从hole节点下沉
     * @param hole
     */
    private void sink(int hole) {
 /*    while (hole * 2 <size) { 有两个递归，已经排好了还会再来一次
            if (less(array[hole * 2], array[hole * 2 + 1])) {
                if (less(array[hole], array[hole * 2])) {
                    swap(array, hole * 2 + 1, hole);
                }

                hole=2*hole+1;
                sink(hole);
            } else {
                if (less(array[hole], array[hole * 2])) {
                    swap(array,hole*2,hole);
                }

                hole=2*hole;
                sink(hole);
            }
        }*/

        while (hole * 2 < size) {
            int j=hole*2;
            if (less(array[j], array[j+ 1])) {
                j++;
            }
            if (less(array[hole], array[j])&&j<size) {//有j++所以要判断一下是否超过size
                swap(array,hole,j);
            }
            hole=hole*2;
        }
    }

    /**
     *
     * @param a 要下沉的数组
     * @param k 要下沉的数的下标
     * @param length 数组的长度
     */
    public void sink(Comparable[] a, int k, int length) {
        while (k * 2 < length) {
            int j=k*2;
            if (less(a[j], a[j + 1])) {
                j = j++;
            }
            if (less(a[k], a[j])) {
                swap(a, k, j);
            }
            k=k*2;
        }

    }

    public  void sort(Comparable[] a) {
        int N=a.length;
        for (int i = N/2;i>=1; i++) {
            sink(a, i, N);
        }
        while (N > 1) {
            swap(a,1,N--);
            sink(a, 1, N);
        }
    }


    public static void main(String[] args) {
        int numItems = 20;
        BinaryHeap h = new BinaryHeap(numItems);

/*
        for (int j = 0; j < 7; j++) {
            h.insert(new Integer(((int) (Math.random() * 100))));
        }*/
        h.insert(new Integer(85));
        h.insert(new Integer(82));
        h.insert(new Integer(79));
        h.insert(new Integer(31));
        h.insert(new Integer(37));
        h.insert(new Integer(34));
        h.insert(new Integer(29));

        System.out.println(Arrays.toString(h.array));
        System.out.println(h.array[1]);
        h.deleteMax();
        System.out.println(Arrays.toString(h.array));

    }
}



