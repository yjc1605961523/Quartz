package com.ty.quartz;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        long time = date.getTime();
        long l = time + (15 * 60 * 1000);
        System.out.println(formatter.format(l));
        System.out.println();

   /*    int k = change(start);
        System.out.println(k);
        System.out.println(start1+k);*/

     /*   int k=0;
        Integer i =Integer.valueOf(substring);
        System.out.println(i);*/


    }

    public static int change(String start) {

        int k = 0;
        if (start.equals("00")) {
            k = 1;
        } else if (start.equals("15")) {
            k = 2;
        } else if (start.equals("30")) {
            k = 3;
        } else if (start.equals("45")) {
            k = 4;
        }
        return k;
    }

/*
    public static String back(String time) {
        String start = null;
        if (time != null && !time.equals("")) {
            String substring = time.substring(0, 2);
            String substring1 = time.substring(3, 5);
            int change = change(substring1);
            start = substring + change;
        }
        return start;
    }
*/


}