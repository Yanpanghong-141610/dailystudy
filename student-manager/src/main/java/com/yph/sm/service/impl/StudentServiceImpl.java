package com.yph.sm.service.impl;

import com.yph.sm.dao.StudentDao;
import com.yph.sm.entity.Student;
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
        List<StudentVo> list = null;
        try {
            list = studentDao.selectAll();
        } catch (SQLException throwables) {
            System.err.println("查询所有学生出现异常");
        }
        return list;
    }

    @Override
    public List<StudentVo> selectByDepId(int depId) {
        List<StudentVo> list = null;
        try {
            list = studentDao.selectByDepId(depId);
        } catch (SQLException throwables) {
            System.err.println("根据院系id查询学生出现异常");
        }
        return list;
    }


    @Override
    public List<StudentVo> selectByClassId(int classId) {
        List<StudentVo> list = null;
        try {
            list = studentDao.selectByClassId(classId);
        } catch (SQLException throwables) {
            System.err.println("根据班级id查询学生出现异常");
        }
        return list;
    }

    @Override
    public List<StudentVo> selectByKeywords(String keywords) {
        List<StudentVo> list = null;
        try {
            list = studentDao.selectBykeywords(keywords);
        } catch (SQLException throwables) {
            System.err.println("根据关键词查询学生出现异常");
        }
        return list;
    }

    @Override
    public int updateStudent(Student student) {
        int n = 0;
        try {
            n = studentDao.updateStudents(student);
        } catch (SQLException e) {
            System.err.println("修改学生出现异常");
        }
        return n;
    }

    @Override
    public int deleteById(String id) {
        int n = 0;
        try {
            n = studentDao.deleteById(id);
        } catch (SQLException e) {
            System.err.println("删除学生出现异常");
        }
        return n;
    }

    @Override
    public int insertStudent(Student student) {
        int n = 0;
        try {
            n = studentDao.insertStudent(student);
        } catch (SQLException e) {
            System.err.println("新增学生出现异常");
        }
        return n;
    }

    @Override
    public int countByDepartmentId(int departmentId) {
        int n = 0;
        try {
            n = studentDao.countByDepartmentId(departmentId);
        } catch (SQLException e) {
            System.err.println("根据院系统计学生数量出现异常");
        }
        return n;
    }

    @Override
    public int countStudentByClassId(int classId) {
        int n = 0;
        try {
            n = studentDao.countByClassId(classId);
        } catch (SQLException e) {
            System.err.println("根据班级统计学生数量出现异常");
        }
        return n;
    }
}
