package com.basicstudy;

public class SendOrangeDemo {
    public static void main(String[] args) {
        int n=0;
       a: for(int i=1;i<4;i++){
            for (int j=1;j<36;j++){
                if (j%5==0){
                  continue ;
                }
                System.out.println("正在发橘子给第"+i+"班的第"+j+"个同学");
                n++;
                if (n>=100){
                    break a;
                }
            }
        }
        System.out.println("总共发了"+n+"个橘子");
    }
}
