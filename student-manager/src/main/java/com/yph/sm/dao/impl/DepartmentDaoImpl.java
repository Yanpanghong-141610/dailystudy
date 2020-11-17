package com.yph.sm.dao.impl;

import com.yph.sm.dao.DepartmentDao;
import com.yph.sm.entity.Department;
import com.yph.sm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName DepartmentDaoImpl
 * @Description 院系DAO实现类
 * @Author YPH
 * @Date 2020/11/17
 **/

public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public List<Department> getAll() throws SQLException{
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT * FROM t_department";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Department> departmentList = new ArrayList<>();
        while (rs.next()){
            Department department = new Department();
            department.setId(rs.getInt("id"));
            department.setDepartmentName(rs.getString("department_name"));
            department.setLogo(rs.getString("Logo"));
            departmentList.add(department);
        }
        rs.close();
        pstmt.close();
        jdbcUtil.closeConnect();
        return departmentList;
    }
}
