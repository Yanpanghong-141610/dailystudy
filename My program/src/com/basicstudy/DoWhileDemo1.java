package com.basicstudy;

public class DoWhileDemo1 {
    public static void main(String[] args) {
        //用do...while循环模拟：学完一个知识，至少练习1次
        //定义int型变量count，即练习的次数，初始化值为1
        //定义boolean型变量isOK,作为一个标记，表示是否学会，初始化值为false
        //在do...while循环体中
           //输出正在练习的次数
          //判断当练习次数不少于3时，表示已经学会：isOK=true
          //每练习一次，次数自增1：count++;
        int count=1;
        boolean isOK=false;
        do{
            System.out.println("正在进行第"+count+"次练习");
            if(count >=3){
                isOK = true;
            }
            count ++;
        }while(!isOK);
    }
}
