package com.wutqi;

/**
 * 查找第一个等于和最后一个等于目标元素的位置
 * @author wuqi
 * @Date 2018/12/15 11:05
 */
public class BinarySearchTwo {

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,5,6,11};
        int value = 2;

        int first = getFirstIndex(arr,0,arr.length - 1, value);
        int last = getLastIndex(arr,0,arr.length - 1, value);
        System.out.println(first + "-->" + last);
    }

    /**
     * 查找最后一个等于指定元素的位置
     * @param arr
     * @param min
     * @param max
     * @param value
     * @return
     */
    private static int getLastIndex(int[] arr, int min, int max, int value) {
        while (min <= max){
            int mid = (min + max) >> 1;
            if(arr[mid] == value){
                if(mid == arr.length - 1 || (arr[mid + 1]) != value){
                    return mid;
                }

                min = mid + 1;
            } else if(arr[mid] < value){
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;
    }

    /**
     * 元素第一次出现的位置
     * @param arr
     * @param min
     * @param max
     * @param value
     * @return
     */
    private static int getFirstIndex(int[] arr, int min, int max ,int value) {
        while (min <= max){
            int mid = (min + max) >> 1;
            if(arr[mid] == value){
                //当查找到第一个元素或者该元素前的元素不等于给定值时直接返回
                if(mid == 0 || (arr[mid - 1]) != value){
                    return mid;
                }

                max = mid - 1;
             } else if(arr[mid] < value){
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;

    }

//    private static int[] getIndex(int[] arr, int value) {
//        int[] indexArr = {-1,-1};
//
//        if(arr.length < 1){
//            System.out.println("数组为空");
//            return null;
//        }
//
//        if(arr.length < 2){
//            if(arr[0] == value){
//                return new int[]{0,0};
//            }
//        }
//
//        indexArr = getEleIndex(arr,indexArr,0,arr.length - 1, value);
//
//        return indexArr;
//    }
//
//    /**
//     *
//     * @param arr 查找的数组
//     * @param indexArr 存储元素第一次出现的位置和最后一次出现的位置
//     * @param p 第一个元素
//     * @param r 最后一个元素
//     * @param value 要查找的元素
//     * @return
//     */
//    private static int[] getEleIndex(int[] arr, int[] indexArr, int p, int r, int value) {
//        if(p > r){
//            return indexArr;
//        }
//
//
//        int q = (p + r) >> 1;
//
//        if(arr[q] == value){
//            //第一次找到目标元素，将元素的下标存储起来
//            if(indexArr[0] == -1){
//                indexArr[0] = q;
//                indexArr[1] = q;
//            } else {
//                //再次找到目标元素时，比较indexArr中存储的角标，小于最小角标则将其存为最小角标
//                if(q < indexArr[0]){
//                    indexArr[0] = q;
//                }
//
//                //大于最大角标将其存为最大角标
//                if(q > indexArr[1]){
//                    indexArr[1] = q;
//                }
//            }
//        }
//
//        indexArr = getEleIndex(arr, indexArr, p, q - 1, value);
//        indexArr = getEleIndex(arr, indexArr, q + 1, r, value);
//
//        return indexArr;
//    }
}
