package com.Shujujiegou.xianxingbiao;

/**
 * @ClassName PaiXU
 * @Description 直接插入法排序
 * @Author YPH
 * @Date 2020/12/8
 **/

public class PaiXU {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=8;
        a[1]=98;
        a[2]=45;
        a[3]=67;
        a[4]=9;


        //直接插入算法
//        int j;
//        for (int i=1;i<a.length;i++)
//        {
//            if (a[i]<a[i-1]){
//                int temp = a[i];
//                j=i-1;
//                do {
//                    a[j+1] = a[j];
//                    j--;
//                }while (j>=0&&a[j]>temp);
//                a[j+1]=temp;
//            }
//        }

//        for (int i=0;i<a.length;i++)
//        {
//            for (int j=1;j<a.length;j++)
//            {
//                if (a[j]<a[j-1]){
//                    int temp = a[j];
//                    a[j]=a[j-1];
//                    a[j-1]=temp;
//                }
//            }
//        }

        //冒泡排序
        System.out.println("排序前------->");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println();

        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("排序后------->");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
