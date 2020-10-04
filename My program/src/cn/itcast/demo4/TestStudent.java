package cn.itcast.demo4;

public class TestStudent {
    public static void main(String[] args) {
        //格式一：通过无参构造实现
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(23);

        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println("--------------");

        //格式二：通过构造方法实现快速格式化
        Student stu2 = new Student("李四",24);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
    }
}
