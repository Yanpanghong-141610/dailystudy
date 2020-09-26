package com.basicstudy;

public class ForDemo6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i=100;i<1000;i++){
            int num = i;
            int g = num%10;
            int s = num/10%10;
            int b = num/100;
            int sum = g*g*g + s*s*s + b*b*b;

            if (sum == i){
               count ++;
            }

        }
        System.out.println("水仙花数的个数为:"+count);
    }
}
