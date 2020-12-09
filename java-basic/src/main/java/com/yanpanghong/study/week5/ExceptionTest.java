package com.yanpanghong.study.week5;

import java.util.Scanner;

/**
 * @ClassName ExceptionTest
 * @Description 运行时异常练习
 * @Author YPH
 * @Date 2020/11/2
 **/

public class ExceptionTest {
    public static void main(String[] args) {
//        int result=0;
//        //1.ArithmeticException 算术异常
//        try{
//           result = 3 / 0;
//        }catch (ArithmeticException e){
//           // e.printStackTrace();
//            System.err.println("除数不能为0！");
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(result);

        //2.ArrayIndextOutofBoundsException 数组索引越界
//        int[] a = new int[]{1,2,3,4,5};
//
//        try{
//            System.out.println(a[5]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.err.println("数组索引下标不可以越界！");
//            System.err.println("引起的原因"+e.getCause());
//            System.err.println("异常的详细信息:"+e.getMessage());
//            System.err.println("异常对象e: "+e.toString());
//
//        }
        //3.
        System.out.println("请输入价格:");
        Scanner scanner = new Scanner(System.in);
        //从键盘读入一串字符
        String priceStr = scanner.nextLine();
        //将字符串转化为整形
        int price = 0;
        try{
            price = Integer.parseInt(priceStr);
        }catch (NumberFormatException e){
            System.err.println("引起的原因"+e.getCause());
        }

        System.out.println("price ="+price);

        //4.NPE NullPointerException
    }
}
