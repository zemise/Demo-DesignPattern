package io.github.zemise.reflect.annotation.demo2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) {
        Class<?> recordC = null;

        try {
            recordC = Class.forName("io.github.zemise.reflect.annotation.demo2.Record");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("========");
        // 获得所有构造方法
        Constructor<?>[] declaredConstructors = recordC.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            // 查看是否具有指定类型的注释
            if (constructor.isAnnotationPresent(Constructor_Annotation.class)) {
                // 获得指定类型的注释
                Constructor_Annotation ca = (Constructor_Annotation) constructor
                        .getAnnotation(Constructor_Annotation.class);

                System.out.println(ca.value());
            }
            // 获得参数的注释
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            for (int i = 0; i < parameterAnnotations.length; i++) {
                // 获得指定参数注释的长度
                int length = parameterAnnotations[i].length;

                if(length == 0)
                    System.out.println(" 未添加Annotation的参数");
                else
                    for(int k = 0; k <length ;k++){
                        // 获得指定类型的注释
                        Field_Method_Parameter pa = (Field_Method_Parameter) parameterAnnotations[i][k];
                        System.out.println( " " + pa.describe());
                        System.out.println(" "+ pa.type());
                    }
            }
            System.out.println();
        }
    }
}
