package io.github.zemise.reflect.proxy.staticproxy;

public class SimpleStaticProxyDemo {
    public static void main(String[] args) {
        IService realService = new RealService();
        TraceProxy traceProxy = new TraceProxy(realService);

        traceProxy.sayHello();
    }

}
