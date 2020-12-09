package com.yanpanghong.study.week5;

/**
 * @ClassName TooWeightException
 * @Description 超重异常
 * @Author YPH
 * @Date 2020/11/2
 **/

public class TooWeightException extends Exception{
    private String msg;
    public TooWeightException(){
        super();
    }
    public TooWeightException(String msg){
        super();
        this.msg = msg;
    }

    public String showMsg(){
        return  this.msg;
    }
}
