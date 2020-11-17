package com.yph.sm.frame;

import com.yph.sm.entity.Department;
import com.yph.sm.factory.ServiceFactory;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @ClassName MainFrame
 * @Description
 * @Author YPH
 * @Date 2020/11/15
 **/

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel centerPanel;
    private JButton 院系管理Button;
    private JButton 班级管理Button;
    private JButton 学生管理Button;
    private JButton 奖惩管理Button;
    private JPanel departmentPanel;
    private JPanel classPanel;
    private JPanel studentPanel;
    private JPanel rewardPanel;
    private final CardLayout c;

    public MainFrame(){
        init();
        c=new CardLayout();
        centerPanel.setLayout(c);
        centerPanel.add("1",departmentPanel);
        centerPanel.add("2",classPanel);
        centerPanel.add("3",studentPanel);
        centerPanel.add("4",rewardPanel);

        院系管理Button.addActionListener(e ->{
            c.show(centerPanel,"1");
        });
        班级管理Button.addActionListener(e ->{
            c.show(centerPanel,"2");
        });
        学生管理Button.addActionListener(e ->{
            c.show(centerPanel,"3");
        });
        奖惩管理Button.addActionListener(e ->{
            c.show(centerPanel,"4");
        });
        showDepartments();
    }

    private void init() {
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    private void showDepartments(){
        departmentPanel.removeAll();
        List<Department> departmentList = ServiceFactory.getDepartmentServiceInstance().selectAll();
        int len = departmentList.size();
        int row = len % 4 ==0 ? len / 4 : len / 4 + 1;
        GridLayout gridLayout = new GridLayout(row,4,15,15);
        departmentPanel.setLayout(gridLayout);
        for (Department department : departmentList){
            JPanel depPanel = new JPanel();
            depPanel.setPreferredSize(new Dimension(200,200));
            depPanel.setBorder(BorderFactory.createTitledBorder(department.getDepartmentName()));
            JLabel logoLabel = new JLabel("<html><img src='"+department.getLogo()+"'width=400 height=400/></html>");
            depPanel.add(logoLabel);
            departmentPanel.add(depPanel);
            departmentPanel.revalidate();
        }
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
