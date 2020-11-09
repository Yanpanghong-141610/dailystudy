package com.yanpanghong.study.frame1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName LoginFrame
 * @Description TODO
 * @Author YPH
 * @Date 2020/11/9
 **/
public class LoginFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel westPanel;
    private JPanel southPanel;
    private JPanel eastPanel;
    private JPanel loginTextPanel;
    private JPanel loginPanel;
    private JLabel loginTextLabel;
    private JLabel loginTitleLabel;
    private JLabel textLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    public LoginFrame() {
        init();

        loginButton.addActionListener(e -> {
            LoginService ll = new LoginService();
            String account = userTextField.getText();
            char[] password = passwordField.getPassword();
            String passwordStr = new String(password);
            boolean result = ll.login(account, passwordStr);
            if (result) {
                JOptionPane.showMessageDialog(null,"登陆成功！");
                LoginFrame.this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "登陆失败！");
                LoginFrame.this.dispose();
            }

        });
    }

    private void init() {
        setTitle("LoginFrame");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
