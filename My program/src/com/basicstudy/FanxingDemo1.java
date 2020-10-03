package com.basicstudy;

import java.util.ArrayList;
import java.util.List;

public class FanxingDemo1 {
    public static void main(String[] args) {
        //不使用泛型的集合
        //1、创建集合对象
        List list1 =new ArrayList();

        //2、创建元素对象
        //3、将元素对象添加到集合对象中
        list1.add("a");
        list1.add("b");
        list1.add("c");
        //4、遍历集合
        for (Object obj:list1){
            String s = (String) obj;
            System.out.println(s);
        }
        // 1、创建集合对象
        List<String>list2 = new ArrayList<String>();
        //2、创建元素对象
        //3、将元素对象添加到集合对象中
          list2.add("abc");
          list2.add("bcd");
          list2.add("cde");
        //4、遍历集合
        for (String s:list2){
            System.out.println(s);
        }

    }
}
