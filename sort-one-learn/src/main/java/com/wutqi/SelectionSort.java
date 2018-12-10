package com.wutqi;

/**
 * 选择排序
 *
 * 选择排序是原地排序
 * 选择排序不是稳定排序，因为他是在为排序的元素中找到最小值将最小值插入到已经排序好的数据末尾，这样会破坏稳定性
 * 选择排序最好、最坏、平均时间复杂度均为O(n²)
 * @author wuqi
 * @Date 2018/12/10 20:34
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1,-1};
        arr = selectSort(arr);
        for(int value : arr){
            System.out.print(value + " ");
        }
    }

    public static int[] selectSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i+1; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }

            if(i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }

}
