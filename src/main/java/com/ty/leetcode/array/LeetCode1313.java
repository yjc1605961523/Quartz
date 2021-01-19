package com.ty.leetcode.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/13 16:39
 * @description：解压缩编码列表
 */


/*给你一个以行程长度编码压缩的整数列表 nums
考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ）,
每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。*/
public class LeetCode1313 {
    @Test
    public  void test(){

        int[] ints = decompressRLElist(new int[]{1, 2, 3, 4});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public int[] decompressRLElist(int[] nums) {
        int k=0;
        for (int i = 0; i < nums.length; i+=2) {
                k+=nums[i];
        }
        int [] newnums=new int[k];
        k=0;
        for (int i = 0; i <nums.length ; i+=2) {
            for (int i1 = 0; i1 < nums[i]; i1++,k++) {
                newnums[k]=nums[i+1];
            }
        }
        return newnums;
    }
}
