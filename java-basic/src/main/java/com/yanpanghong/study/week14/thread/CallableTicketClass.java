package com.yanpanghong.study.week14.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName CallableTicketClass
 * @Description
 * @Author YPH
 * @Date 2020/12/7
 **/

public class CallableTicketClass implements Callable<Integer> {
    private int ticket = 20;
    private int windows = 4;
    @Override
    public Integer call(){
        synchronized (this){
            for ( int i = 0;i<windows;i++) {
                //获取当前的线程，只能用 Thread.currentThread() 获取当前的线程名
                Thread.currentThread().setName("窗口" + i);
                if (this.ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ", 卖票;票数还剩：" + ticket--);
                }
            }
            return ticket;
        }

    }
    private void starCallableThread(){
        CallableTicketClass thirdThread = new CallableTicketClass();
        FutureTask<Integer> task = new FutureTask<Integer>(thirdThread);

        new Thread(task,"有返回值的线程").start();

        try {
            Integer integer = task.get();
            System.out.println("starCallableThread, 子线程的返回值="+integer);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CallableTicketClass test = new CallableTicketClass();
        test.starCallableThread();
    }
}
