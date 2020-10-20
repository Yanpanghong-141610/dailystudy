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
        SqStackClass stack = new SqStackClass();
        String key = "";
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        while (loop){
            System.out.println("show:显示栈");
            System.out.println("exit:退出测试");
            System.out.println("push:压栈");
            System.out.println("pop:出栈");
            System.out.println("请输入你的选择:");
            key = scanner.next();

            switch (key){
//                case "show":
//                    stack.list();
//                    break;

                case "push":
                    System.out.println("请输入一个数:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case "pop":
                    try {
                        int res = (int) stack.pop();
                        System.out.println("出栈的顺序:"+res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

//                case "exit":
//                    Scanner.close();
//                    loop=false;
//                    break;

                default:
                    break;
            }
        }
        System.out.println("程序退出！");
     }
}
