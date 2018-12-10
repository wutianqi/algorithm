package com.wutqi;

/**
 * 插入排序
 *
 * 插入排序是原地排序
 * 插入排序是稳定排序
 * 插入排序最好时间复杂度为O(n)，最坏时间复杂度为O(n²)，平均时间复杂度为O(n²)。
 * 每次插入操作都相当于在数组中插入一个元素，所以插入的时间复杂度为O(n)，平均时间复杂度就为O(n²)
 *
 * @author wuqi
 * @Date 2018/12/10 19:46
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,3,2,1};
        arr = insertionSort(arr);
        for(int value : arr){
            System.out.print(value + " ");
        }


        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

            }
        }
    }

    public static int[] insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int value = arr[i];
            int j = i-1;
            for(; j >=0; j--){
                //前一个元素大于后一个元素，交换位置
                if(arr[j] > value){
                    arr[j + 1] = arr[j];
                } else {
                    //前一个元素不大于后一个元素，则不用再往下比较了
                    break;
                }
            }

            arr[j+1] = value;
        }

        return arr;
    }
}
