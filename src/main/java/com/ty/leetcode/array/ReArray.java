package com.ty.leetcode.array;

public class ReArray {
    public static int[] shuffle(int[] nums, int n) {
        int [] array=new int[nums.length];
        for (int i = 0; i <n; i++) {
            array[i]=nums[i];
            array[i]=nums[i+n];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(array[i]);
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums={2,5,1,3,4,7};
        shuffle(nums,3);
      /*  for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/
    }
}
