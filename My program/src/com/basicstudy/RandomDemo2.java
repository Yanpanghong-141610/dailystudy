package com.basicstudy;

import java.util.Random;
import java.util.Scanner;


public class RandomDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(100)+1;
        System.out.println("请输入一个数(1-100)");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if (x==y){
            System.out.println("恭喜你猜对了，这个数为"+x);
        }
        else if (x>y){
            System.out.println("你猜错了，偏小");
        }
        else{
            System.out.println("你猜错了，偏大");
        }
        System.out.println("随机产生的数为："+x);
    }
}
