package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/9 9:38
 * @description：867. 转置矩阵
 */

/*给定一个矩阵 A， 返回 A 的转置矩阵。
 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。*/
public class LeetCode867 {
    public int[][] transpose(int[][] A) {
        int  [][] b = new int [A[0].length][A.length];
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j <A[i].length ; j++) {
                b[j][i]=A[i][j];
            }
        }
    return b;
    }
    @Test
    public void test(){
        int [][] A={{1,2,3},{4,5,6}};
        transpose(A);


    }
}
