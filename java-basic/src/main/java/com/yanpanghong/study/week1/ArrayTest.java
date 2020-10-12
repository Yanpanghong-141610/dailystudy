package com.yanpanghong.study.week1;

import java.util.Random;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/5
 **/

public class ArrayTest {
    final static int MAX = 5;
    public static void main(String[] args) {
        //创建一个10个元素的整型数组
        int[] a = new int[MAX];
        //创建随机数种子
        Random random = new Random();
        //数组原始值为
        for(int i=0;i<MAX;i++){
            //循环生成100以内随机整数赋值给数组
            a[i] = random.nextInt(100);
            System.out.print(a[i]+" ");
        }
       System.out.println();
        //1、用一个循环求出最大值，最小值和数组之和
        int max=a[0];
        int min=a[0];
        int sum=0;
        for (int i=0;i<MAX;i++){

            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
            sum=sum+a[i];
        }
        System.out.print("数组中最大值为："+max+"数组中最小值为："+min+"数组中所有数据和为："+sum);
        System.out.println();
        //用排序方法进行排序
        //冒泡法排序
        System.out.println("冒泡法排序");
       int t;
       for (int i=0;i<MAX;i++)
       {
           for (int j=i+1;j<MAX;j++)
           {   if (a[i]>a[j])
               {
                   t=a[i];
                   a[i]=a[j];
                   a[j]=t;
               }

           }
       }
       for (int i=0;i<MAX;i++){
           System.out.print(a[i]+" ");
       }
       System.out.println();
       //选择法排序
        System.out.println("选择法排序");
       for (int i=0;i<MAX;i++)
       {  int k=i;
           for(int j=MAX-1;j>i;j--)
           {
               if (a[i]<a[k]){
                   k=j;
               }
               t=a[i];
               a[i]=a[k];
               a[k]=t;
           }
       }
        for (int i=0;i<MAX;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }

    }

