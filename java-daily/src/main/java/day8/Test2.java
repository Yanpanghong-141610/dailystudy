package day8;

/**
 * @ClassName Test2
 * @Description
 * @Author YPH
 * @Date 2020/10/27
 **/

public class Test2 {
    public static void main(String[] args) {
        int i1=100;
        long l1=200;
        long add;
        add = i1 +l1;
        System.out.println("add的值:"+add);

        long i2=1000000;
        float f2 = 0.45F;
        float add2;
        add2 = i2 + f2;
        System.out.println("add2的值:"+add2);

        int i3=1000000;
        double d3=0.45;
        double add3;
        add3 = i3+d3;
        System.out.println("add3的值:"+add3);

        float f4 = 1000000.789F;
        double d4 = 0.45;
        double add4 = f4 +d4;
        System.out.println("add4的值:"+add4);


    }
}
