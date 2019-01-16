package com.haier.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/8/2 13:55
 */
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(java.lang.annotation.ElementType.METHOD)
public @interface Uri {
    String value() default "";
    String desc() default "";
}
