package book_example.three;

/**
 * @ClassName Example3_7
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/10
 **/

public class Example3_7 {
    public static void main(String[] args) {
        int sum = 0 ;
        for (int i=1;i<=10;i++) //计算10以内奇数之和
        {
            if (i%2 == 0)
            {
                continue;
            }
            sum = sum + i;
        }
        System.out.println("sum="+sum);
        for (int j=2;j<=50;j++)
        {
            for(int i=2;i<=j/2;i++)
            {
                if (j%i ==0)
                {
                    break;
                }
                if(i>j/2)
                {
                    System.out.println(""+j+"是素数");
                }
            }
        }
    }
}
