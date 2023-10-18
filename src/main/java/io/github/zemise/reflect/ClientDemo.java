package io.github.zemise.reflect;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClientDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        JTextField jTextField = new JTextField();
        Class clazz = jTextField.getClass();

        System.out.println(clazz.getPackage());
        System.out.println(clazz.getName());
        System.out.println(clazz.getSuperclass());
        System.out.println(Arrays.toString(clazz.getInterfaces()));

        System.out.println(Arrays.toString(clazz.getMethods()));

        Method declaredMethod = clazz.getDeclaredMethod("setFont", Font.class);

        declaredMethod.invoke(jTextField, new Font("Arial",Font.BOLD, 32));
    }
}
