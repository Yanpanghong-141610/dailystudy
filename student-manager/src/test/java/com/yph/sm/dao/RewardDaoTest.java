package com.yph.sm.dao;

import com.yph.sm.entity.Reward;
import com.yph.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class RewardDaoTest {
   private final RewardDao rewardDao = DaoFactory.getRewardDaoInstance();

   @Test
    public void getAll(){
       List<Reward> rewardList = null;
       try{
           rewardList = rewardDao.getAll();
       }catch (SQLException e){
           e.printStackTrace();
       }
       assert rewardList !=null;
       rewardList.forEach(System.out::println);
   }

   @Test
    public void insert(){
       int n=0;
       Reward reward = Reward.builder()
               .rewardName("测试奖惩")
               .rewardLogo("1.jpg")
               .build();
       try{
           n = rewardDao.insertReward(reward);
       }catch (SQLException e){
           e.printStackTrace();
       }
       assertEquals(1,n);
   }
}