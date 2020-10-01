package com.basicstudy;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] arr ={2,4,6,3,5,9};
        int max=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("数组中的最大值为"+max);
    }
}
