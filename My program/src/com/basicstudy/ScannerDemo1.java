package com.company;

import java.util.*;

public class ScannerDemo1 {
    public static void main(String[] args){

        int sum=0;
        Scanner sc = new Scanner(System.in);
//
       System.out.println("请输入两个整数：");
       int x = sc.nextInt();
       int y = sc.nextInt();
       sum = x + y ;
       System.out.println("两个整数的和为："+sum);
    }
}
