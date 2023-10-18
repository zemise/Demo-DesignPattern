package io.github.zemise.reflect.demo3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClientTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<?> clazz = ClientDemo.class;

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(test001.class)){
                System.out.println(declaredMethod.getName());
                declaredMethod.invoke(null);

            }
        }
    }
}
