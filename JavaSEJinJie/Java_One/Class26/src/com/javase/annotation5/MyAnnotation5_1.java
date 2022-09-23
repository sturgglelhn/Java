package com.javase.annotation5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})

// 只有加RUNTIME才能被反射
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation5_1 {

    String value() default "北京大兴区";
}
