package com.haier.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/8/2 14:01
 */
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited //如果超类拥有此注解,则子类自动拥有此注解
public @interface SKey {
    String value() default "";
}
