package com.wuqi;

/**
 * 归并排序：将数数据从中间分成两组，分别对两组进行排序，然后将排序好的两组数据进行合并。
 * 归并排序不是原地排序
 * 归并排序是稳定排序（建立在前半部和后半部分对比，值相同的情况下，将前半部的数据存入数组中）
 * 归并排序的时间复杂度均为O(nlogn)
 * 归并排序的空间复杂度为O(n)，因为每次合并申请的内存空间都会被释放，所以应该算每次合并时的空间复杂度。
 * @author wuqi
 * @Date 2018/12/11 9:46
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1,9,7};
        arr = mergeSort(arr,0,arr.length - 1);
        for(int value : arr){
            System.out.print(value + " ");
        }
    }

    /**
     * 归并排序
     * @param arr
     * @param p 头角标
     * @param r 尾角标
     * @return
     */
    public static int[] mergeSort(int[] arr, int p, int r){
        //当只有一个元素时，则不需要切分
        if(p >= r){
            return arr;
        }

        int q = (p + r) / 2;

        //对数组前半部分排序
        arr = mergeSort(arr,p,q);
        //对数组后半部分排序
        arr = mergeSort(arr,q+1,r);
        //将数组前半部和后半部合并起来
        arr = merge(arr,p,q,r);

        return arr;

    }

    /**
     *
     * @param arr
     * @param p
     * @param q
     * @param r
     * @return
     */
    private static int[] merge(int[] arr, int p, int q, int r) {
        //i为数组前半部分第一个元素角标
        int i = p;
        //j为数组后半部分第一个元素角标
        int j = q + 1;
        //申请一个和数组大小相等的临时数组，用来存储排序后的元素
        int[] temp = new int[r+1];
        //指向临时数组的第一个元素
        int k = 0;

        while (i <= q && j <= r){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        //判断是i到末尾还是j到末尾
        int start = i, end = q;
        if(j <= r){
            start = j;
            end = r;
        }

        //将剩余元素放入临时数组中
        for(;start <= end;start++){
            temp[k++] = arr[start];
        }

        //将临时数组中的数据拷贝到原数组中
        for(int n = 0;p<=r;p++){
            arr[p] = temp[n++];
        }

        return arr;

    }
}
