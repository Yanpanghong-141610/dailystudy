package com.yanpanghong.study.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/12
 **/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String name;
    private Integer price;
    private Date publishDate;

}
