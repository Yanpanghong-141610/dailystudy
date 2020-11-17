package com.yph.sm.service.impl;

import com.yph.sm.dao.DepartmentDao;
import com.yph.sm.entity.Department;
import com.yph.sm.factory.DaoFactory;
import com.yph.sm.service.DepartmentService;

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
}
