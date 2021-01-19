package com.ty.leetcode.array;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/14 17:48
 * @description：查找常用字符
 */
//给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。

public class LeetCode1002 {
    @Test
    public  void test(){

        commonChars(new String[]{"bella","label","roller"});
    }

    public List<String> commonChars(String[] A) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            int[] sum = new int[26];
            char[] chars = A[i].toCharArray();
            for (int i1 = 0; i1 < chars.length; i1++) {
                ++sum[chars[i1] - 'a'];
            }
            for (int i1 = 0; i1 < 26; i1++) {
                minfreq[i1] = Math.min(minfreq[i1], sum[i1]);
            }
        }
        for (int i = 0; i < minfreq.length; i++) {
            if (minfreq[i] > 0) {
                for (int i1 = 0; i1 < minfreq[i]; i1++) {
                    list.add(String.valueOf((char) (i + 'a')));
                }
            }

        }
        return list;
    }

}
