package io.github.zemise.reflect.classloader.demo1;

public class CLInitDemo {
    public static class Hello{
        static {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        String className = CLInitDemo.class.getName() + "$Hello";

        try{
            Class<?> cls = cl.loadClass(className);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }


        System.out.println("==========");
        Class<?> cls = Class.forName(className);
    }
}
