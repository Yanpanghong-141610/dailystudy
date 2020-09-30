package com.basicstudy;

public class OverLoadDemo1 {
    public static void main(String[] args) {
        //需求：定义方法，分别比较两个int/long/double的数据，判断它们是否相同
        //调用比较两个int类型数据的方法
            int a =10;
            int b =20;
        boolean flag1 = compare(a,b);
        System.out.println(flag1);
        System.out.println("------------------");
        //调用比较两个long类型数据的方法
      long num1 =10;
        long num2 =20;
        boolean flag2 = compare(num1,num2);
        System.out.println(flag2);
        System.out.println("------------------");
        //调用比较两个double类型数据的方法
       double d3 =2.3;
        double d4 =2.4;
        boolean flag3 = compare(d3,d4);
        System.out.println(flag3);
        System.out.println("------------------");
    }
    //定义一个方法，比较两个int类型的数据是否相同
    public static boolean compare(int a ,int b){
        System.out.println("判断两个int类型的数据是否相同");
        return a==b;
    }
    //定义一个方法，比较两个long类型的数据是否相同
    public static boolean compare(long a ,long b){
        System.out.println("判断两个long类型的数据是否相同");
        return a==b;
    }
    //定义一个方法，比较两个double类型的数据是否相同
    public static boolean compare(double a ,double b){
        System.out.println("判断两个double类型的数据是否相同");
        return a==b;
    }


}
