package com.yph.sm.dao;

import com.yph.sm.entity.Reward;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName RewardDao
 * @Description 奖惩接口
 * @Author YPH
 * @Date 2020/12/8
 **/
public interface RewardDao {

    /**
     * 奖惩Dao接口
     * @return List<Reward>
     * @throws SQLException
     */
    List<Reward> getAll() throws SQLException;

    int insertReward(Reward reward) throws SQLException;

    int deleteReward(Reward reward,int id) throws SQLException;
}
