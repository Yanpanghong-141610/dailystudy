package com.yph.sm.entity;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.*;

import java.util.Date;

/**
 * @ClassName Student
 * @Description 学生实体类
 * @Author YPH
 * @Date 2020/11/24
 **/
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    private String id;
    private Integer classId;
    private String studentName;
    private String phone;
    private Short gender;
    private Date birthday;
    private String avatar;
    private String address;

}
