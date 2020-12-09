package com.yanpanghong.study.week14.thread;

import lombok.SneakyThrows;

import javax.swing.*;
import java.io.*;
import java.util.Random;

/**
 * @ClassName TextThread
 * @Description
 * @Author YPH
 * @Date 2020/12/7
 **/

public class TextThread  implements Runnable{
    private JLabel textLabel;

    public void setTextLabel(JLabel textLabel) {
        this.textLabel = textLabel;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            File filePath = new File("E:\\java\\text.txt");
            BufferedReader br;
            String s = null;
            try {
                //符输入流中读取文本并缓冲字符
                br = new BufferedReader(new FileReader(filePath));
                while ((s = br.readLine()) != null) {
                    textLabel.setText(s + "\r\n");
                    Thread.sleep(2000);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
