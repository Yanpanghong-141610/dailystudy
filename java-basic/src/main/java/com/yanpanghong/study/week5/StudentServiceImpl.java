package com.yanpanghong.study.week5;

/**
 * @ClassName StudentServiceImpl
 * @Description Student类的业务
 * @Author YPH
 * @Date 2020/11/2
 **/

public class StudentServiceImpl implements StudentService{
    /**
     * 给Student对象体检
     *
     * @param student
     */
    @Override
    public boolean checkHealth(Student student) throws TooWeightException{
        boolean flag = false;
        if(student.getWeight()>100){
            throw new TooWeightException("体重超重!!");
        }else {
            flag = true;
        }
        return flag;
    }
}
