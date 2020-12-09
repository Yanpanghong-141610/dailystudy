package day21;

import javax.swing.*;
import java.sql.SQLException;

/**
 * @ClassName LoginFrame
 * @Description
 * @Author YPH
 * @Date 2020/11/12
 **/

public class LoginFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel loginPanel;
    private JPanel loginPanel2;
    private JTextPane loginLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton 登录Button;
    private JLabel tipLabel;

    public LoginFrame(){
        //调用初始化方法
        init();
        登录Button.addActionListener(e ->{
            LoginService l1 = new LoginService();
            String account = accountField.getText();
            char[] password = passwordField.getPassword();
            String passString = new String(password);
            boolean result = true;
            try{
                result = l1.login(account,passString);
            }catch (SQLException e1){
                e1.printStackTrace();
            }
            if (result){
                JOptionPane.showMessageDialog(null,"登录成功"+account);
                LoginFrame.this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"登录失败");
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
