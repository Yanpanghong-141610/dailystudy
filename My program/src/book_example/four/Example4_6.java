package book_example.four;

/**
 * @ClassName Example4_6
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/16
 **/

public class Example4_6 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        double result = computer.getResult(1.0/3,10,20,30);
        System.out.println("10,20,30的平均数："+result);
        result = computer.getResult(1.0/6,66,12,5,89,2,51);
        System.out.println("66,12,5,89,2,51的平均数:"+result);
    }
}
