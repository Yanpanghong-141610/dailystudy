package com.yph.sm.service.impl;

import com.yph.sm.dao.RewardDao;
import com.yph.sm.entity.Reward;
import com.yph.sm.factory.DaoFactory;
import com.yph.sm.service.RewardService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName RewardServiceImpl
 * @Description
 * @Author YPH
 * @Date 2020/12/8
 **/

public class RewardServiceImpl implements RewardService {
    private final RewardDao rewardDao = DaoFactory.getRewardDaoInstance();

    @Override
    public List<Reward> selectAll(){
        List<Reward> rewardList = null;
        try{
            rewardList = rewardDao.getAll();
        }catch (SQLException e){
            System.err.print("查询院系信息出现异常");
        }
        return rewardList;
    }

    @Override
    public int addReward(Reward reward){
        int n = 0;
        try{
            n = rewardDao.insertReward(reward);
        }catch (SQLException e){
            System.err.print("新增奖惩信息出现异常");
        }
        return n;
    }

    @Override
    public int delReward(Reward reward,Integer id){
        int n=0;
        try{
            n = rewardDao.deleteReward(reward,id);
        }catch (SQLException e){
            System.err.print("删除奖惩信息出现异常");
        }
        return  n;
    }
}
