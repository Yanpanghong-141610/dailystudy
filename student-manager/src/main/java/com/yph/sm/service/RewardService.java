package com.yph.sm.service;

import com.yph.sm.entity.Reward;

import java.util.List;

/**
 * @ClassName RewardService
 * @Description
 * @Author YPH
 * @Date 2020/12/8
 **/
public interface RewardService {
    /**
     * 查询所有院系
     * @return List<Reward>
     */
    List<Reward> selectAll();

    int addReward(Reward reward);

    int delReward(Reward reward,Integer id);
}
