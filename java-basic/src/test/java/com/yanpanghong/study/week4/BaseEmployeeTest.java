package com.yanpanghong.study.week4;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseEmployeeTest {

    @Test
    public void print() {
    }

    @Test
    public void getSalary() {
        //上转型对象(是多态一种体现)
        BaseEmployee be = new MarkEmployee();
//        be = new OtherEmployee();
    }
}