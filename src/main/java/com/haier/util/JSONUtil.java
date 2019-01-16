package com.haier.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.haier.enums.RegexEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: json封装类, 提供json与各种对象互转的方法及异常处理
 * @Author: luqiwei
 * @Date: 2018/5/3 11:28
 */
@Slf4j
public class JSONUtil {

    public static JSONObject str2JSONObj(String json) {
        if (StringUtils.isBlank(json)) {
            return null;
        }
        try {
            return JSON.parseObject(json, Feature.OrderedField);
        } catch (Exception e) {
            log.error(json, e);
            return null;
        }
    }

    public static JSONArray str2JSONArr(String json) {
        if (json == null) {
            return null;
        }
        try {
            return JSON.parseArray(json);
        } catch (Exception e) {
            log.error("", e);
            return null;
        }
    }

    /**
     * @description: 校验字符串是否符合JSON格式, 如果符合, 返回JSON格式化后的字符串, 否则, 返回null
     * @params: 待校验的json字符串
     * @return: JSON格式化后的字符串
     * @author: luqiwei
     * @date: 2018-08-21
     */
    public static String verify(String json) {
        try {
            JSONObject jsonObject = JSONObject.parseObject(json, Feature.OrderedField);
            if (jsonObject != null) {
                json = JSONObject.toJSONString(jsonObject, SerializerFeature.WriteMapNullValue);
            }
        } catch (RuntimeException e) {
            json = null;
        } finally {
            return json;
        }
    }

    public static Map<String, Object> str2Map(String json) {
        try {
            return (Map<String, Object>) JSON.parse(json);
        } catch (Exception e) {
            log.error("", e);
            return null;
        }
    }

    /**
     * @description: 根据表达式(JSON元路径)获取字符串形式的值
     * 如果jsonStr转换为JSON对象失败,返回null
     * 如果根据exp未能找到相应的值,返回null
     * @params: jsonStr-字符串形式的JSONObject对象,pathExp-元路径,例:${aaa[0{title
     * @return:
     * @author: luqiwei
     * @date: 2018-10-10
     */
    public static String getValue(String jsonStr, String pathExp) {
        if (StringUtils.isBlank(pathExp)) {
            return null;
        }
        JSONObject jsonObject = str2JSONObj(jsonStr);
        if (jsonObject == null) {
            return null;
        }
        Pattern p;
        Matcher m;
        //匹配到简单形式的表达式,例:$title
        //将从JSON对象中,找到第一个名称为title的key,并且获取其值
        //^\$(\w+)
        if (pathExp.matches(RegexEnum.SIMPLE_JSONKEY.getRegex())) {
            p = Pattern.compile(RegexEnum.SIMPLE_JSONKEY.getRegex());
            m = p.matcher(pathExp);
            while (m.find()) {
                String key = m.group(1);//正则中第一个()中的内容
                return getValueByKey(jsonObject, key);
            }
        }
        //匹配到复杂形式的表达式,例${aaa[0{title,将根据路径寻找对应值
        else if (pathExp.matches(RegexEnum.HARD_JSONKEY.getRegex())) {
            p = Pattern.compile(RegexEnum.META_PATH.getRegex());//(\{\w+)|(\[\d+)   group(1)或者group(2),其中一个必有值(匹配正则),一个必为null
            m = p.matcher(pathExp);

            List<String> metaPaths = new ArrayList<>();// list中数据类似 [ "{aa" , "[0" , "{bb" ],注意,这是有顺序的
            while (m.find()) {
                //group(1)匹配\{\w+
                //group(2)匹配\[\d+
                //group(1)和group(2)是或的关系,同一个位置,只会匹配到一个,另一个必为null
                metaPaths.add(m.group(1) != null ? m.group(1) : m.group(2));
            }
            return getValueByMetaPath(jsonObject, metaPaths);
        }
        return null;
    }

    /**
     * 通过key获取JSON对象中的value值,
     * 注意:递归解析JSON对象时,JSON对象中可能现出重复的key,此时将返回第一个出现的非null值
     *
     * @param jsonObj
     * @param key
     * @return
     */
    public static String getValueByKey(JSONObject jsonObj, String key) {
        Map<String, String> map = new HashMap<>();
        json2Map(jsonObj, map);
        return map.get(key);
    }

    public static String getValueByMetaPath(JSONObject jsonObj, List<String> metaPaths) {
        if (metaPaths.size() == 0 || jsonObj == null) {
            return null;
        }
        if (metaPaths.size() == 1) {//仅有一层,如:{title,直接获取值即可
            String metaPath = metaPaths.get(0);
            if (metaPath.startsWith("{")) {
                return jsonObj.getString(metaPath.substring(1));
            } else {//以[开头,第一项就以[开头,这种情况暂时不支持,因为现阶段看,所有的返回结果都是JSONObject类型
                return null;
            }
        }

        JSON json = ObjectUtils.clone(jsonObj);
        //metaPaths.size>1
        for (int i = 0; i < metaPaths.size(); i++) {
            //每次循环前,先检查前一次找到的JSON对象是否为null,如果为null,则返回null,停止向后查找
            if (json == null) {
                return null;
            }
            String currentMetaPath = metaPaths.get(i);
            String nextMetaPath = null;
            if (i != metaPaths.size() - 1) {
                nextMetaPath = metaPaths.get(i + 1);
            }
            String pathName = currentMetaPath.substring(1);

            try {
                if (nextMetaPath != null) {//非最后一项
                    if (currentMetaPath.startsWith("{")) {
                        JSONObject jo = (JSONObject) json;
                        if (nextMetaPath.startsWith("{")) {//{aaa{bbb
                            json = jo.getJSONObject(pathName);
                        } else {//{aaa[0
                            json = jo.getJSONArray(pathName);
                        }

                    } else {
                        JSONArray ja = (JSONArray) json;
                        if (nextMetaPath.startsWith("{")) {//[0{aaa
                            json = ja.getJSONObject(Integer.parseInt(pathName));
                        } else {//[0[0
                            json = ja.getJSONArray(Integer.parseInt(pathName));
                        }
                    }
                } else {//最后一项,获取值
                    if (currentMetaPath.startsWith("{")) {
                        return ((JSONObject) json).getString(pathName);
                    } else {
                        return ((JSONArray) json).getString(Integer.parseInt(pathName));
                    }
                }
            } catch (Exception e) {
                log.error("根据metaPaths获取JSON值发生异常:", e);
                return null;
            }
        }
        return null;
    }

    /**
     * 将JSONObject递归解析成Map,如果出现重复的key,则以第一次出现的key对应的值(非null)为准
     * 如果JSONArray中嵌套JSONObject,则递归解析
     * 如果JSONArray中再次嵌套JSONArray,则忽略(此情况极少出现)
     *
     * @param jsonObj
     * @param map
     */
    public static void json2Map(JSONObject jsonObj, Map<String, String> map) {
        for (String key : jsonObj.keySet()) {
            map.putIfAbsent(key, jsonObj.getString(key));//java8 : Map.putIfAbsent,如果map key还未建立链接,则此方法将建立新链接
            if (jsonObj.get(key) instanceof JSONObject) {
                json2Map((JSONObject) jsonObj.get(key), map);
            } else if (jsonObj.get(key) instanceof JSONArray) {
                JSONArray jsonArray = (JSONArray) jsonObj.get(key);
                for (Object o : jsonArray) {
                    if (o instanceof JSONObject) {
                        json2Map((JSONObject) o, map);
                    }
                    //如果数组里面嵌套数组(这种情况极少),暂时忽略
                }
            }
        }
    }
}
