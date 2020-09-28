package com.basicstudy;

//需求：程序猿同学受邀加入A公司，现按班级查找程序猿同学。现有3个班级，每班10个同学，假设第2个班级的第5位同学名叫程序猿
//找到该同学后停止查找。
public class BreakDemo {
    public static void main(String[] args) {
        //A：先使用for循环遍历每一个班级，定义标号：label_class:for(){}
        //B:在班级循环体中，再使用for循环遍历每个同学
        //C:判断如果班级编号为2，同学编号为5，则停止查找:break label_class

       label_class: for(int i=1;i<4;i++){
            for (int j=1;j<11;j++){
                System.out.println("当前正在查找第"+i+"个班级的第"+j+"个学生");
                if (i==2&&j==5){
                    System.out.println("已经找到程序猿同学了");
                    break label_class;  //结束指定的循环
                }
            }
            System.out.println("-------------------");
        }
    }


}
