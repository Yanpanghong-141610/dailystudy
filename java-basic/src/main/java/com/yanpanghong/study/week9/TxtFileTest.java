package com.yanpanghong.study.week9;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

/**
 * @ClassName TxtFileTest
 * @Description
 * @Author YPH
 * @Date 2020/11/30
 **/

public class TxtFileTest {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入");
//        String s = scanner.nextLine();
//        char[] chars = s.toCharArray();
//        File file = new File("E:\\hello\\result.txt");
//        Writer out = new FileWriter(file,true);
//        out.write(chars);
//        out.close();
//        String fileName1 = UUID.randomUUID().toString();
//        String fileName2 = UUID.randomUUID().toString();
//        String fileName3 = UUID.randomUUID().toString();
//
//        //方法1.使用FileWriter结合字符数组写入(追加方式)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入");
//        String s = scanner.nextLine();
//        char[] chars = s.toCharArray();
//
//        File file1 = new File("E\\hello"+fileName1+".txt");
//        Writer out = new FileWriter(file1,true);
//        out.write(chars);
//        out.close();
//
//        //方法2使用BufferedWriter
//        File file2 = new File("E\\hello"+fileName2+".txt");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(file2,true));
//        bw.write(s);
//        bw.flush();
//        bw.close();
//
//        //方法3，使用打印流
//        File file3 = new File("E\\hello"+fileName3+".txt");
//        FileOutputStream fos = new FileOutputStream(file3);
//        PrintWriter ps = new PrintWriter(fos,true);
//        ps.print(s);
//        ps.close();
        String fileName1 = UUID.randomUUID().toString();
        String fileName2 = UUID.randomUUID().toString();
        String fileName3 = UUID.randomUUID().toString();
        //方法1
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();

        File file1 = new File("E\\hello"+fileName2+".txt");
        Writer out = new FileWriter(file1,true);
        out.write(chars);
        out.close();
        //方法二
        File file2 = new File("E\\hello"+fileName2+".txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2 ,true));
        bufferedWriter.write(s);
        bufferedWriter.flush();
        bufferedWriter.close();
        //方法三
        File file3  = new File("E\\hello"+fileName2+".txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        PrintWriter printWriter = new PrintWriter(fileOutputStream,true);
        printWriter.print(s);
        printWriter.close();

    }
}
