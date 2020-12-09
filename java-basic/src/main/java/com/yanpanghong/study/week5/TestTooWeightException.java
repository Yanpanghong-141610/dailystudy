package com.yanpanghong.study.week5;

/**
 * @ClassName TestTooWeightException
 * @Description
 * @Author YPH
 * @Date 2020/11/2
 **/

public class TestTooWeightException {
    public static void main(String[] args) {
        Student student1 = new Student("aaa",88);
        Student student2 = new Student("bbb",108);
        StudentService ss = new StudentServiceImpl();
        boolean result = false;
        try {
            result = ss.checkHealth(student1);
        }catch (TooWeightException e){
            System.err.println(e.showMsg());
        }finally {
            System.out.println("体检结束");
        }
        if (result){
            System.out.println("体检合格");
        }else {
            System.out.println("体检不合格");
        }
    }
}
