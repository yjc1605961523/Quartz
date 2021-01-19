package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/11/4 14:01
 * @description：有效的山脉数组
 * A.length >= 3
 * 在 0 < i < A.length - 1 条件下，存在 i 使得：
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 */
public class LeetCode941 {
    @Test
    public  void test(){

        System.out.println(validMountainArray(new int[]{2,1}));
        int factorial = factorial(9, 0);
        System.out.println(factorial);
    }

    public boolean validMountainArray(int[] A) {
        int l=A.length;
        int index=0;
        while(index+1<l&&A[index]<A[index+1]){
            ++index;
        }
        if (index == 0 || index ==l-1) {
            return false;
        }
        while (index+1<l&&A[index]>A[index+1]){
             ++index;
            System.out.println(index);
        }
        return index==l-1;
    }

    int factorial(int x,int ans)
    {
        if(x==1)
            return  ans;
        factorial(x-1,ans*x);
        return 0;
    }
    }

