package day4;

/**
 * @ClassName MyClassTest
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/23
 **/

public class MyClassTest {
    public static void main(String[] args) {
        //首先创建对象
        MyClass obj = new MyClass();
        //然后才能使用没有static关键字的内容
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        //正确，推荐
        MyClass.methodStatic();

        //对于本来当中的静态方法，可以省略类名称
         myMethod();
         //完全等效
        MyClassTest.myMethod();
    }

    public static void myMethod(){
        System.out.println("自己的方法!");
    }
}
