package com.ty.leetcode.string;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2021/1/14 13:57
 * @description：水仙花数
 */
public class NumberOfDaffodils {
    public static void main(String[] args) {
       for (int i = 100; i <999999999 ; i++) {
            if (numberOfDaffodils(i)) {

                System.out.println(i);

            }
        }

    }

    public static boolean numberOfDaffodils(int source){
        int s=source;
        int length = String.valueOf(source).length();
        int sumProduct=0;
        while (source > 0) {
            sumProduct+=Math.pow(source%10,length);
            source=source/10;
        }
        return sumProduct==s;
    }

}
