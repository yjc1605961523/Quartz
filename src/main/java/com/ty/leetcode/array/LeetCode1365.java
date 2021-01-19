package com.ty.leetcode.array;

import org.junit.Test;

import static com.ty.sort.QuickSort.qsort;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/11/3 14:45
 * @description：有多少小于当前数字的数字
 */
public class LeetCode1365 {

    /**
     * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
     * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
     */
    @Test
    public void test() {
        int[] ints = smallerNumbersThanCurrent(new int[]{2, 3, 5, 12, 6});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a = new int[nums.length];
       for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (nums[i]>nums[i1])++a[i];
            }
        }
        // 统计出现频率 frequency
        int[] freq = new int[101]; // 索引即数值
        for (int num : nums) freq[num]++;

        // 对频率(而非对原数组nums)从前到后累加
        for (int i = 1; i < freq.length; i++) {
            freq[i] = freq[i] + freq[i - 1];
        }

        // 输出结果
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            if (nums[i] > 0) res[i] = freq[nums[i] - 1];
        }
        return res;


    }
}
