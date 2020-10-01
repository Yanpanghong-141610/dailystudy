package com.basicstudy;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int num=1;
        for (int i=0;i<3;i++){
            arr[i]=num;
            num++;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
