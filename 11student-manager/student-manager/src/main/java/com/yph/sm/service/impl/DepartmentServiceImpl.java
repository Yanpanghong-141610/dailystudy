package com.yph.sm.service.impl;

import com.yph.sm.dao.DepartmentDao;
import com.yph.sm.entity.Department;
import com.yph.sm.factory.DaoFactory;
import com.yph.sm.service.DepartmentService;
import com.yph.sm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentServiceImpl
 * @Description DepartmentService
 * @Author YPH
 * @Date 2020/11/17
 **/

public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentDao departmentDao = DaoFactory.getDepartmentDaoInstance();

    @Override
    public List<Department> selectAll(){
        List<Department> departmentList = null;
        try{
            departmentList = departmentDao.getAll();
        }catch (SQLException e){
            System.err.print("查询院系信息出现异常");
        }
        return departmentList;
    }

    @Override
    public int addDepartment(Department department) {
       int n =0;
       try{
          n = departmentDao.insertDepartment(department);
       }catch (SQLException e){
           System.err.print("新增院系信息出现异常");
       }
       return n;
    }

    @Override
    public int delDepartment(Department department,Integer id){
        int n=0;
        try{
            n=departmentDao.deleteDepartment(department,id);
        }catch (SQLException e){
            System.err.print("删除院系信息出现异常");
        }
        return n;
    }
}
