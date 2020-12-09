package com.yph.sm.factory;

import com.yph.sm.service.*;
import com.yph.sm.service.impl.*;


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

    public static RewardService getRewardServiceInstance(){return new RewardServiceImpl();
    }
}

