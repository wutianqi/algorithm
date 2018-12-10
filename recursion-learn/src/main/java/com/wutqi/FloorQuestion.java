package com.wutqi;

import java.time.Instant;

/**
 * 上台阶问题。有n节楼梯，可以一次走1节或2节。问一共有几种走法
 *  第一次肯定走1节或2节。走n节楼楼梯的走法为f(n) = f(n-1) + f(n-2)。
 *  终止条件为n=1，有一种走法，n=2有两种走法。
 * @author wuqi
 * @Date 2018/12/9 17:24
 */
public class FloorQuestion {
    public static void main(String[] args) {
        int n = 40;
        long t1 = System.currentTimeMillis();
        int method = recursion(n);
        long t2 = System.currentTimeMillis();
        System.out.println("method = " + method + "，递归耗时" + (t2 - t1) + "ms");
        method = notRecursion(n);
        System.out.println("method = " + method + "，循环耗时" + (System.currentTimeMillis() - t2) + "ms");
    }

    private static int notRecursion(int n) {
        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        int ret = 0;
        //n-1
        int pre = 2;
        //n-2
        int prepre = 1;
        for(int i = 3; i <=n; i++){
            ret = pre + prepre;
            prepre = pre;
            pre = ret;
        }

        return ret;
    }

    private static int recursion(int n) {
        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        return recursion(n-1) + recursion(n-2);
    }


}
