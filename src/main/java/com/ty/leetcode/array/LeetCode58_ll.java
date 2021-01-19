package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/20 11:01
 * @description：
 */
/*
字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
*/
public class LeetCode58_ll {
    @Test
    public  void test(){
        System.out.println(reverseLeftWords("asdfghjkl", 5));
    }


    public String reverseLeftWords(String s, int n) {
        String res = "";
        for(int i = n; i < n + s.length(); i++)
            res += s.charAt(i % s.length());
        return res;
//        return  new StringBuilder(s.substring(n)).append(s.substring(0,n)).toString();

    }
}
