package com.yanpanghong.study.week3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName MyDate
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/19
 **/

public class MyDate extends Date {
    public String toStirng(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return  sdf.format(this);
    }

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println(myDate);
    }
}
