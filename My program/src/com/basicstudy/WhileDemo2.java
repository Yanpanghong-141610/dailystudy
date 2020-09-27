package com.basicstudy;

public class WhileDemo2 {
    public static void main(String[] args) {
        int i =1;
        int sum=0;

        while(i<=100){
            sum = sum+i;
            i++;
        }
        System.out.println("1-100之间的数据和为"+sum);
    }
}
