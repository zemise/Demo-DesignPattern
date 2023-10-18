package io.github.zemise.reflect.classloader.demo4;

public class HelloImpl_origin implements IHelloService{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
