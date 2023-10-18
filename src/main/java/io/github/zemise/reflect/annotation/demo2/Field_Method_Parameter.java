package io.github.zemise.reflect.annotation.demo2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Field_Method_Parameter {
    // 定义一个没有默认值的String型成员
    String describe();

    // 定义一个具有默认值的Class成员
    Class<?> type() default void.class;
}
