package com.ty.reflex;

import com.ty.quartz.OrderJob;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.util.Optional;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/11/9 15:46
 * @description：
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> zlass = Class.forName("java.lang.String");
        String name = zlass.getClass().getName();
        System.out.println(name);
/*        Method[] methods = zlass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/
        String a=null;
        String s = Optional.ofNullable(a).orElse("你你你");

        System.out.println(a+"====="+s);
        System.out.println(test(10));

    }
    public  static  int test(int i){
        if (i==1){
            return i;
        }
        return  i+test(i-1);

    }

    @org.junit.Test
    public void rrr(){
        String s="-21221";
        System.out.println(!(!StringUtils.isEmpty(s) &&s.indexOf('-') > 0));
        System.out.println(s.indexOf("-"));
    }
}
