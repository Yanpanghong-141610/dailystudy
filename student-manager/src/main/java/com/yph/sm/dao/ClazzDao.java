package com.yph.sm.dao;

import com.yph.sm.dao.impl.ClazzDaoImpl;
import com.yph.sm.entity.Clazz;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName ClazzDao
 * @Description 班级dao接口
 * @Author YPH
 * @Date 2020/11/21
 **/
public interface ClazzDao {
    /**
     * 按照院系id查询班级
     * @param departmentId 院系id
     * @return List<CClass>院系班级集合
     * @throws SQLException异常
     */
    List<Clazz> selectByDepartmentId(int departmentId) throws SQLException;

    /**
     * 新增班级
     * @param clazz 入参班级实体
     * @return int
     * @throws SQLException 异常
     */
    int insertClazz(Clazz clazz)throws SQLException;
    /**
     * 删除班级
     * @param clazz 入参班级实体
     * @return int
     * @throws SQLException 异常
     */
    int deleteClazz(Integer id) throws SQLException;

    /**
     *
     * @return List<Clazz>
     * @throws SQLException
     */
    List<Clazz> selectAll() throws SQLException;

}