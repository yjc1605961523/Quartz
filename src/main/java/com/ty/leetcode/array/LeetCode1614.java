package com.ty.leetcode.array;

import org.junit.Test;

import java.util.Stack;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/11/3 16:28
 * @description：括号的最大嵌套深度
 */
public class LeetCode1614 {
    @Test
    public void test() {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
    public int maxDepth(String s) {

 /*       Stack st = new Stack();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar=='(')st.push(aChar);
            if (aChar==')')st.pop();
            max=Math.max(st.size(),max);
        }

       return max;*/
        int max=0,left=0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar=='('){left++;
                if (left>max)max=left;}
            if (aChar==')')left--;

        }
        return max;
    }
}
