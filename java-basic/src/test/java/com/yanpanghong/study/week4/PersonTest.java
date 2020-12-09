package com.yanpanghong.study.week4;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void speed() {
        Person person = new Person();
        assertEquals(1000,person.speed());
        person.go("北京");

        //接口回调
//        Fly fly = new Person();
//        Travel travel = new Person();

    }

    @Test
    public void go() {
    }
}