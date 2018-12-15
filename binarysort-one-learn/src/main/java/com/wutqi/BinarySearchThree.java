package com.wutqi;

/**
 * @author wuqi
 * @Date 2018/12/15 12:10
 */
public class BinarySearchThree {

    public static void main(String[] args) {
        int[] arr = {11,13,16,16,17,17,19,122,152};
        int value = 15;
        int index = getFirstBig(arr,0, arr.length -1,value);
        int index2 = getLastMin(arr,0, arr.length -1,value);
        System.out.println(index + "-->" + index2);
    }

    /**
     * 获取最后一个小于等于目标元素的位置
     * @param arr
     * @param min
     * @param max
     * @param value
     * @return
     */
    private static int getLastMin(int[] arr, int min, int max, int value) {
        while (min <= max){
            int mid = (min + max) >> 1;
            if(arr[mid] <= value){
                //当到最后一个元素或者后一个元素大于给定值时返回
                if(mid == arr.length - 1 || arr[mid + 1] > value){
                    return mid;
                }
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;

    }

    /**
     * 获取第一个大于等于目标元素的位置
     * @param arr
     * @param min
     * @param max
     * @param value
     * @return
     */
    private static int getFirstBig(int[] arr, int min, int max,int value) {
        while (min <= max){
            int mid = (min + max) >> 1;
            if(arr[mid] < value){
                min = mid + 1;
            } else {
                if(mid == 0 || (arr[mid - 1]) < value){
                    return mid;
                }
                max = mid - 1;
            }
        }
        return -1;

    }
}
