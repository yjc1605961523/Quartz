package com.ty.leetcode.array;

import org.junit.Test;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/13 14:05
 * @description：IP 地址无效化
 */
/*给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。*/
public class LeetCode1108 {
    @Test
    public  void test(){

        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public String defangIPaddr(String address) {
        return address.replace(".","[.]");

    }
}
