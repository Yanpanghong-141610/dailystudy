package book_example.three;

/**
 * @ClassName Example3_5
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/9
 **/
/*
* 计算8+88+888+8888+....的前12项的和
* */
public class Example3_5 {
    public static void main(String[] args) {
        long sum=0;
        int a=8;
        int p;
        for (int i=0;i<3;i++)
        {
            sum = sum +a;
            a = a*10+8;
        }
        System.out.println(sum);
    }
}
