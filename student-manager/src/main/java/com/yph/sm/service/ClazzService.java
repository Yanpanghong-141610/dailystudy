package com.yph.sm.service;

import com.yph.sm.entity.Clazz;

import java.util.List;

/**
 * @ClassName ClazzService
 * @Description
 * @Author YPH
 * @Date 2020/11/21
 **/
public interface ClazzService {
    /**
     *
     * @param depId 院系Id
     * @return 班级列表
     */
    List<Clazz> getClazzByDepId(int depId);

    /**
     * 新增班级
     *
     * @param clazz 班级实体
     * @return int
     */
    int addClazz(Clazz clazz);

    /**
     *
     * @param clazzId 班级Id
     * @return int
     */
    int deleteClazz(int clazzId);

    /**
     * 查询所有班级
     * @return List<Clazz>
     */
    List<Clazz> selectAll();
}