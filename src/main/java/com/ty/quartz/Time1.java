package com.ty.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time1 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        Long aLong = Long.valueOf("1589525617601");
        System.out.println(formatter.format(aLong));
        long l = time + (15 * 60 * 1000);
    }
}
