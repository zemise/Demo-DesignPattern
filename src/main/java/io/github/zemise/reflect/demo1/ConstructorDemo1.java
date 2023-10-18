package io.github.zemise.reflect.demo1;

import java.lang.reflect.Constructor;

public class ConstructorDemo1 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1("10", "20", "30");
        Class<? extends  Demo1> clazz = d1.getClass();

        // 获得所有构造方法
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("查看是否允许带有可变数量的参数：" + constructor.isVarArgs());
            System.out.println("该构造方法的入口参数类型依次为：");
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType);
            }
        }
    }

}
