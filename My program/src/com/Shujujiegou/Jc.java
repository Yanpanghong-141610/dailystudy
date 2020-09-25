package Shujujiegou;
import java.util.*;
public class Jc {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         while(true){
             System.out.println("输入阶乘底数，输入-1时退出");
             int  n=sc.nextInt();
             if(n==-1){
                 break;
             }
             System.out.println("循环算法阶乘结果"+fun(n));
         }

    }
   public static int fun(int n){
      int p=1;
        for (int i=1;i<=n;i++){
         p=p*i;
      }
      return p;
  }



}
