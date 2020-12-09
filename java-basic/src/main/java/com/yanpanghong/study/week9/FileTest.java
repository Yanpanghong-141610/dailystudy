package com.yanpanghong.study.week9;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName FileTest
 * @Description File类的测试程序
 * @Author YPH
 * @Date 2020/11/30
 **/

public class FileTest {
    public static void main(String[] args) {
//        //1.课堂练习1,创建目录，用当前系统日期命名
//        LocalDate today = LocalDate.now();
//        String dirName = today.getYear() + "-" + today.getMonthValue() + "-" + today.getDayOfMonth();
//        File dir = new File("E:" + File.separator + dirName);
//        if (!dir.exists()) {
//            boolean flag = dir.mkdirs();
//            System.out.println(flag);
//        }
//        //课堂练习1-2：然后删除刚才创建的目录，注意判断是否存在
//        //删除目录
//        if(dir.exists()){
//            boolean flag = dir.delete();
//            if (flag) {
//                System.out.println("删除成功！");
//            } else {
//                System.out.println("目录不存在！");
//            }
//        }
//
//        //课堂练习1-3：递归创建目录，顶级目录名：JAVA,一级目录名：面向对象，异常，集合，io，多线程，io下目录：字符流，字节流
//        // 递归功能实现
////        String[] dirNameArray = new String[]{"面向对象", "异常", "集合", "io", "多线程"};
////        String[] childDirNameArray = new String[]{"字节流", "字符流"};
////        File dir2 = new File("E\\"+ "Java");
////        if (!dir2.exists()) {
////            boolean flag = dir2.mkdir();
////            System.out.println(flag ? "Java文件夹创建成功" : "Java文件夹创建失败");
////        }
////        for (String str : dirNameArray) {
////            String targetDirName = dir2.getAbsolutePath() + File.separator + str;
////            if (str.equals("io")) {
////                for (String str1 : childDirNameArray) {
////                    File tmpFile = new File(targetDirName + File.separator + str1);
////                    boolean flag = tmpFile.mkdirs();
////                    System.out.println(flag ? "文件"+tmpFile.getAbsolutePath()+"创建成功" : "文件"+ tmpFile.getAbsolutePath()+"创建失败");
////                }
////            } else {
////                File tmpFile = new File(targetDirName);
////                boolean flag = tmpFile.mkdirs();
////                System.out.println(flag ? "文件"+targetDirName+"创建成功" : "文件"+targetDirName+"创建失败");
////            }
////        }
//        try {
//            List<String> dirList = new ArrayList<>();
//            dirList.add("面向对象");
//            dirList.add("异常");
//            dirList.add("集合");
//            dirList.add("io");
//            dirList.add("多线程");
//            for (String dir : dirList){
//                createDir("E:\\Hello"+dir);
//            }
//
//        } catch (IOException e) {
//            System.err.println("创建失败！");
//        }
//
//    }
//    public static void createDir(String path) throws IOException {
//        if (!path.isEmpty()) {
//            File file = new File(path);
//            if (!file.getParentFile().exists()) {
//                file.getParentFile().mkdirs();
//            }
//            file.mkdirs();
//        }

        //File file = new File("E:" + File.separator + "1.txt");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        File dirs = new File("E\\Hello"+formatter.format(date));
        if (!dirs.exists()) {
            boolean flag = dirs.mkdir();
            System.out.println(flag);
        }
        //删除目录
        if(dirs.exists()){
            boolean flag = dirs.delete();
            if (flag) {
                System.out.println("删除成功！");
            } else {
                System.out.println("目录不存在！");
            }
        }
        try {
            List<String> dirList = new ArrayList<>();
            dirList.add("面向对象");
            dirList.add("异常");
            dirList.add("集合");
            dirList.add("io");
            dirList.add("多线程");
            for (String dir : dirList){
                createDir("E\\Hello"+dir);
            }

        } catch (IOException e) {
            System.err.println("创建失败！");
        }

    }
    public static void createDir(String path) throws IOException {
        if (!path.isEmpty()) {
            File file = new File(path);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.mkdirs();
        }


    }


}
