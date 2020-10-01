package com.basicstudy;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,5,9};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
