package com.yph.sm.factory;

import com.yph.sm.service.AdminService;
import com.yph.sm.service.impl.AdminServiceImpl;


/**
 * @ClassName ServiceFactory
 * @Description Service工厂类
 * @Author YPH
 * @Date 2020/11/14
 **/

public class ServiceFactory {
    public static AdminService getAdminServiceInstance(){
        return new AdminServiceImpl();
    }
}
