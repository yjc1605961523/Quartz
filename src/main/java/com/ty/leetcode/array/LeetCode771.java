package com.ty.leetcode.array;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/10 10:00
 * @description：771. 宝石与石头
 */


/*
 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
*/

public class LeetCode771 {
    @Test
    public  void test(){
        System.out.println(numJewelsInStones1("aZ", "aaabbbccZZDAA"));
    }
    public int numJewelsInStones(String J, String S) {
    int num=0;
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        for (int i = 0; i < j.length; i++) {
            for (int i1 = 0; i1 < s.length; i1++) {
                if (j[i]==s[i1])num++;
            }
        }
        return num;
    }

    public int numJewelsInStones1(String J, String S) {
        int num = 0;
        char[] s = S.toCharArray();
        char[] j = J.toCharArray();

        Set  set=new HashSet();
        for (int i = 0; i <j.length ; i++) {
            set.add(j[i]);
        }
        for (int i = 0; i < s.length; i++) {
            if (set.contains(s[i])) {
                num++;
            }
        }
    return num;
    }
    public int numJewelsInStones2(String J, String S) {
        int jewelsCount = 0;
        Set<Character> jewelsSet = new HashSet<Character>();
        int jewelsLength = J.length(), stonesLength = S.length();
        for (int i = 0; i < jewelsLength; i++) {
            char jewel = J.charAt(i);
            jewelsSet.add(jewel);
        }
        for (int i = 0; i < stonesLength; i++) {
            char stone = S.charAt(i);
            if (jewelsSet.contains(stone)) {
                jewelsCount++;
            }
        }
        return jewelsCount;
    }



}
