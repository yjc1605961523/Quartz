package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/10 9:35
 * @description：LCP 01. 猜数字
 */
public class LeetCodeLCP01 {
    @Test
    public  void test(){
        int [] guess={1,2,3};
        int [] answer={1,2,2};
        System.out.println(game(guess, answer));
    }

    public int game(int[] guess, int[] answer) {
        int count=0;
        for (int i = 0; i < answer.length; i++) {
            if (guess[i]==answer[i])count++;
        }
        return count;
    }
}
