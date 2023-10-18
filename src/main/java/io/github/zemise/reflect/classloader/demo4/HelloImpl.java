package io.github.zemise.reflect.classloader.demo4;

public class HelloImpl implements IHelloService{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
