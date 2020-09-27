package com.basicstudy;

public class WhileDemo1 {
    public static void main(String[] args) {
        //需求：使用while循环在控制台输出5次"HelloWorld"

        //用for循环实现输出"HelloWorld"
           for (int i=0;i<5;i++){
               System.out.println("HelloWorld");
           }
          System.out.println("--------------------");
        //用while循环实现输出"HelloWorld"
        int i=1;
        while(i<=5){
           System.out.println("HelloWorld");
           i++;
        }
        System.out.println("--------------------");
    }
}
