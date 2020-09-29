package com.basicstudy;

import java.util.Scanner;

public class MethodDemo1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("请从键盘输入两个数：");
        int a = x.nextInt();
        int b = x.nextInt();

        System.out.println("这两个数的和为："+add(a,b));
    }

    public static int add(int x,int y){
        int sum=0;
        sum=x+y;
        return  sum;
    }
}
