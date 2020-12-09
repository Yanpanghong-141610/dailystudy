package com.yph.sm.service;

import com.yph.sm.entity.Clazz;
import com.yph.sm.entity.Student;
import com.yph.sm.vo.StudentVo;

import java.util.List;

/**
 * @ClassName studentService
 * @Description
 * @Author YPH
 * @Date 2020/11/24
 **/
public interface StudentService {
    List<StudentVo> selectAll();
//    List<StudentService> selectAllStudent();
}