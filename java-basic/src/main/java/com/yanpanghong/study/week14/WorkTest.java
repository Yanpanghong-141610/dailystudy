package com.yanpanghong.study.week14;

/**
 * @ClassName WorkTest
 * @Description
 * @Author YPH
 * @Date 2020/12/7
 **/

public class WorkTest {
    private WorkSell work;
    public static void main(String[] args) {
        WorkSell w1 = new WorkSell("窗口1");
        WorkSell w2 = new WorkSell("窗口2");
        WorkSell w3 = new WorkSell("窗口3");
        w2.start();
        w3.start();
        w1.start();
    }
}
