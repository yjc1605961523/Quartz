package com.ty.leetcode.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2021/1/13 15:11
 * @description：交替打印FooBar
 */
public class LeetCode1115 {

    private int n;
    volatile boolean flag=true;
    public LeetCode1115(int n) {
        this.n = n;
    }
    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            // printFoo.run() outputs "foo". Do not change or remove this line.
            while (flag){
            }
            printFoo.run();
             flag=false;

        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while (!flag){
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            flag=true;
        }
    }
}
