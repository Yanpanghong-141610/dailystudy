package com.basicstudy;

import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("请从键盘输入两个数");
        int a = x.nextInt();
        int b = x.nextInt();

        boolean is = compare(a,b);
        System.out.println(is);
    }

    public static boolean compare(int a,int b ){
//        boolean c = (a==b);
        return a==b;
    }
}
