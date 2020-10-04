package cn.itcast.demo5;

public class TestStudent {
    public static void main(String[] args) {
        //通过空参创建对象
        Student stu1 = new Student();
        stu1.setName("张");
        stu1.setAge(23);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println("-----------");
        //通过全参控制对象
        Student stu2 =new Student("魏",22);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());

    }
}
