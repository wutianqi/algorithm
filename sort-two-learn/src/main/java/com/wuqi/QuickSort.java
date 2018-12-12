package com.wuqi;

/**
 * 快速排序
 *
 * 快速排序递归公式：quickSort(p...r) = quick(p...q-1) + quick(q+1...r) + pivot(p...r)
 * 教程上是quickSort(p...r) = quick(p...q-1) + quick(q+1...r)。但是严格上来说应该算上求解分区点
 *
 * @author wuqi
 * @Date 2018/12/11 20:15
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1,2,6,1};
        arr = quickSort(arr,0,arr.length-1);
        for(int value : arr){
            System.out.print(value + " ");
        }
    }

    public static int[] quickSort(int[] arr,int p,int r){
        if(p >= r){
            return arr;
        }

        //获取分区点
        int q = pivot(arr,p,r);
        arr = quickSort(arr,p,q -1);
        arr = quickSort(arr,q+1,r);

        return arr;
    }


    private static int pivot(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;
        int j = i;
        for(;j < r;j++){
            if(arr[j] < pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[r];
        arr[r] = arr[i];
        arr[i] = temp;


        return i;

    }


}
