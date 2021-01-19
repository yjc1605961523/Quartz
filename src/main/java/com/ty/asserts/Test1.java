package com.ty.asserts;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/11/6 14:10
 * @description：
 */
public class Test1 {

    class SystemA implements Runnable{

        @Override
        public void run() {
            System.out.print("A");
        }
    }


    @Test
    public void aVoid() {
    }
}
