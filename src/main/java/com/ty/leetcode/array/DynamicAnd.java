package com.ty.leetcode.array;

public class DynamicAnd {
    public static int[] runningSum(int[] nums) {
        // 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
        // 请返回 nums 的动态和。
     /*   int [] a=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i]=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k <i; k++) {
                nums[i]+=a[k];
            }
        }*/
        for (int i = 1; i <nums.length; i++) {
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7};
        runningSum(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
