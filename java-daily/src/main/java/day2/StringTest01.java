package day2;

/**
 * @ClassName StringTest01
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/21
 **/

public class StringTest01 {
    public static void main(String[] args) {
        //创建一个"abc"字符串对象，该对象的内存地址，让s1变量保存。
        //s1时一个引用，s1指向"abc"对象
        String s1 = "abc";
        //可以让s1重新指向
        //但是"def"字符串本身不可变
        s1 = "der";
        //在字符串常量池中新建一个"hello"字符串对象，该对象不可变
        String s2="hello";
        //从字符串常量池中直接拿来用
        String s3="hello";
        System.out.println(s2==s3);
        //判断字符串是否相等不能用
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println(s4==s5);
        //以下程序在执行结束之后，会在字符串常量池中创建三个字符串对象"aaa""bbb""aaabbb"
        String s6 = "aaa";
        String s7 = "bbb";
        String s8 = s6+s7;
    }
}
