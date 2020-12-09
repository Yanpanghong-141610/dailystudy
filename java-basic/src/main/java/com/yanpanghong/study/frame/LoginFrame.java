package com.yanpanghong.study.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName LoginFrame
 * @Description
 * @Author YPH
 * @Date 2020/11/9
 **/

public class LoginFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel leftPanel;
    private JPanel bottomPanel;
    private JPanel topPanel;
    private JPanel rightPanel;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JFormattedTextField 登录;

//    public LoginFrame(){-【8
//        //调用初始化方法
//        init();
//    }

//    private void init(){
//        setTitle("LoginFrame");
        
//        JFrame frame = new JFrame("LoginFrame");
//        frame.setContentPane(new LoginFrame().mainPanel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setVisible(true);
//    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginFrame");
        frame.setContentPane(new LoginFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
