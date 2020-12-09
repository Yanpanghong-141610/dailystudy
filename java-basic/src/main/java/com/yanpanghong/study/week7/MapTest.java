package com.yanpanghong.study.week7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description Map接口测试程序
 * @Author YPH
 * @Date 2020/11/16
 **/

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(8);

        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","CoreJava");
        map.put("Allen","JDBC");

        //for循环遍历
        for (String key:map.keySet()){
            String course = map.get(key);
            System.out.println(key+"任教:"+course);
        }

        System.out.println("通过遍历Map的 entrySet，遍历 Key和Value");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"任教:"+entry.getValue());
        }

        System.out.println("输出所有教JDBC的讲师");
        for (String key:map.keySet()){
            String course = map.get(key);
            if (course.equals("JDBC")) {
                System.out.println(key + "任教:" + course);
            }
        }

        //        map.put("apple",12);
//        map.put("pear",8);
//        map.put("banana",24);
//        System.out.println(map);
//        //for循环遍历
//        for (String key: map.keySet()){
//            Integer value = map.get(key);
//            System.out.println(key+"单价为:"+value);
//        }
//        //iterator遍历
//        System.out.println("iteartor遍历");
//       Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String,Integer> entry = iterator.next();
//            System.out.println(entry.getKey()+"单价为:"+entry.getValue());
//        }
//
//        //lambda遍历
//        System.out.println("通过遍历Map的 entrySet，遍历 Key和Value");
//        for (Map.Entry<String,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()+"单价为:"+entry.getValue());
//        }
//
//        System.out.println("通过遍历Map的values，只能遍历 value，获取不到key");
//        for (Integer value : map.values()){
//            System.out.println(value);
//        }
//
//        System.out.println("lambda表达式遍历，强烈推荐！");
//        map.forEach((key,value)->{
//            System.out.println("key:"+key+",value:"+value);
//        });
    }
}
