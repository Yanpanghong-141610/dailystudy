package com.yph.sm.frame;

import com.yph.sm.entity.Admin;
import com.yph.sm.factory.ServiceFactory;
import com.yph.sm.utils.ResultEntity;
import javafx.scene.control.PasswordField;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName AdminLoginFrame
 * @Description
 * @Author YPH
 * @Date 2020/11/15
 **/

public class AdminLoginFrame  extends JFrame{
    private JPanel mainPanel;
    private JTextField accountField;
    private JButton loginBtn;
    private JButton resetBtn;
    private JPasswordField passwordField;
    private JLabel 账号;
    private JLabel 密码;

    public AdminLoginFrame(){
        this.setTitle("AdminLoginFrame");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        loginBtn.addActionListener(e ->{
            //获得输入的账号和密码，注意密码框组件的使用方法
            String account = accountField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();
            ResultEntity resultEntity = ServiceFactory.getAdminServiceInstance().adminLogin(account,password);
            JOptionPane.showMessageDialog(mainPanel,resultEntity.getMessage());
            if (resultEntity.getCode()==0){
                //关闭登录界面，进入主界面
                this.dispose();
                Admin admin = (Admin) resultEntity.getData();
                new MainFrame(admin.getAdminName());
            }else{
                accountField.setText("");
               passwordField.setText("");
            }
        });
        resetBtn.addActionListener(e->{
            accountField.setText("");
            passwordField.setText("");
        });
        }

    public static void main(String[] args) {
        new AdminLoginFrame();
    }
    }

