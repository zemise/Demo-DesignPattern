package io.github.zemise.reflect.classloader.demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClientDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        String name = "io.github.zemise.reflect.classloader.demo3.HelloService";

        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> class1 = myClassLoader.loadClass(name);

        Constructor<?> constructor = class1.getConstructor();
        Object o = constructor.newInstance();

        Method declaredMethod = class1.getDeclaredMethod("print", null);
        declaredMethod.invoke(o, null);

        MyClassLoader myClassLoader2 = new MyClassLoader();
        Class<?> class2 = myClassLoader2.loadClass(name);

        if(class1 != class2) {
            System.out.println("different classes");
        }
    }
}
