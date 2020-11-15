package com.yph.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Admin
 * @Description Admin实体类
 * @Author YPH
 * @Date 2020/11/14
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admin {
    private Integer id;
    private String account;
    private String password;
    private String adminName;
}
