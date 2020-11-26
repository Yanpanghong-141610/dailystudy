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
    private static final ClazzDao clazzDao = DaoFactory.getClazzDaoInstance();

    @Override
    public List<Clazz> getClazzByDepId(int department) {
        List<Clazz> clazzList = null;
        try {
            clazzList = clazzDao.selectByDepartmentId(department);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return clazzList;
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
    public int deleteClazz(Integer id){
        int n=0;
        try{
            n = clazzDao.deleteClazz(id);
        }catch(SQLException e){
            System.err.print("删除班级信息出现异常");
        }
        return n;
  }

  @Override
    public List<Clazz> selectAll(){
        List<Clazz> clazzList = null;
        try{
            clazzList = clazzDao.selectAll();
        }catch (SQLException e){
            System.err.print("查询班级信息出现异常");
        }
        return clazzList;
  }
}
