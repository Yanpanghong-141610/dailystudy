package com.yph.sm.factory;

import com.yph.sm.dao.AdminDao;
import com.yph.sm.dao.ClazzDao;
import com.yph.sm.dao.DepartmentDao;
import com.yph.sm.dao.StudentDao;
import com.yph.sm.dao.impl.AdminDaoImpl;
import com.yph.sm.dao.impl.ClazzDaoImpl;
import com.yph.sm.dao.impl.DepartmentDaoImpl;
import com.yph.sm.dao.impl.StudentDaoImpl;
import com.yph.sm.entity.Department;

/**
 * @ClassName DaoFactory
 * @Description 工厂类
 * @Author YPH
 * @Date 2020/11/14
 **/

public class DaoFactory {
    /**
     * 获得AdminDao实例
     *
     * @return AdminDao实例
     */
    public static AdminDao getAdminDaoInstance(){

        return new AdminDaoImpl();
    }

    /**
     * 获得DepartmentDao实例
     *
     * @return AdminDao实例
     */
    public static DepartmentDao getDepartmentDaoInstance(){
        return new DepartmentDaoImpl();
    }

    /**
     * 获得ClazzDao实例
     *
     * @return ClazzDao实例
     */
    public static ClazzDao getClazzDaoInstance(){
        return new ClazzDaoImpl();
    }

    public static StudentDao getStudentDaoInstance(){return new StudentDaoImpl();
    }
}




