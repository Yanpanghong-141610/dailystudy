package com.yanpanghong.study.week5;

/**
 * @ClassName Student
 * @Description
 * @Author YPH
 * @Date 2020/11/2
 **/

public class Student {
    private  String name;

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    private Integer weight;

    public Student(String name,Integer weight){
        this.name = name;
        this.weight = weight;
    }

}
