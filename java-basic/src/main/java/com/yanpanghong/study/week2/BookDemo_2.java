package com.yanpanghong.study.week2;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.Date;

/**
 * @ClassName BookDemo_2
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/12
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode()

public class BookDemo_2 {
    /*
    * name属性
    **/

    private String name;
    private Integer price;
    private Date publishDate;

   public BookDemo_2(String name,Integer price,Date publishDate){

       this.name = name;
       this.price = price;
       this.publishDate = publishDate;
   }

   public BookDemo_2(String name){}

    public static void main(String[] args) {
        BookDemo_2 book = new BookDemo_2("Java",122,new Date());
        BookDemo_2 book1 = new BookDemo_2("高数");
        System.out.println(book);
    }
}
