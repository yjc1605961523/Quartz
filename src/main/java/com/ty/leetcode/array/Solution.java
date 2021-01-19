package com.ty.leetcode.array;

import java.util.HashMap;

public class Solution {
  /* public static int[] twoSum(int[] nums, int target) {
    int[] indexs = new int[2];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                indexs[0]=i;
                indexs[1]=j;

                }
            }

        }
       return indexs;
    }
*/
  public  static int[] twoSum(int[] nums, int target){
         int[] indexs = new int[2];

         // 建立k-v ，一一对应的哈希表
         HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
         for (int i = 0; i < nums.length; i++) {
             if (hash.containsKey(nums[i])) {
                 indexs[0] = i;
                 indexs[1] = hash.get(nums[i]);
                 return indexs;
             }
             // 将数据存入 key为补数 ，value为下标
             hash.put(target - nums[i], i);
         }

         return indexs;
     }
    public static void main(String[] args) {
       int [] nums = {3, 2, 4};
       int target = 6;
        int[] ints = twoSum(nums, target);
        for (int i:ints)
            System.out.println(i);
    }
}
