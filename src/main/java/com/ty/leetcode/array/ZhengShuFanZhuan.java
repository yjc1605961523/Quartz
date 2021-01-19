package com.ty.leetcode.array;

import org.junit.Test;
/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * */
public class ZhengShuFanZhuan {

  public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
   /* public int reverse(int x) {
        String s = String.valueOf(x);
        System.out.println(s);
        char[] chars = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = chars.length-1; i>=0 ; i--) {
            sb.append(chars[i]);
        }


        return  Integer.valueOf(sb.toString());
    }*/
    @Test
   public void  test(){
        System.out.println(reverse(-51212316));

    }
}
