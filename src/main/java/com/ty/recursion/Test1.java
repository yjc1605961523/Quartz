package com.ty.recursion;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/11/5 10:24
 * @description：
 */
public class Test1 {

    @Test
    public void test(){
        System.out.println(optimizeFibonacci(1,1,5));
        System.out.println(b(5));
    }
    //阶乘
    public  long f(int n){
        if (n==1)
            return 1;
        return n*f(--n);
    }
    //斐波那契数列
    public long b(int n){
        if (n==1||n==2)return n;
        return b(n-1)+b(n-2);
    }

    public static int optimizeFibonacci(int first, int second, int n) {
        if (n > 0) {
            if(n == 1){    // 递归终止条件
                return first;       // 简单情景
            }else if(n == 2){            // 递归终止条件
                return second;      // 简单情景
            }else if (n == 3) {         // 递归终止条件
                return first + second;      // 简单情景
            }
            return optimizeFibonacci(second, first + second, n - 1);  // 相同重复逻辑，缩小问题规模
        }
        return -1;
    }

    @Test
    public void test1(){

    }
}
