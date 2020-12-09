package com.yanpanghong.study.week7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.DriverPropertyInfo;

/**
 * @ClassName Student
 * @Description
 * @Author YPH
 * @Date 2020/11/16
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    @Override
    public int compareTo(Student o) {
        if (this.getAge() > o.getAge()){
            return 1;
        }else if (this.getAge() < o.getAge()){
            return -1;
        }else {
            return 0;
        }
    }
}
