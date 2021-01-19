package com.ty.leetcode.array;

import org.junit.Test;

/**
 * 1047. 删除字符串中的所有相邻重复项
 * */
public class leetcode1047 {
    public String removeDuplicates(String S) {
  /*      char[] chars = S.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(i+"="+chars.length);
            if (i+1==chars.length){
                stringBuilder.append(chars[i]);
                break;
            }
            if (chars[i]==chars[i+1]){
                i++;
                continue;
            }
            System.out.println(chars[i]);
            stringBuilder.append(chars[i]);
        }*/
    StringBuilder stringBuilder=new StringBuilder();
        char[] chars = S.toCharArray();
        int index=0;
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
            if (index!=0&&chars[i]==stringBuilder.charAt(index-1)) {
                stringBuilder.deleteCharAt(index-1);
            }else{
                stringBuilder.append(chars[i]);
                index++;
            }
        }

        return stringBuilder.toString();
    }
    @Test
    public void removeDuplicates(){
        System.out.println(removeDuplicates("abbaca"));
    }
}
