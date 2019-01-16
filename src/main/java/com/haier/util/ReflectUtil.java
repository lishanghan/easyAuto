package com.haier.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Description: 反射相关的工具
 * @Author: luqiwei
 * @Date: 2018/5/23 20:14
 */
@Slf4j
public class ReflectUtil {
    /**
     * @description: 统一将po对象中String类型的字段的值加上%sourceFieldValue%,在做like查询时可先调用此方法给字段加上%
     * @params: [po-需要统一设置的对象,isExtendsClass-是否是继承类,如果是继承类,则会自动获取设置父类属性值]
     * @return: T
     * @author: luqiwei
     * @date: 2018-05-23
     */
    public static <T> void setFieldAddPercentAndCleanZero(T po, Boolean isExtendsClass) {
        if (po == null) {
            return;
        }
        Field[] declaredFields = po.getClass().getDeclaredFields();
        setField(po, declaredFields, true);
        //如果是继承类,则这里再处理父类的字段值
        if (isExtendsClass) {
            Field[] supperDeclaredFields = po.getClass().getSuperclass().getDeclaredFields();
            setField(po, supperDeclaredFields, true);
        }
    }

    /**
     * @description: 过滤对象中无用的字段, 将其设置为null, 比如String类型的字段值为"",Integer|Short类型的字段值为0,
     * 都将统一设置为null
     * @params: [po, isExtendsClass]
     * @return: void
     * @author: luqiwei
     * @date: 2018-06-01
     */
    public static <T> void setInvalidFieldToNull(T po, Boolean isExtendsClass) {
        if (po == null) {
            return;
        }
        Field[] declaredFields = po.getClass().getDeclaredFields();
        setField(po, declaredFields, false);
        if (isExtendsClass) {
            Field[] supperDeclaredFields = po.getClass().getSuperclass().getDeclaredFields();
            setField(po, supperDeclaredFields, false);
        }
    }

    private static <T> void setField(T t, Field[] declaredFields, Boolean addPercent) {
        if (addPercent == null) {
            addPercent = false;
        }
        for (Field field : declaredFields) {
            field.setAccessible(true);
            try {
                if (field.getType() == String.class) {//设置String类型字段
                    String fieldValue = (String) field.get(t);
                    if (fieldValue != null) {//字段值不为null
                        if (StringUtils.isBlank(fieldValue)) {//为""字段直接设置为null
                            field.set(t, null);
                        } else if (addPercent) {//不为"",且需要加%
                            field.set(t, "%" + fieldValue.trim() + "%");
                        } else {//不为"",且不需要加%
                            field.set(t, fieldValue.trim());
                        }
                    }
                }

                if (field.getType() == Integer.class) {
                    Integer fieldValue = (Integer) field.get(t);
                    if (fieldValue != null && fieldValue == 0) {
                        field.set(t, null);
                    }
                }
                if (field.getType() == Short.class) {
                    Short fieldValue = (Short) field.get(t);
                    if (fieldValue != null && fieldValue == 0) {
                        field.set(t, null);
                    }
                }
            } catch (IllegalAccessException e) {
                log.error("处理对象字段时IllegalAccessException异常", e);
                continue;
            }
        }
    }


    /**
     * @description: 将父类的属性值复制到子类中
     * @params: [parent, child]
     * @return: void
     * @author: luqiwei
     * @date: 2018-06-29
     */
    public static <T, K extends T> void cloneParentToChild(T parent, K child) {

        Field[] childFields = child.getClass().getSuperclass().getDeclaredFields();
        for (Field f : childFields) {
            f.setAccessible(true);
            String fname = f.getName();
            Object value = getFieldValue(parent, fname, false);
            try {
                f.set(child, value);
            } catch (IllegalAccessException e) {
                log.warn(e.toString());
            }
        }
    }

    /**
     * @description: 根据对象属性名获取属性值
     * @params: [t, fieldName]
     * @return: java.lang.Object
     * @author: luqiwei
     * @date: 2018-07-05
     */
    private static <T> Object getFieldValue(T t, String fieldName, Boolean getSupperClass) {
        Field[] fields;
        if (getSupperClass) {
            fields = t.getClass().getSuperclass().getDeclaredFields();
        } else {
            fields = t.getClass().getDeclaredFields();
        }
        for (Field f : fields) {
            f.setAccessible(true);
            if (f.getName().equals(fieldName)) {
                try {
                    return f.get(t);
                } catch (IllegalAccessException e) {
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * @description: 将子类中继承于父类的属性值复制到父类中
     * @params: [parent, child]
     * @return: void
     * @author: luqiwei
     * @date: 2018-07-12
     */
    public static <T, K extends T> void cloneChildToParent(T parent, K child) {
        Field[] fields = parent.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String fname = field.getName();
            Object value = getFieldValue(child, fname, true);
            try {
                field.set(parent, value);
            } catch (IllegalAccessException e) {
                log.warn(e.toString());
            }
        }
    }

    /**
     * @description: 根据注解类型, 字段类型获取对象中符合条件的第一个字段的值,
     * @params: [po-对象, annotationClass-注解类型, fieldType-字段类型]
     * @return: 对应字段的值, 如果未正常获取到, 则返回null
     * @author: luqiwei
     * @date: 2018-08-31
     */
    public static <T, K extends Annotation, M> M getFirstPublicFieldValueByAnnoAndFieldType(T po, Class<K> annotationClass, Class<M> fieldType) {
        Field[] fields = po.getClass().getFields();
        for (Field field : fields) {
            K annotation = field.getAnnotation(annotationClass);
            if (annotation != null) {
                try {
                    Class<?> type = field.getType();
                    if (type.equals(fieldType)) {
                        M o = (M) field.get(po);
                        return o;
                    }
                } catch (IllegalAccessException e) {
                    return null;
                }

            }
        }
        return null;
    }

    /**
     * 根据注解类型,设置对象中被此注解标记的第一个公共字段的值
     *
     * @param po
     * @param annotationClass
     * @param value
     * @param <T>
     * @param <K>
     */
    public static <T, K extends Annotation> void setFirstPublicFieldValueByAnno(T po, Class<K> annotationClass, Object value) {
        Field[] fields = po.getClass().getFields();
        for (Field field : fields) {
            K annotation = field.getAnnotation(annotationClass);
            if (annotation != null) {
                try {
                    field.set(po, value);
                } catch (IllegalAccessException e) {
                    break;
                }
                break;
            }
        }
    }
}
