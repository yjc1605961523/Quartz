package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/11/3 18:09
 * @description：将数字变成 0 的操作次数
 */
public class LeetCode1342 {
    @Test
    public  void test(){

        System.out.println(numberOfSteps(123));

    }
    int a=0;
    public int numberOfSteps (int num) {
        if (num==0)return a;
          num=(num&1)==0?num>>1:--num;
         ++a;
        numberOfSteps(num);
        return a;
    }
}
