package com.company;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生成绩");
        int x = sc.nextInt();

        if(x>=90&&x<=100){
            System.out.println(+x+"等级为皇帝");
        }
        else if (x>=80&&x<90){
            System.out.println(+x+"的等级为宰相");
        }
        else if(x>=70&&x<80){
            System.out.println(+x+"的等级为宰相");
        }
        else if(x>=60&&x<70){
            System.out.println(+x+"的等级为县官");
        }
        else{
            System.out.println(+x+"的等级为草民");
        }

    }
}
