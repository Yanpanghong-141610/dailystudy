package com.company;
import java.util.*;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个1-7中的数：");
        int i=sc.nextInt();

        switch (i){
            case 1:
                System.out.println("今天是星期一");
                break;

            case 2:
                System.out.println("今天是星期二");
                break;

            case 3:
                System.out.println("今天是星期三");
                break;

            case 4:
                System.out.println("今天是星期四");
                break;

            case 5:
                System.out.println("今天是星期五");
                break;

            case 6:
                System.out.println("今天是星期六");
                break;

            case 7:
                System.out.println("今天是星期日");
                break;
            default:
                System.out.println("系统无法识别这个时间");
        }
    }
}
