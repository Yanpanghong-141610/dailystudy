package com.company;

import java.util.Scanner;

public class IfDemos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入两个数:");
         int x = sc.nextInt();
         int y = sc.nextInt();
         int max;
         if(x>y){
             max=x;
             System.out.println("x和y中最大值为："+max);
         }else{
             max=y;
             System.out.println("x和y中最大值为："+max);
         }


    }
}
