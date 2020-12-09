package com.yanpanghong.study.week2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName StudentDemo
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/12
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDemo {
    private String id;
    private String studentName;
    private String gender;
    private PhoneDemo phone;
    private Book[] book;
}
