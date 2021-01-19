package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/10 10:30
 * @description：数组异或操作
 */

/*
        给你两个整数，n 和 start 。
        数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
        请返回 nums 中所有元素按位异或（XOR）后得到的结果。
*/

public class LeetCode1486 {
    @Test
    public void test(){
        System.out.println(xorOperation(10, 5));


    }
    public int xorOperation(int n, int start) {
        int num=0;
        for (int i = 0; i < n; i++) {
            num^=start+2*i;
        }
        return num;
    }
}
