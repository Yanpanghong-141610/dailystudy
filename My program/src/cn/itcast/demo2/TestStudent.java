package cn.itcast.demo2;
/*
*   学生类的测试类
*
* 局部位置：
*     方法的参数列表，或者方法体语句（方法内部）
* 成员位置：
*    类中，方法外
*
* Java中使用变量的规则:
*   使用变量遵循“就近原则”，如果局部位置有，就使用
*   没有就去本类的成员位置找，有就使用，没有就根据
* */
public class TestStudent {
    //main方法是程序的主入口，所有的代码都是从这执行的
    public static void main(String[] args) {
       // 1、创建学生类的对象
        Student stu = new Student();
        //2、给成员变量赋值，并打印结果
        stu.name = "陈";
        stu.age = 22;
        System.out.println(stu.name);
        System.out.println(stu.age);

        //3、调用方法
        stu.study();
    }
}
