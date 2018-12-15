package com.wutqi;

/**
 * 二分查找
 * @author wuqi
 * @Date 2018/12/14 12:45
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,11,22,33};
//        int value = binarySearch(arr,1);//7
        int value = binarySearch_recursive(arr,0, arr.length - 1,4);
        System.out.println(value);
    }

    /**
     * 非递归实现
     * @param arr
     * @param value
     * @return
     */
    public static int binarySearch(int[] arr,int value){
        int min = 0;
        int max = arr.length - 1;

        while(min <= max){
            int mid = min + ((max - min) >> 1);

            if(arr[mid] == value){
                return mid;
            }

            if(arr[mid] > value){
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return -1;
    }

    /**
     * 递归实现二分查找
     * @param arr
     * @param value
     * @return
     */
    public static int binarySearch_recursive(int[] arr, int min, int max, int value){
        if(min > max){
            return -1;
        }

        int mid = min + ((max - min) >> 1);
        if(arr[mid] == value){
            return mid;
        }

        if(arr[mid] > value){
            max = mid -1;
        } else {
            min = mid + 1;
        }

        return   binarySearch_recursive(arr,min,max,value);
    }
}
