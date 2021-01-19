package com.ty.lambda;


import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Integer(1).compareTo(new Integer(2)));
        int a=0;
        int b=0;
        double money=0;
        for (int i = 0; i < 42; i++) {
            if (money>150){
                money+=3.5;
                b++;
            }else if (money>100){
                money+=5.6;
                a++;
                continue;
            }
            else {
            money+=7;
        }}
        System.out.println(money+"====="+a+"=========="+b);

    }

    @Test
    public  void test1(){
        BigDecimal bigDecimal=new BigDecimal("1.01");
        System.out.println((BigDecimal.ZERO.compareTo(bigDecimal) == -1));


        System.out.println(notEmptyPositiveNumber(bigDecimal));
        System.out.println(bigDecimal.compareTo(BigDecimal.ZERO));


        int [] sum={6,7,8,9,10,1,2,3,4,5};
        Arrays.stream(sum).filter(i->(i&1)==0).sorted().forEach(System.out::println);
    }

    //
    public boolean notEmptyPositiveNumber(BigDecimal val){
        if (val==null){
            return false;
        }
        if (val.compareTo(BigDecimal.ZERO)!=1){
            return false;
        }
        return true;
    }
    @Test
    public  void test4(){
        int size=999999;
        Set<Integer> set=new HashSet<>(size);
        for (int i = 0; i < size; i++) {
            Integer random = null;
            do {
                random = getRandom();
            } while (!set.add(random));

        }
        set.stream().forEach(System.out::println);

    }

    private  Integer getRandom(){
        //生成一个六位的随机授权码
        Random random=new Random();
        Integer randomNum = random.nextInt(999999);
        //防止第一位为0变成五位
        if (randomNum < 100000) {
            randomNum += 100000;
        }
        return randomNum;
    }

    @Test
    public  void test5(){
        List list=new ArrayList();
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            Integer random = null;

            do {
                random = getRandom();
            } while (!set.add(random));
            list.add(random);
            set.add(random);
        }

        System.out.println(list.size()+"======"+set.size());
    }
}
