package day19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName Studentframe
 * @Description TODO
 * @Author YPH
 * @Date 2020/11/7
 **/
class Studentframe {
    private JPanel mainPanel;
    private JPanel LeftPanel;
    private JPanel topPanel;
    private JPanel centerPanel;
    private JButton 检查Button;
    private JButton 检查Button1;

    public Studentframe() {
        检查Button.addActionListener(e -> {
            System.out.println("click");
            JOptionPane.showMessageDialog(null, "图书上架！");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Studentframe");
        frame.setContentPane(new Studentframe().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800 , 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
