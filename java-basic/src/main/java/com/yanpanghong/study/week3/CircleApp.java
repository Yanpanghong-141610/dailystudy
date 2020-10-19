package com.yanpanghong.study.week3;

import java.awt.*;

/**
 * @ClassName CircleApp
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/19
 **/

public class CircleApp {
    public static void main(String[] args) {
//     Ponit ponit = new Ponit();
//        System.out.println("***************");
//     Circle circle = new Circle();
        Ponit ponit = new Ponit(10,20);
        Circle circle = new Circle(10,20,5);
        ponit.print();
        circle.print();
        Cylinder cylinder = new Cylinder(10,10,5,6);
        cylinder.print();

        //1、创建两个Point的对象，求出两点之间的距离

        //2、创建一个Point对象，判断该点是否在上面的Circle圆对象内
    }
}
