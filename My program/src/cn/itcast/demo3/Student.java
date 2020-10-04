package cn.itcast.demo3;
/*
* 定义一个学生类
* */

public class Student {
    //成员变量
   private int age = 20;
    //设置年龄
   public void setAge(int age){
       this.age = age;
   }
   //获取年龄
    public int getAge(){
       return age;
    }
    public void show(){
       //局部变量
        int age=10;

        System.out.println(age);//10
        System.out.println(this.age);//20
    }
}
