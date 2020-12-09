package com.yph.sm.component;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName ImgPanel
 * @Description 自定义绘制背景图的面板类
 * @Author YPH
 * @Date 2020/12/5
 **/

public class ImgPanel extends JPanel {
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    protected void paintComponent(Graphics g) {
        ImageIcon icon = new ImageIcon("E:\\pic" + fileName);
        Image image = icon.getImage();
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), icon.getImageObserver());
    }
}
