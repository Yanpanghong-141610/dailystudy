package com.yanpanghong.study.week4;

/**
 * @ClassName BaseEmployee
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/26
 * @description: 基础的员工抽象类
 **/

public abstract class BaseEmployee {
    public void print(){
        System.out.println("This is an abstract class.");
    }
    /**
    *方法的声明或方法的签名
    * 发工资
     *
     * @param id 员工工资
     * @return int
     */

    public abstract int getSalary();
}
