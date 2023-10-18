package io.github.zemise.reflect.proxy.dynamicproxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class SimpleDynamicProxyDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        IService realService = new RealService();

        IService proxyService = (IService) Proxy.newProxyInstance(
                IService.class.getClassLoader(), new Class<?>[]{IService.class},
                new SimpleInvocationHandler(realService)
        );
        proxyService.sayHello();


        System.out.println("============");
        // 上面一段等效为以下代码
        Class<?> proxyCls = Proxy.getProxyClass(IService.class.getClassLoader(),
                new Class[]{IService.class}
        );

        Constructor<?> constructor = proxyCls.getConstructor(
                new Class[]{InvocationHandler.class}
        );

        InvocationHandler handler = new SimpleInvocationHandler(realService);
        IService proxySer = (IService) constructor.newInstance(handler);
        proxySer.sayHello();

        System.out.println("===========");
        // 依旧等效
        IService proxy = SimpleInvocationHandler.getProxy(IService.class, realService);
        proxy.sayHello();




    }
}
