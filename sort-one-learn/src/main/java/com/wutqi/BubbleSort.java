package com.wutqi;

/**
 * 冒泡排序
 *
 * 1.冒泡排序是原地排序（不消耗额外的内存空间）
 * 2.冒泡排序是稳定的排序（相同的元素不会交换位置）
 * 3.最好时间复杂度为：O(n)，最坏时间复杂度为：O(n²)，平均时间复杂度为O(n²)
 * 一组数据有序度最好为n(n-1)/2，最坏为0。数据交换一次有序度-1，所以按照平均交换次数来算，平均时间复杂度为n(n-1)/4，比较次数肯定比交换次数多，所以
 * 衡量下来平均时间复杂度为O(n²)
 *
 * 插入排序比冒泡排序更受欢迎，因为冒泡排序和插入排序都是原地排序，是稳定排序，最好、最坏、平均时间复杂度相同。但是
 * 冒泡排序交换的操作比插入排序交换的操作多了几个赋值语句，在数量较大时，性能会比较低下。
 * @author wuqi
 * @Date 2018/12/10 12:30
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,2,2,89,7};
        arr = bubbleSort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }


    public static int[] bubbleSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        boolean positionSwap = true;

        for(int i=0 ; i<arr.length; i++){
            //如果上一次没有发生元素位置交换，表示已经为有序数组，不需要再排序
            if(!positionSwap){
                break;
            }
            positionSwap = false;
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    positionSwap = true;
                }
            }
        }

        return arr;
    }

}
