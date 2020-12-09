package com.yanpanghong.study.week5;

/**
 * @ClassName StudentService
 * @Description 学生服务接口
 * @Author YPH
 * @Date 2020/11/2
 **/
public interface StudentService {
    boolean checkHealth(Student student)throws TooWeightException;
}
