package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/11/4 9:47
 * @description：. 统计位数为偶数的数字
 */
public class LeetCode1295 {
    @Test
    public  void test(){
        System.out.println(findNumbers(new int[]{2132,2312,4121,531,1234,12,4321}));
    }
    public int findNumbers(int[] nums) {

        int k=0;
        for (int i = 0; i < nums.length; i++) {
            int j=1;
            while (nums[i]>=10){
                ++j;
                nums[i]=nums[i]/10;
            }
            if ((j&1)==0)++k;
        }
        return k;
    }
}
