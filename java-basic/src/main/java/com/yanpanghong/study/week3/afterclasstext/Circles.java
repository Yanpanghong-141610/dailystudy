package com.yanpanghong.study.week3.afterclasstext;

/**
 * @ClassName Circles
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/19
 **/

public class Circles {
    private int r;
    Circles(int r ){
        this.r=r;
    }
    //判断点到圆的什么地方，在圆内返回1,在圆外返回-1,在圆上返回0
    int judge(Points p){
        int xxyy = p.getX()*p.getX()+p.getY()*p.getY();
        int rr = this.r*this.r;
        if (xxyy>r){
            return -1;
        }
        else if (xxyy<rr){
            return 1;
        }
        else {
            return 0;
        }
    }
}
