package com.yph.sm.factory;

import com.yph.sm.service.AdminService;
import com.yph.sm.service.ClazzService;
import com.yph.sm.service.DepartmentService;
import com.yph.sm.service.StudentService;
import com.yph.sm.service.impl.AdminServiceImpl;
import com.yph.sm.service.impl.ClazzServiceImpl;
import com.yph.sm.service.impl.DepartmentServiceImpl;
import com.yph.sm.service.impl.StudentServiceImpl;


/**
 * @ClassName ServiceFactory
 * @Description Service工厂类
 * @Author YPH
 * @Date 2020/11/14
 **/

public class ServiceFactory {
    public static AdminService getAdminServiceInstance() {

        return new AdminServiceImpl();
    }

    public static DepartmentService getDepartmentServiceInstance() {
        return new DepartmentServiceImpl();
    }


    public static ClazzService getClazzServiceInstance() {
        return new ClazzServiceImpl();
    }

    public static StudentService getStudentServiceInstance(){return new StudentServiceImpl() ;}
}

