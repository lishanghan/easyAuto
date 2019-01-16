package com.haier.util;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/25 15:03
 */
@Slf4j
public class EnumUtil {

    /**
     * @description: 获取所有枚举项
     * @params: [t]
     * @return: java.util.List<java.util.Map   <   java.lang.String   ,   java.lang.Object>>
     * @author: luqiwei
     * @date: 2018-05-30
     */
    public static <T extends Enum> List<Map<String, Object>> getEnumList(T[] t) {
        List<Map<String, Object>> list = new ArrayList<>();
        for (T _t : t) {
            Map<String, Object> map = new LinkedHashMap<>();
            Field[] declaredFields = _t.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                if (!field.isEnumConstant()) {
                    field.setAccessible(true);
                    if (!field.getType().isInstance(t)) {
                        try {
                            map.put(field.getName(), field.get(_t));
                        } catch (IllegalAccessException e) {
                            log.error("获取枚举类失败:", e);
                        }
                    }
                }
            }
            list.add(map);
        }
        return list;
    }
}
