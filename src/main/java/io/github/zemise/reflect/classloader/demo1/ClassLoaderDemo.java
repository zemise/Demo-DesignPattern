package io.github.zemise.reflect.classloader.demo1;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader cl = ClassLoaderDemo.class.getClassLoader();

        while(null != cl) {
            System.out.println(cl.getClass().getName());
            cl = cl.getParent();
        }

        System.out.println(String.class.getClassLoader());
    }
}
