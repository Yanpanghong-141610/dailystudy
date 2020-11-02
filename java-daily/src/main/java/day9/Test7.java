package day9;

/**
 * @ClassName Test7
 * @Description
 * @Author YPH
 * @Date 2020/10/28
 **/

public class Test7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("互换前:");
        System.out.println(a);
        System.out.println(b);

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("互换后:");
        System.out.println(a);
        System.out.println(b);

    }
}
