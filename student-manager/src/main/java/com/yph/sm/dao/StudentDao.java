package com.yph.sm.dao;

import com.yph.sm.vo.StudentVo;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName StudentDao
 * @Description 学生Dao接口
 * @Author YPH
 * @Date 2020/11/23
 **/
public interface StudentDao {
    /**
     * 查询所有学生（视图对象）
     *
     * @return 学生视图列表数据
     * @throws SQLException 异常
     */
    List<StudentVo> selectAll() throws SQLException;

    List<StudentVo> getAll() throws SQLException;

    /**
     * 根据院系Id查询学生
     * @param depId 院系Id
     * @return list
     * @throws SQLException
     */
    List<StudentVo> selectByDepId(int depId) throws SQLException;

    /**
     * 根据班级id查询学生
     * @param classId 班级id
     * @return list
     * @throws SQLException
     */
    List<StudentVo> selectByClassId(int classId) throws SQLException;

    /**
     * 根据关键字查询学生
     * @param keywords 关键字
     * @return list
     * @throws SQLException
     */
    List<StudentVo> selectByKeywords(String keywords) throws SQLException;
}
