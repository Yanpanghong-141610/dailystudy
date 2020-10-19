package com.yanpanghong.study.week3;

import lombok.*;

/**
 * @ClassName Ponit
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/19
 **/
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
    @Getter
    @Setter
public class Ponit {
    protected Integer x;
   protected Integer y;

    public Ponit(){
        System.out.println("点被初始化");
    }

    public Ponit(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("带参数的点被初始化");
    }

    public void print(){
        System.out.println("横坐标:"+this.x+"纵坐标"+this.y);
    }
}
