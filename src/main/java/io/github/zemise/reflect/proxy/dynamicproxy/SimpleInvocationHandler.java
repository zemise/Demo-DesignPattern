package io.github.zemise.reflect.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SimpleInvocationHandler implements InvocationHandler {
    private Object realObj;

    public SimpleInvocationHandler(Object realObj) {
        this.realObj = realObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("entering" + method.getName());

        Object result = method.invoke(realObj, args);

        System.out.println("leaving" + method.getName());

        return result;
    }

    public static <T> T getProxy(Class<T> intf, T realObj) {
        return (T) Proxy.newProxyInstance(intf.getClassLoader(),
                new Class[]{intf},
                new SimpleInvocationHandler(realObj));
    }
}
