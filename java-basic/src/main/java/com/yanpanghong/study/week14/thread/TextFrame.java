package com.yanpanghong.study.week14.thread;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName TextFrame
 * @Description
 * @Author YPH
 * @Date 2020/12/7
 **/

public class TextFrame extends JFrame {
    public  TextFrame(){
        init();

        getContentPane().setBackground(new Color(0,0,0));
        setTitle("Text frame");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void init(){
        TextThread lt = new TextThread();
//        lt.setFrame(this);
        new Thread(lt).start();
    }

    public static void main(String[] args) {
        new TextFrame();
    }
}
