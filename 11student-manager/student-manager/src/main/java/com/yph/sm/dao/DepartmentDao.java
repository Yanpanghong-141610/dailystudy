package com.yph.sm.dao;

import com.yph.sm.entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description 院系DAO接口
 * @Author YPH
 * @Date 2020/11/17
 **/
public interface DepartmentDao {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     * @throws SQLException 异常
     */
    List<Department> getAll() throws SQLException;

    /**
     *
     * @param department入参
     * @return int
     * @throws SQLException 异常
     */
     int insertDepartment(Department department)throws SQLException;
    /**
     * 删除
     * @param department
     * @return
     * @throws SQLException
     */
    int deleteDepartment(Department department,int id)throws SQLException;

}
