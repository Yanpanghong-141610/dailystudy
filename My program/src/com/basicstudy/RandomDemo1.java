package com.basicstudy;
import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random x = new Random();
        for (int i=0;i<10;i++){
            int a = x.nextInt(101);
            System.out.println("产生的随机数为："+a);
        }
    }
}
