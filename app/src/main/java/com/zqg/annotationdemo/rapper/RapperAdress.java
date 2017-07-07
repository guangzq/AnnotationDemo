package com.zqg.annotationdemo.rapper;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhuqiguang on 17/7/6.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface RapperAdress {
    //住址枚举
    enum Adress{SICHUAN, BEIJING, SHANDONG}
    //住址属性
    Adress rapperAdress() default Adress.BEIJING;
}
