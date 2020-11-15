package com.yph.sm.dao;

import com.yph.sm.entity.Admin;
import com.yph.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdminDaoTest {
       private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();
       @Test
        public void findAdminByAccount(){
        Admin admin;
        try{
            admin = adminDao.findAdminByAccount("yc@qq.com");
            assertEquals("严庞虹",admin.getAdminName());
            System.out.println(admin);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}