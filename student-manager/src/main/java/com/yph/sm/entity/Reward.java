package com.yph.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Reward
 * @Description
 * @Author YPH
 * @Date 2020/12/8
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reward {
    private Integer id;
    private String rewardName;
    private String rewardLogo;
}
