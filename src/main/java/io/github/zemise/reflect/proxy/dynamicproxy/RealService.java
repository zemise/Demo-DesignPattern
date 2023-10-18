package io.github.zemise.reflect.proxy.dynamicproxy;

public class RealService implements IService{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
