package com.yanpanghong.study.week14;

/**
 * @ClassName WorkSell
 * @Description
 * @Author YPH
 * @Date 2020/12/7
 **/

public class WorkSell extends Thread {
    public WorkSell() {
    }
    public WorkSell(String name) {
        super(name);
    }
    static WorkSell s1 = new WorkSell();
    //定义票数为静态变量,所有对象共用一个
    public static int i=10;
    @Override
    public void run() {
        while(true) {
            //加锁实现线程同步
            synchronized (s1) {
                if(i>0) {
                    System.out.println(getName()+":正在售卖第---->"+(i--)+"张票");
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }else {
                    System.err.println(getName()+"票已经售完!!!");
                    break;
                }
            }
        }
    }
}
