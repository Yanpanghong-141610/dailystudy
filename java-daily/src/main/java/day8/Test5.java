package day8;

/**
 * @ClassName Test5
 * @Description
 * @Author YPH
 * @Date 2020/10/27
 **/

public class Test5 {
    public static void main(String[] args) {
        int a=20,b=20;
        boolean bo= ((++a)%3==0&&(a++)%7==0);
        System.out.println("a的值为:"+a+" "+"bo的值"+bo);
        System.out.println("************************");
        boolean bo2 =((b++)%3==0&&(++b)%7==0);
        System.out.println("b的值为:"+b+" "+"bo2的值"+bo2);
    }
}
