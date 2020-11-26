package com.yph.sm.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.io.File;
import java.util.UUID;

/**
 * @ClassName AliOSSUtil
 * @Description 阿里云OSS上传工具类
 * @Author YPH
 * @Date 2020/11/21
 **/

public class AliOSSUtil {
    public static String ossUpload(File file) {
        String bucketDomain = "https://yan-niit.oss-cn-hangzhou.aliyuncs.com/";
        //Endpoint以杭州为例
        String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
        String accessKeyId = "LTAI4G9Sb11meuxgTt8Zk4Nj";
        String  accessKeySecret = "uH6PTGL1JPflE2I2KszQH6SnaPcZre";
        //Bucket名称
        String bucketName = "yan-niit";
        //目录名称
        String fileDir = "img/";
        //获得本地文件的文件名
        String fileName = file.getName();
        //上传后文件名生成
        String fileKey = UUID.randomUUID().toString() + fileName.substring(fileName.indexOf("."));
        //创建OSSClient实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        //上传file到BucketName的FileDir目录下，用fileKey作为新的文件名存储
        ossClient.putObject(bucketName, fileDir + fileKey, file);
        //关闭OSSClient实例
        ossClient.shutdown();
        //返回URL组成：域名+目录+fileKey
        return bucketDomain + fileDir + fileKey;
    }

    public static void main(String[] args) {
        File file = new File("E:\\pic\\1.jpg");
        String url = ossUpload(file);
        System.out.println(url);
    }
}
