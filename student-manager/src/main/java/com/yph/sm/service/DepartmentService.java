package com.yph.sm.service;

import com.yph.sm.entity.Department;

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
}
