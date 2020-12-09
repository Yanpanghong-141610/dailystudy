package com.yanpanghong.study.week2;

import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName TestGroup
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/12
 **/

public class TestGroup {
    public static void main(String[] args) {
        Book book1 = new Book("java",99,new Date());
        Book book2 = new Book("javaScript",88,new Date());
        Book book3 = new Book("java从入门到精通",121,new Date());
        Book book4 = new Book("java大神养成记",222,new Date());
        Book book5 = new Book("java宝典",101,new Date());

        PhoneDemo phone1 = new PhoneDemo("iphonex",8888);
        PhoneDemo phone2 = new PhoneDemo("iphone8",7777);
        PhoneDemo phone3 = new PhoneDemo("iphonex",6666);

        StudentDemo student1 = new StudentDemo("1001",
                                               "张三",
                                               "男",
                                                phone1,
                                                new Book[]{book1,book2});

        StudentDemo student2 = new StudentDemo("1002",
                "李四",
                "女",
                phone2,
                new Book[]{book1,book2,book3,book4});
        StudentDemo student3 = new StudentDemo("1003",
                "hero",
                "男",
                phone1,
                new Book[]{book5});

        Group group1 = new Group("第一组",
                              new StudentDemo[]{student1,student2
                       });
        Group group2 = new Group("无敌战队",
                                  new StudentDemo[]{student3
                       });

        //System.out.println(student1);
        StudentDemo[] students = group1.getStudents();
        for (StudentDemo student : students)
        {
            System.out.println(student.getStudentName());
        }
    }
}
