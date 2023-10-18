package io.github.zemise.reflect.annotation.demo1;


public @interface DefaultValueAnnotation {
    String describe() default "<默认值>";

    Class<?> type() default void.class;
}
