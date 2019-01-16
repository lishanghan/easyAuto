package com.haier.util;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @Description: 文件工具类, 提供文件读取写存储的方法
 * @Author: luqiwei
 * @Date: 2018/7/25 20:16
 */
@Slf4j
public class FileUtil {

    /**
     *@description: 读取文件内容
     *@params: [file -文件全路径(String)]
     *@return: java.lang.String
     *@author: luqiwei
     *@date: 2018-07-25
     */
    public static String getContent(String file) {
        File f = new File(file);
        Reader reader = null;
        try {
            reader = new FileReader(f);
            BufferedReader br = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            log.error("文件不存在:" + file);
            return null;
        } catch (IOException e) {
            log.error("读取文件时发生异常");
            return null;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    log.error("关闭文件失败!");//日了狗代码才会走到这里
                }
            }
        }
    }

    /**
     * @description: 写文件,保存到硬盘
     * @params: [content-待保存的内容, fullTargetName-文件名全路径,如C:\Result\hello.java]
     * @return: void
     * @author: luqiwei
     * @date: 2018-07-25
     */
    public static void saveContent(String content, String fullTargetName) {

        File file = new File(fullTargetName);

        //判断文件父目录是否存在,不存在的话,则创建
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        try {
            file.createNewFile();
        } catch (IOException e1) {
            log.error("创建文件失败");
        }

        Writer writer = null;

        try {
            writer = new FileWriter(file);
            writer.write(content);
        } catch (IOException e) {
            log.error("写文件失败!");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
