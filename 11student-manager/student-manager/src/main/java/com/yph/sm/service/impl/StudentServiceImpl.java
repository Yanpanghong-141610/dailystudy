package com.yph.sm.service.impl;

import com.yph.sm.dao.StudentDao;
import com.yph.sm.factory.DaoFactory;
import com.yph.sm.service.StudentService;
import com.yph.sm.vo.StudentVo;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Description
 * @Author YPH
 * @Date 2020/11/24
 **/

public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao = DaoFactory.getStudentDaoInstance();

    @Override
    public List<StudentVo> selectAll() {
        List<StudentVo> studentVoList = null;
        try {
            studentVoList = studentDao.selectAll();
        }catch (SQLException e) {
            System.err.print("查询学生信息出现异常");
        }
        return studentVoList;
    }
}
