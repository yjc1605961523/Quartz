package com.ty.leetcode.array;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RepeatTest {
    //在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
    public static int findRepeatNumber(int[] nums) {
      int temp;
        for(int i=0;i<nums.length;i++){
            while (nums[i]!=i){
                System.out.println(Arrays.toString(nums));
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return -1;

    }
    //给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
    //对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有最多的糖果。注意，允许有多个孩子同时拥有最多的糖果数目。
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list=new ArrayList<>(candies.length);
        //取出数值中的最大值,加上extraCandies之后不大于这个最大值就为false
        int max=0;
        for (int i = 0; i <candies.length; i++) {
            if (candies[i]>max) {
                max = candies[i];
            }
        }
        for (int i = 0; i <candies.length; i++) {
            if (candies[i]+extraCandies>=max) {
                list.add(true);
            }else{
                list.add(false);
            }


        }
        return list;

    }
    public static void main(String[] args) {
        int [] nums={2,3,5,1,3};
        System.out.println( kidsWithCandies(nums,3));
    }
}
