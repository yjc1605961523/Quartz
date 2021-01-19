package com.ty.leetcode.multithreading;

import java.util.concurrent.CountDownLatch;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2021/1/12 15:16
 * @description：按序打印
 */
public class LeetCode1114 {


    /*
        public void first(Runnable printFirst) throws InterruptedException {
            printFirst.run();
            //释放一个许可证
            semaphoreA.release();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            //获取一个许可证
            semaphoreA.acquire();
            printSecond.run();
            semaphoreA.release(2);
        }

        public void third(Runnable printThird) throws InterruptedException {
            //获取一个许可证
            semaphoreA.acquire(2);
            printThird.run();
        }
*/

    /*
  CountDownLatch countDownLatchA=new CountDownLatch(1);
    CountDownLatch countDownLatchB=new CountDownLatch(1);
    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        countDownLatchA.countDown();
        //释放一个许可证
    }

    public void second(Runnable printSecond) throws InterruptedException {
        countDownLatchA.await();
        //获取一个许可证
        printSecond.run();
        countDownLatchB.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        //获取一个许可证
        countDownLatchB.await();
        printThird.run();
    }
*/


    public LeetCode1114() {
    }



    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        //释放一个许可证
    }

    public void second(Runnable printSecond) throws InterruptedException {
        //获取一个许可证
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        //获取一个许可证
        printThird.run();
    }

}
