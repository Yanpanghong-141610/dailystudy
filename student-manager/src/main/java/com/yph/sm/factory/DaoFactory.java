package com.yph.sm.factory;

import com.yph.sm.dao.AdminDao;
import com.yph.sm.dao.AdminDaoImpl;

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
}
