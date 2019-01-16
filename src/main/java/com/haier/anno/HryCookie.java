package com.haier.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @Description: 标记CookieStore
 * @Author: luqiwei
 * @Date: 2018/8/17 10:23
 */

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface HryCookie {
}
