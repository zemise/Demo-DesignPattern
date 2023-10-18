package io.github.zemise.reflect.proxy.staticproxy;

public class RealService implements IService{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
