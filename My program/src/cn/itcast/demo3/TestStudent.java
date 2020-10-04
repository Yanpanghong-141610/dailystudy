package cn.itcast.demo3;

public class TestStudent {
    //调用show方法
    public static void main(String[] args) {
       Student stu = new Student();
       stu.show();
       System.out.println("-----------");
    //按照格式，优化setAge()中的参数名，并调用
    stu.setAge(50);
    System.out.println(stu.getAge());

    }
}
