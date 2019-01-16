package com.haier.util;

import lombok.extern.slf4j.Slf4j;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

@Slf4j
public class ClassUtil {

    /**
     * @description: 根据包名获取所有类名(不包含子包)
     * @params: [packageName-包名]
     * @return: java.util.List<java.lang.String>
     * @author: luqiwei
     * @date: 2018-08-08
     */
    public static List<String> getClassName(String packageName) {
        return getClassName(packageName, false);
    }

    /**
     * @description: 根据包名获取该包下的所有类名
     * @params: [packageName-包名, recursion-是否递归获取子包中的类名]
     * @return: java.util.List<java.lang.String>
     * @author: luqiwei
     * @date: 2018-08-08
     */
    public static List<String> getClassName(String packageName, boolean recursion) {
        List<String> fileNames = null;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        String packagePath = packageName.replace(".", "/");
        URL url = loader.getResource(packagePath);
        //log.info("url:"+url);
        if (url != null) {
            String type = url.getProtocol();
            //log.info("type:"+type);
            if (type.equals("file")) {
                fileNames = getClassNameByFile(url.getPath(), null, recursion);
            } else if (type.equals("jar")) {
                fileNames = getClassNameByJar(url.getPath(), recursion);
            }
        } else {
            fileNames = getClassNameByJars(((URLClassLoader) loader).getURLs(), packagePath, recursion);
        }
        return fileNames;
    }

    private static List<String> getClassNameByFile(String filePath, List<String> className, boolean childPackage) {
        List<String> myClassName = new ArrayList<>();
        File file = new File(filePath);
        File[] childFiles = file.listFiles();
        for (File childFile : childFiles) {
            if (childFile.isDirectory()) {
                if (childPackage) {
                    myClassName.addAll(getClassNameByFile(childFile.getPath(), myClassName, childPackage));
                }
            } else {
                String childFilePath = childFile.getPath();
                if (childFilePath.endsWith(".class")) {
                    childFilePath = childFilePath.substring(childFilePath.indexOf("\\classes") + 9, childFilePath.lastIndexOf("."));
                    childFilePath = childFilePath.replace("\\", ".");
                    myClassName.add(childFilePath);
                }
            }
        }
        return myClassName;
    }

    private static List<String> getClassNameByJar(String jarPath, boolean childPackage) {
        List<String> myClassName = new ArrayList<>();
        String[] jarInfo = jarPath.split("!");
//        log.info("jarInfo:" + jarInfo);
        String jarFilePath = jarInfo[0].substring(jarInfo[0].indexOf("/"));
//        log.info("jarFilePath:"+jarFilePath);

        String packagePath = jarInfo[1].substring(1);
        String packageName = jarInfo[2];
//        log.info("packagePath:"+packagePath);
        try {
            JarFile jarFile = new JarFile(jarFilePath);
//            log.info("jarFileName:"+jarFile.getName());
//            log.info("jarFileSize:"+jarFile.size());
            Enumeration<JarEntry> entrys = jarFile.entries();

            while (entrys.hasMoreElements()) {
                JarEntry jarEntry = entrys.nextElement();
                String entryName = jarEntry.getName();
//                log.info("entryname:"+entryName);
                if (entryName.endsWith(".class")) {

                    if (childPackage) {
                        if (entryName.startsWith(packagePath)) {
                            entryName = entryName.replace("/", ".").substring(0, entryName.lastIndexOf("."));
                            myClassName.add(entryName);
                        }
                    } else {
                        int index = entryName.lastIndexOf("/");
                        String myPackagePath;
                        if (index != -1) {
                            myPackagePath = entryName.substring(0, index);
                        } else {
                            myPackagePath = entryName;
                        }
//                        log.info("myPackagePath:"+myPackagePath);
                        if (myPackagePath.equals(packagePath + packageName)) {
                            String target = entryName.substring(packagePath.length() + 1, entryName.lastIndexOf(".")).replaceAll("/", ".");
                            myClassName.add(target);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return myClassName;
    }


    private static List<String> getClassNameByJars(URL[] urls, String packagePath, boolean childPackage) {
        List<String> myClassName = new ArrayList<>();
        if (urls != null) {
            for (int i = 0; i < urls.length; i++) {
                URL url = urls[i];
                String urlPath = url.getPath();
                // 不必搜索classes文件夹
                if (urlPath.endsWith("classes/")) {
                    continue;
                }
                String jarPath = urlPath + "!/" + packagePath;
                myClassName.addAll(getClassNameByJar(jarPath, childPackage));
            }
        }
        return myClassName;
    }
}
