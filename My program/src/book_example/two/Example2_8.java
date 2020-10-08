package book_example.two;

import java.util.Scanner;

/**
 * @ClassName Example2_8
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/8
 **/
/*
* 使用枚举，程序运行时用户在键盘输入1、2、3、4.程序内部根据用户输入的整数再为Season变量赋值，既让Season变量的值是对应的某个枚举常量
* */

enum Season{
    春季,夏季,秋季,冬季
}
public class Example2_8 {
    public static void main(String[] args) {
        Season x = null;
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        if(n==1){
            x=Season.春季;
        }
        else if(n==2){
            x=Season.夏季;
        }
        else if(n==3){
            x=Season.秋季;
        }
        else if(n==4){
            x=Season.冬季;
            System.out.println("现在是"+x);
        }

    }
}
