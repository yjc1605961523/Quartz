package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/13 16:18
 * @description：拿硬币
 */

//桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
public class LeetCodeLCP06 {
    @Test
    public  void test(){
        System.out.println(5 / 2 == 5 >> 1);
        System.out.println(minCount(new int[]{5, 1, 1}));
    }
    public int minCount(int[] coins) {
        int count=0;
        for (int i = 0; i < coins.length; i++) {
           count+=coins[i]%2==0?(coins[i]>>1):(coins[i]>>1)+1;
        }
        return count;

    }
}
