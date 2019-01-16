package com.haier.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @Description: IO相关的工具
 * @Author: luqiwei
 * @Date: 2018/11/5 19:52
 */
public class IOUtil {

    /**
     * 将输入流转换为字符串(按UTF-8编码)
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static String read(InputStream inputStream) throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }

        String jsonContent = result.toString(StandardCharsets.UTF_8.name());
        inputStream.close();
        result.close();
        return jsonContent;
    }
}
