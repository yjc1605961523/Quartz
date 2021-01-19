package com.ty.quartz;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
/*        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");


        Date start = formatter.parse("15:15");
        Date end = formatter.parse("17:00");
        int interval=10;
        long time = end.getTime();
        System.out.println(time+"---");
        long m=(end.getTime()-start.getTime())/1000/60;
        System.out.println(m);
        int count = (int)m / interval;
        System.out.println(count);
        Long starts[]=new Long[count];
        Long ends[]=new Long[count];
        for(int i=0;i<count;i++){
            starts[i]=start.getTime()+(60*1000*interval*i);
            ends[i]=start.getTime()+(60*1000*interval*(i+1));
        }
        for(int i=0;i<count;i++){
            System.out.println("start:"+formatter.format(starts[i]));
            System.out.println("end:"+formatter.format(ends[i]));
            System.out.println("------------------------------");
        }*/

        System.out.println(notEmptyPositiveNumber(new BigDecimal("0.001")));
    }


    //
    public static  boolean notEmptyPositiveNumber(BigDecimal val){
        if (val==null){
            return false;
        }
        if (val.compareTo(BigDecimal.ZERO)!=1){
            return false;
        }
        return true;
    }
}
