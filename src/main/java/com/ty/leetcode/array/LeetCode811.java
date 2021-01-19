package com.ty.leetcode.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 811. 子域名访问计数
 * */
public class LeetCode811 {
    public List<String> subdomainVisits(String[] cpdomains) {

            Map<String,Integer> map=new HashMap<>();
            for (String cpdomain : cpdomains) {
            String[] s = cpdomain.split(" ");
            String[] split = s[1].split("\\.");
            int count = Integer.valueOf(s[0]);
            String cur = "";
            for (int i = split.length - 1; i >= 0; --i) {
                cur = split[i] + (i < split.length - 1 ? "." : "") + cur;
                map.put(cur,map.getOrDefault(cur,0) + count);
            }
        }
            List<String> ans = new ArrayList();
            for (String dom: map.keySet())
                ans.add("" + map.get(dom) + " " + dom);
            return ans;
    }
    @Test
    public void subdomainVisits(){
        String [] list={"9001 discuss.leetcode.com","50 leetcode.com"};
        List<String> list1 = subdomainVisits(list);
        System.out.println(list1);
    }
}
