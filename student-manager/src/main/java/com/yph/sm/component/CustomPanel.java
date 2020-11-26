package com.yph.sm.component;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName CustomPanel
 * @Description 自定义面板
 * @Author YPH
 * @Date 2020/11/24
 **/

public class CustomPanel extends JPanel {
    private final String path;
    public CustomPanel(String path){this.path = path;}

    /**
     * 绘制背景图片，允许这个JPanel可以在图片上添加其他组件
     *
     * @param g 绘制图像
     */
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Image bg = null;
        try{
            bg = ImageIO.read(new File(path));
        }catch (IOException e){
            e.printStackTrace();
        }
        g.drawImage(bg,0,0,getWidth(),getHeight(),null);
    }
}
