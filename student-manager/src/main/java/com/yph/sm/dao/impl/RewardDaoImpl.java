package com.yph.sm.dao.impl;

import com.yph.sm.dao.RewardDao;
import com.yph.sm.entity.Reward;
import com.yph.sm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName RewardDaoImpl
 * @Description 奖惩Dao实现类
 * @Author YPH
 * @Date 2020/12/8
 **/

public class RewardDaoImpl implements RewardDao {
    @Override
    public List<Reward> getAll() throws SQLException{
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT * FROM t_reward";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Reward> rewardList = new ArrayList<>();
        while (rs.next()){
            Reward reward = new Reward();
            reward.setId(rs.getInt("id"));
            reward.setRewardName(rs.getString("reward_name"));
            reward.setRewardLogo(rs.getString("reward_logo"));
            rewardList.add(reward);
        }
        rs.close();
        pstmt.close();
        jdbcUtil.closeConnection();
        return rewardList;
    }

    @Override
    public int insertReward(Reward reward) throws SQLException{
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql ="INSERT INTO t_reward(reward_name,reward_logo)VALUES(?,?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, reward.getRewardName());
        pstmt.setString(2, reward.getRewardLogo());
        int n = pstmt.executeUpdate();
        pstmt.close();
        connection.close();
        return n;
    }

    @Override
    public int deleteReward(Reward reward, int id) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "DELETE FROM t_reward WHERE id ="+id;
        PreparedStatement pstmt = connection.prepareStatement(sql);
        int n = pstmt.executeUpdate();
        pstmt.close();
        connection.close();
        return n;
    }
}
