package com.basicstudy;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //演示数组索引越界异常
        int[] arr = new int[3];
        arr[0]=11;
        arr[1]=22;
        arr[2]=33;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);//报错
    }
}
