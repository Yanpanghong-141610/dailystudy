package day8;

/**
 * @ClassName Test6
 * @Description
 * @Author YPH
 * @Date 2020/10/27
 **/

public class Test6 {
    public static void main(String[] args) {
        printNum();
    }
    private static void printNum(){

        int a = 9;
        int b = 9;

        int num = ++a;

        boolean bo = (num >=10)?true : false;
        System.out.println("bo的值"+bo);

        int num2 = b++;

        boolean bo2 = (num2 >=10)?true : false;
        System.out.println("bo2的值"+bo2);
    }
}

