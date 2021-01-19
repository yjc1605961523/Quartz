package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/9/22 19:06
 * @description：重新排列数组
 */
/*
*给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
提示：
1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3*
* *
执行用时：
0 ms
100.00%
内存消耗：
39.1 MB
31.74%
/
 */
public class LeetCode1470 {

    @Test
    public void a(){
        //235417
        //24571936
     int [] nums = {2,5,1,3,4,7,9,6};
        int[] shuffle = shuffle(nums, 4);
        for (int i = 0; i < shuffle.length; i++) {
            System.out.println(shuffle[i]);
        }
    }

    public int[] shuffle(int[] nums, int n) {
        int[] nums1 = new int[2 * n];
        int a=0;
        for (int i = 0; i < n; i++) {
                nums1[a++] = nums[i];
                nums1[a++] = nums[i + n];
        }
        return nums1;
    }

}
