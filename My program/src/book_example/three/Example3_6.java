package book_example.three;

/**
 * @ClassName Example3_6
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/10
 **/
/*
* 1+1/2!+1/3!+..前20项的和
* */
public class Example3_6 {
    public static void main(String[] args) {
        int p=1;
        double sum =0;
        for (int i=1;i<=20;i++){
            p=1;
           for (int j=1;j<=i;j++){
               p=p*j;
           }
           sum = sum+p;
        }
        System.out.println(sum);
    }
}
