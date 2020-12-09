package com.yph.sm.service.impl;

import com.yph.sm.dao.ClazzDao;
import com.yph.sm.entity.Clazz;
import com.yph.sm.factory.DaoFactory;
import com.yph.sm.service.ClazzService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName ClazzServiceImpl
 * @Description ClazzServiceImpl
 * @Author YPH
 * @Date 2020/11/21
 **/

public class ClazzServiceImpl implements ClazzService {
    //private static final ClazzDao clazzDao = DaoFactory.getClazzDaoInstance();

    @Override
    public List<Clazz> getClazzByDepId(int depId) {
        List<Clazz> list = null;
        try {
            list = DaoFactory.getClazzDaoInstance().selectByDepartmentId(depId);
        } catch (SQLException e) {
            System.err.println("根据院系id查询班级列表出现异常");
        }
        return list;
    }

    @Override
    public List<Clazz> selectAll() {
        List<Clazz> list = null;
        try {
            list = DaoFactory.getClazzDaoInstance().selectAll();
        } catch (SQLException e) {
            System.err.println("查询所有班级列表出现异常");
        }
        return list;
    }

  @Override
    public  int addClazz(Clazz clazz){
        int n=0;
        try{
            n=DaoFactory.getClazzDaoInstance().insertClazz(clazz);
        }catch (SQLException throwables){
            System.err.println("新增班级出现异常");
        }
        return n;
  }
    @Override
    public int deleteClazz(int clazzId) {
        int n = 0;
        try {
            n = DaoFactory.getClazzDaoInstance().deleteClazz(clazzId);
        } catch (SQLException throwables) {
            System.err.println("删除班级出现异常");
        }
        return n;
    }

}
