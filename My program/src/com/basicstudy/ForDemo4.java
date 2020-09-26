package com.basicstudy;

public class ForDemo4 {
    public static void main(String[] args) {
        int sum = 0;
//        for (int i=0;i<=100;i+=2){
//            sum = sum + i ;
//        }
//        System.out.println("1-100之间的偶数和："+sum);

        for (int i=0;i<=100;i++){
            if (i%2==0){
                sum = sum+i;
            }
        }
        System.out.println("1-100之间的偶数和为:"+sum);
   }
}
