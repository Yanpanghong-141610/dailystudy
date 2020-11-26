package com.yph.sm.service;

import com.yph.sm.entity.Clazz;
import com.yph.sm.factory.ServiceFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClazzServiceTest {

    @Test
    public void getClazzByDepId() {
        List<Clazz> list = ServiceFactory.getClazzServiceInstance().getClazzByDepId(5);
        list.forEach(System.out::println);
    }
}