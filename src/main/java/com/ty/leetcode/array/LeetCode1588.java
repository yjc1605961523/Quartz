package com.ty.leetcode.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/20 11:41
 * @description：所有奇数长度子数组的和
 */
/*给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
子数组 定义为原数组中的一个连续子序列。
请你返回 arr 中 所有奇数长度子数组的和 。*/

public class LeetCode1588 {
    @Test
    public  void test(){
        //1
        //1 1
        //2 2 2
        //2 3 3 2
        //3 4 5 4 3
        //3 5 6 6 5 3
        //4 6 8 8 8 6 4
        //4 7 9 10 10 9 7 4
        //5 8 11 12 13 12 11 8 5
        //5 9 12 14 15 15 14 12 9 5

        List array=new  ArrayList();

        array.add(null);
        System.out.println(array.size());

        sumOddLengthSubarrays(new int[]{1,2,1,1,1,1,1,1,11,1});
    }
    public int sumOddLengthSubarrays(int[] arr) {

        int len = arr.length, res = 0;
        for (int i = 0; i < len; i++) {
            int LeftOdd = (i + 1) / 2;
            int LeftEven = i / 2 + 1;
            int RightOdd = (len - i) / 2;
            int RightEven = (len - 1 - i) / 2 + 1;
            System.out.print(LeftOdd * RightOdd + LeftEven * RightEven);
            res += arr[i] * (LeftOdd * RightOdd + LeftEven * RightEven);
        }

        return res;


    }
}
