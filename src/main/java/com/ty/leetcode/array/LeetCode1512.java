package com.ty.leetcode.array;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/13 10:47
 * @description：好数对的数目
 */

   /*     给你一个整数数组 nums
        如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
        返回好数对的数目。*/

public class LeetCode1512 {
    @Test
    public  void test(){

        System.out.println(numIdenticalPairs2(new int[]{1, 2, 3, 1, 1, 3}));
    }
/*    012345 12345
    12345 2345
    2345 345
    345 45
    45 5*/
    public int numIdenticalPairs(int[] nums) {
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]&&i < j)num++;
            }
        }
        return num;
    }
    public int numIdenticalPairs1(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int v = entry.getValue();
            ans += v * (v - 1) / 2;
        }
        return ans;

    }

    public int numIdenticalPairs2(int[] nums) {
        int ans = 0;
        //因为 1<= nums[i] <= 100  所以申请大小为100的数组
        //temp用来记录num的个数
        int[] temp = new int[100];
        for (int num : nums) {

          /*  //这行代码可以写成
            System.out.print(ans += temp[num - 1]);
            System.out.print("==");
            System.out.println(temp[num - 1]++);
*/
            ans += temp[num - 1]++;
        }
        return ans;

    }



}
