package com.yph.sm.service;

import com.yph.sm.entity.Department;
import com.yph.sm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description DepartmentService
 * @Author YPH
 * @Date 2020/11/17
 **/
public interface DepartmentService {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     */
    List<Department> selectAll();

    /**
     * 新增院系
     *
     * @param  department入参
     * @return int
     */
    int addDepartment(Department department);

    int delDepartment(Department department,Integer id);
}
