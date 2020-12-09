package com.yph.sm.service.impl;

import com.yph.sm.entity.Department;
import com.yph.sm.factory.ServiceFactory;
import com.yph.sm.service.DepartmentService;
import com.yph.sm.service.StudentService;
import com.yph.sm.vo.StudentVo;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentServiceImplTest {
    private final StudentService departmentService = ServiceFactory.getStudentServiceInstance();


    @Test
    public void selectAll() {
        List<StudentVo> departmentList = departmentService.selectAll();
        departmentList.forEach(System.out::println);
    }
}