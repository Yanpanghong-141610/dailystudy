package com.Shujujiegou;

import java.util.Scanner;

/**
 * @ClassName TestArrayList
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/20
 **/

public class TestArrayList {
    public static void main(String[] args) {
//        SqStackClass stack = new SqStackClass();
//        String key = "";
//        boolean loop = true;
//        Scanner scanner = new Scanner(System.in);
//
//        while (loop){
//            System.out.println("show:显示栈");
//            System.out.println("exit:退出测试");
//            System.out.println("push:压栈");
//            System.out.println("pop:出栈");
//            System.out.println("请输入你的选择:");
//            key = scanner.next();
//
//            switch (key){
////                case "show":
////                    stack.list();
////                break;
//
//                case "push":
//                    System.out.println("请输入一个数:");
//                    int value = scanner.nextInt();
//                    stack.push(value);
//                    break;
//
//                case "pop":
//                    try {
//                        int res = (int) stack.pop();
//                        System.out.println("出栈的顺序:"+res);
//                    }catch (Exception e){
//                        System.out.println(e.getMessage());
//                    }
//                    break;
//
////                case "exit":
////                    Scanner.close();
////                    loop=false;
////                    break;
//
//                default:
//                    break;
//            }
//        }
//        System.out.println("程序退出！");

        int a[] = new int[5];
        a[0]=5;
        a[1]=4;
        a[2]=3;
        a[3]=2;
        a[4]=1;
        for (int i=2;i<a.length;i++){
           a[0]=a[i];
           int j=i-1;
           while (a[0]<a[j]){
               a[j+1]=a[j];
               j--;
           }
           a[j+1]=a[0];
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
     }
}
