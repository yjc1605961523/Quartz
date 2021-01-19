package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/13 15:22
 * @description：整数的各位积和之差
 */
//给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
public class LeetCode1281 {
    @Test
    public  void test(){

      System.out.println(subtractProductAndSum(705));
    }
    public int subtractProductAndSum(int n) {
        int hh=1;
        int num=0;
        while (n > 0) {
           int i=n%10;
           hh*=i;
           num+=i;
            n/=10;
        }
        return hh-num;
    }
}
