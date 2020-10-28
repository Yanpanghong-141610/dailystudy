package day9;

/**
 * @ClassName Test4
 * @Description
 * @Author YPH
 * @Date 2020/10/28
 **/

public class Test4 {
    public static void main(String[] args) {
        byte num1 = -128;
        byte num2 = 127;
        System.out.println(num1);
        System.out.println(num2);

        short num3 = -32768;
        short num4 = 32767;
        System.out.println(num3);
        System.out.println(num4);

        int num5 = -2147483648;
        int num6 = 2147483647;
        System.out.println(num5);
        System.out.println(num6);

        long num7 = -2147483649L;
        long num8 = 2147483648L;
        System.out.println(num7);
        System.out.println(num8);
    }
}
