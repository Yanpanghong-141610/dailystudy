package com.yph.sm.service;

import com.yph.sm.entity.Reward;
import com.yph.sm.factory.ServiceFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RewardServiceTest {
    private final RewardService rewardService = ServiceFactory.getRewardServiceInstance();

    @Test
    public void selectAll(){
        List<Reward> rewardList = rewardService.selectAll();
        rewardList.forEach(System.out::println);
    }

}