package com.ty.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/11/4 10:22
 * @description：1450. 在既定时间做作业的学生人数
 */
public class LeetCode1450 {

    @Test
    public void test(){
        System.out.println(busyStudent(new int[]{1, 2, 3}, new int[]{2, 3, 7}, 4));

    }
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int a=0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime>=startTime[i]&&queryTime<=endTime[i]){
            }
        }
        return a;
    }
    public int busyStudent1(int[] startTime, int[] endTime, int queryTime) {
        BIT bit = new BIT(1000);
        int n = startTime.length;
        for (int i = 0; i < n; i++) {
            bit.update(startTime[i], 1);
            bit.update(endTime[i] + 1, -1);
        }
        return bit.getPrefix(queryTime);
    }

    class BIT {
        int[] bit;
        int n;

        public BIT(int n) {
            this.n = n + 1;
            bit = new int[this.n];
        }

        public int lowBit(int i) {
            return i & (-i);
        }

        public void update(int i, int val) {
            while (i < n) {
                bit[i] += val;
                i += lowBit(i);
            }
        }

        public int getPrefix(int i) {
            int sum = 0;
            while (i > 0) {
                sum += bit[i];
                i -= lowBit(i);
            }
            return sum;
        }
    }

}
