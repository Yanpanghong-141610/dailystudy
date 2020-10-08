package book_example.two;

import java.util.Arrays;

/**
 * @ClassName Example2_7
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/8
 **/

/*
* 首先将一个数组排序，然后使用二分法判断一个数是否和数组中某个元素的值相同
* */
public class Example2_7 {
    public static void main(String[] args) {
        int [] a = {12,34,9,23,45,90,123,19,34};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int number=45;
        int index = Arrays.binarySearch(a,number);
        if(index>0){
            System.out.println(number+"和数组中索引为"+index+"的元素值相同");
        }
        else{
            System.out.println(number+"不与数组中的任何元素相同");
        }
    }
}
