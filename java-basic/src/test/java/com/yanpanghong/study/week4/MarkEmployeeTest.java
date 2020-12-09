package com.yanpanghong.study.week4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarkEmployeeTest {

    @Test
    public void print() {
        MarkEmployee me = new MarkEmployee("admin");
        me.print();
    }

    @Test
    public void getSalary() {
        MarkEmployee me = new MarkEmployee("admin");
        int salary = me.getSalary();
       assertEquals(3000,salary);

       //建议这样创建对象
       BaseEmployee you = new MarkEmployee("user");
        assertEquals(1000,you.getSalary());
    }
}