package day1;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @Author YPH
 * @Date 2020/10/20
 **/

public class BubbleSort {
    /**
     * 冒泡排序的一种实现，没有任何优化
     *
     * @param a:数组
     * @param  n:排序趟数
     */

    public static void bubbleSort1(int[] a,int n){
        int i,j;
        //表示n次排序过程
        for (i=0;i<n;i++){
            for (j=1;j<n-i;j++){
                //前面的数字大于后面的数字就交换
                if(a[j-1]>a[j]){
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1]=a[j];
                    a[j]= temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
        BubbleSort.bubbleSort1(arr,arr.length);
        for (int i:arr){
            System.out.print(i+",");
        }
    }
}
