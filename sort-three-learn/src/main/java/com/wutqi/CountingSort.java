package com.wutqi;

/**
 * 计数排序：计数排序利用数组下标表示数据范围，数组内存储各个数据个数的累加值，并根据该数组来扫描
 * 原数组，找出各个元素在新的有序数组中的位置，从而实现排序。
 * @author wuqi
 * @Date 2018/12/12 22:25
 */
public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1,2,3,4,5};
        arr = countingSort(arr, arr.length);
        for(int value : arr){
            System.out.print(value + " ");
        }

    }

    /**
     * 计数排序，假设数组中存的均为非负整数
     * @param arr 数组
     * @param n 数组长度
     * @return
     */
    public static int[] countingSort(int[] arr,int n){
        if(n <= 1){
            return arr;
        }

        //确定数据范围
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        //按照数据范围申请一个数组，并将各个数据的个数存进数组中
        int[] c = new int[max + 1];
//        for (int i = 0; i <= max; ++i){
//            c[i] = 0;
//        }

        for(int i=0; i<n; i++){
            c[arr[i]]++;
        }
        //将数据个数进行依次累加
        for(int i=1; i<=max; i++){
            c[i] = c[i] + c[i-1];
        }

        //申请一个数组用具存放有序数据，并扫描原数组将数据放进有序数组中
        int[] r = new int[n];
        for(int i=n-1; i>=0; i--){
            //数据在r中的下标
            int index = c[arr[i]]-1;
            r[index] = arr[i];
            //在将数据放到有序数组后，存储的数据个数要减一
            c[arr[i]]--;
        }

        //将有序数组中的元素拷贝到原数组中
        for(int i=0; i<n; i++){
            arr[i] = r[i];
        }

        return arr;
    }
}
