package cn.itcast.demo5;
/*
* 定义一个标准的JavaBean类
* */
public class Student {
    //成员变量，全部用Privat修饰
    private String name;
    private int age;
    //构造方法，无参构造，全参构造
    public Student(){}
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //公共的访问方式：getxxx(),setxxx()
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return  age;
    }
}
