package com.yph.sm.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName StudentVo
 * @Description 学生视图对象类
 * @Author YPH
 * @Date 2020/11/23
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentVo {
    private String id;
    private String departmentName;
    private String className;
    private String studentName;
    private String phone;
    private Short gender;
    private Date birthday;
    private String avatar;
    private String address;
}
