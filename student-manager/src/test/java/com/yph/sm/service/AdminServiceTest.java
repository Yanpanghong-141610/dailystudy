package com.yph.sm.service;

import com.yph.sm.entity.Admin;
import com.yph.sm.factory.ServiceFactory;
import com.yph.sm.utils.ResultEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminServiceTest {
   private final AdminService adminService = ServiceFactory.getAdminServiceInstance();

    @Test
    public void adminLogin() {
        ResultEntity resultEntity = adminService.adminLogin("yc@qq.com","141610");
        assertEquals(0,resultEntity.getCode());
        System.out.println(resultEntity);
    }
}