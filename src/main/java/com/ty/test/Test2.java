package com.ty.test;

import com.osgc.shop.retailsale.integralqry.IntegralqryPageAction;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/12/23 16:00
 * @description：
 */
public class Test2
{
    public static void main(String[] args) {
        int a=6;
        System.out.println(~a);
        int b=8;
        a=a^b;
        System.out.println(a+"==="+b);
        b=b^a;
        System.out.println(a+"==="+b);
        a=a^b;
        System.out.println(a+"==="+b);
        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(5);
    }
    @Test
    public void asyncThread()throws Exception{
        CompletableFuture async1 = CompletableFuture.runAsync(()->{
            try {
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName());
                System.out.println("none return Async");
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        // 调用get()将等待异步逻辑处理完成
        async1.get();
    }
    @Test
    public void asyncThread2()throws Exception{
        CompletableFuture<String> async2 = CompletableFuture.supplyAsync(()->"hello");
        String result = async2.get();
        // String result2 = async2.get(5L, TimeUnit.SECONDS);
        System.out.println(result);
    }
    @Test
    public void asyncThread3()throws Exception{
        CompletableFuture<String> a = CompletableFuture.supplyAsync(() -> "hello");
        CompletableFuture<String> b = CompletableFuture.supplyAsync(() -> "youth");
        CompletableFuture<String> c = CompletableFuture.supplyAsync(() -> "!");

        CompletableFuture all = CompletableFuture.allOf(a,b,c);
        all.get();

        String result = Stream.of(a, b,c)
                .map(CompletableFuture::join)
                .collect(Collectors.joining("-"));

        System.out.println(result);
    }

    @Test
    public void asyncThread4()throws Exception{
        CompletableFuture<String> a = CompletableFuture.supplyAsync(() ->{
            try{
                Thread.sleep(20);
                return "hello";
            }catch (Exception e){
                e.printStackTrace();
                return "none~";
            }
        });
        CompletableFuture<String> b = CompletableFuture.supplyAsync(() -> "youth");
        CompletableFuture<String> c = CompletableFuture.supplyAsync(() -> "!");

        CompletableFuture<Object> any = CompletableFuture.anyOf(a,b,c);
        String result = (String)any.get();

        System.out.println(result);
    }

    @Test
    public void asyncThread5()throws Exception{
        String a="微信图片_20201209111309.jpg";
        System.out.println(a.substring(a.lastIndexOf('.')));
    }
}
